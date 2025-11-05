package LLD.LLD_TIC_TAC_TOE.models;

import LLD.LLD_TIC_TAC_TOE.exceptions.InvalidPlayerException;
import LLD.LLD_TIC_TAC_TOE.strategies.winningStrategy.WinningStrategy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Game {

    // Always create all attributes as private
    // Have getter and setter for them
    // Ensure all attributes are initialized in constructor

    private List<Move> moves;
    private Board board;
    private List<Player> players;
    private int currentMovePlayerIndex;
    private List<WinningStrategy> winningStrategies;
    private GameState gameState;
    private Player winner;

    private Game(int dimension , List<Player> players,List<WinningStrategy> winningStrategies){
        this.moves = new ArrayList<>();
        this.board = new Board(dimension);
        this.players = players;
        this.currentMovePlayerIndex = 0;
        this.winningStrategies = winningStrategies;
        this.gameState = GameState.IN_PROGRESS;

    }

    public static Builder getBuilder(){
        return new Builder();
    }

    private Boolean validateMove(Cell cell){
        int row = cell.getRow();
        int col = cell.getCol();

        if(row >= board.getSize() || col > board.getSize() || row < 0 || col < 0){
            return false;
        }

        if(board.getBoard().get(row).get(col).getCellState().equals(CellState.EMPTY))
        {
            return true;
        }
        return false;
    }

    public void undo(){

        if(moves.isEmpty()){
            throw new IllegalStateException("There is no move to undo");
        }
        else{
            Move lastMove = moves.get(moves.size()-1);
            for(WinningStrategy winningStrategy : winningStrategies){
                winningStrategy.undo(board, lastMove);
            }
            Cell lastCell = lastMove.getCell();
            lastCell.setCellState(CellState.EMPTY);
            lastMove.setPlayer(null);
        }

        moves.add(moves.get(moves.size()-1));

        // Move the control to next player
        currentMovePlayerIndex -= 1;
        currentMovePlayerIndex += players.size();
        currentMovePlayerIndex %= players.size();

        // Update the map that are present in winning strategies



    }

    public void makeMove(){

        Player currentPlayer = players.get(currentMovePlayerIndex);
        System.out.println("The current player is " + currentPlayer.getName());

        Cell proposedCell = currentPlayer.makeMove(board);

        System.out.println("Move made at row: " + proposedCell.getRow() + " and col: " + proposedCell.getCol());

        // Validate move
        if(!validateMove(proposedCell)){
            System.out.println("Invalid move. Retry.");
            return;
        }

        // If move valid then add to board
        Cell cellInBoard = board.getBoard().get(proposedCell.getRow()).get(proposedCell.getCol());
        cellInBoard.setCellState(CellState.FILLED);
        cellInBoard.setPlayer(currentPlayer);

        // Add to list to support undo
        Move move = new Move(currentPlayer, cellInBoard);
        moves.add(move);

        // Check if move makes the current player winner
        for(WinningStrategy winningStrategy : winningStrategies){
            if(winningStrategy.checkWinner(board,move)){
                gameState = GameState.ENDED;
                winner = currentPlayer;
                return;
            }
        }

        // Check if game is draw , that is board is filled
        if(moves.size() == board.getSize() * board.getSize()){
            gameState = GameState.DRAW;
            return;
        }

        // Move the control to next player
        currentMovePlayerIndex += 1;
        currentMovePlayerIndex %= players.size();
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public int getCurrentMovePlayerIndex() {
        return currentMovePlayerIndex;
    }

    public void setCurrentMovePlayerIndex(int currentMovePlayerIndex) {
        this.currentMovePlayerIndex = currentMovePlayerIndex;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public void displayBoard(){
        this.board.printBoard();
    }


    public void printResults(){
        if(getGameState() == GameState.ENDED){
            System.out.println("The game has ended");
            System.out.println("The game winner is " + this.winner.getName());
        }else {
            System.out.println("The game is draw");
        }
    }


    public static class Builder{

        private List<Player> players;
        private List<WinningStrategy> winningStrategies;
        private int dimension;

        private Builder() {} ;

        private boolean valid(){

            if(this.players.size() < 2 || this.players.size() != dimension -1){
                return false;
            }

            int botCount = 0;
            for(Player player : players){
                if(player.getType().equals(PlayerType.BOT)){
                    botCount++;
                }
            }
            if(botCount >=2 || botCount ==0){
                return false;
            }

            Set<Character> existingSymbols = new HashSet<>();
            for(Player player : players){
                if(existingSymbols.contains(player.getSymbol().getaChar())){
                    return false;
                }
                existingSymbols.add(player.getSymbol().getaChar());
            }

            return true;
        }


        public  Game build() throws InvalidPlayerException {
            if(!valid()){
                throw new InvalidPlayerException("Invalid no of players received");
            }
            return new Game(dimension, players, winningStrategies);
        }

        public List<Player> getPlayers() {
            return players;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public List<WinningStrategy> getWinningStrategies() {
            return winningStrategies;
        }

        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }

        public int getDimension() {
            return dimension;
        }

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }
    }


}
