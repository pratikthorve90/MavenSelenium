package LLD.LLD_TIC_TAC_TOE.models;

import java.util.Scanner;

public class Player {

    private Symbol symbol;
    private String name;
    private PlayerType type;
    private Scanner scanner;

    public Player(Symbol symbol, String name, PlayerType type) {
        this.symbol = symbol;
        this.name = name;
        this.type = type;
        this.scanner = new Scanner(System.in);
    }

    public Cell makeMove(Board board){
        System.out.println("Enter the row number , starting from 0");
        int row = scanner.nextInt();
        System.out.println("Enter the column number , starting from 0");
        int col = scanner.nextInt();
        return new Cell(row, col);
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayerType getType() {
        return type;
    }

    public void setType(PlayerType type) {
        this.type = type;
    }
}

