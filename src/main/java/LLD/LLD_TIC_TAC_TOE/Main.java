package LLD.LLD_TIC_TAC_TOE;

import LLD.LLD_TIC_TAC_TOE.controllers.GameController;
import LLD.LLD_TIC_TAC_TOE.models.*;
import LLD.LLD_TIC_TAC_TOE.strategies.winningStrategy.OrderOneColumnWinningStrategy;
import LLD.LLD_TIC_TAC_TOE.strategies.winningStrategy.OrderOneDiagonalWinningStrategy;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Create a game
        GameController gameController = new GameController();
        Game game;
        int dimension = 3;
        List<Player> players = List.of(
                new Player(new Symbol('X'), "Pratik", PlayerType.HUMAN),
                new Bot(new Symbol('O'),"BOT", BotDifficultyLevel.EASY)
        );

        try{
            game = gameController.createGame(dimension,
                    List.of(
                            new OrderOneColumnWinningStrategy(dimension, players),
                            new OrderOneColumnWinningStrategy(dimension, players),
                            new OrderOneDiagonalWinningStrategy(players)),
                    players
                    );
        }catch (Exception e){
            System.out.println(e.getMessage() + "Something went wrong");
            return;
        }
        System.out.println(" ---------- Game is Starting , Hold your Breath ---------- ");
        Scanner scanner = new Scanner(System.in);

        // while Game status in progress
        while(gameController.getGameState(game) == GameState.IN_PROGRESS){

            System.out.println("This is how the current board looks like : ");
            gameController.displayBoard(game);

            System.out.println("Do you want to undo ? (y/n)");
            String input = scanner.next();
            if(input.equals("y")){
                gameController.undo(game);
            }
            else{
                gameController.makeMove(game);
            }

            GameState gameState = gameController.getGameState(game);
            if(gameState == GameState.ENDED){
                System.out.println("Game has ended successfully");
                gameController.displayBoard(game);
                gameController.printResult(game);
            }
            else if (gameState == GameState.DRAW){
                System.out.println("Game is draw");
                gameController.displayBoard(game);
            }
        }
    }
}
