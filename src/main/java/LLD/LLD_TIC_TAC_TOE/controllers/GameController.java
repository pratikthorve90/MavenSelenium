package LLD.LLD_TIC_TAC_TOE.controllers;

import LLD.LLD_TIC_TAC_TOE.exceptions.InvalidPlayerException;
import LLD.LLD_TIC_TAC_TOE.models.Board;
import LLD.LLD_TIC_TAC_TOE.models.Game;
import LLD.LLD_TIC_TAC_TOE.models.GameState;
import LLD.LLD_TIC_TAC_TOE.models.Player;
import LLD.LLD_TIC_TAC_TOE.strategies.winningStrategy.WinningStrategy;

import java.util.List;

public class GameController {

    public Game createGame(int dimension,List<WinningStrategy> winningStrategies, List<Player> players) throws InvalidPlayerException {
        return Game.getBuilder()
                .setDimension(dimension)
                .setPlayers(players)
                .setWinningStrategies(winningStrategies)
                .build();
    }

    public void displayBoard(Game game){
        game.displayBoard();
    }

    public void undo(Game game){
        game.undo();
    }

    public void makeMove(Game game){
            game.makeMove();
    }

    public GameState getGameState(Game game){
        return game.getGameState();
    }

    public void printResult(Game game){
        game.printResults();
    }



}
