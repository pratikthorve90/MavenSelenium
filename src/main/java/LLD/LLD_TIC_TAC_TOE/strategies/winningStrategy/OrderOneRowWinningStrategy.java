package LLD.LLD_TIC_TAC_TOE.strategies.winningStrategy;

import LLD.LLD_TIC_TAC_TOE.models.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Order one cause this O(1) time complexity strategy
public class OrderOneRowWinningStrategy implements WinningStrategy {

    // For each row we will create a map
    // Map will look like {Symbol : Count , Symbol : Count .... depends on no of players}
    // In constructor we need to initialise all this
    private List<Map<Symbol, Integer>> rowMaps;

    public OrderOneRowWinningStrategy(int size, List<Player> players) {
        this.rowMaps = new ArrayList<>();
        for(int i = 0; i < size; i++){
            rowMaps.add(new HashMap<>());
            for(Player player : players){
                rowMaps.get(i).put(player.getSymbol(), i);
            }
        }
    }


    @Override
    public boolean checkWinner(Board board, Move move) {

        int row = move.getCell().getRow();
        Symbol symbol = move.getPlayer().getSymbol();

        // Update the count

        rowMaps.get(row).put(symbol, rowMaps.get(row).get(symbol) + 1);

        // Check if win
        return rowMaps.get(row).get(symbol) == board.getSize();
    }

    @Override
    public void undo(Board board, Move move) {
            int row = move.getCell().getRow();
            Symbol symbol = move.getPlayer().getSymbol();
            rowMaps.get(row).put(symbol, rowMaps.get(row).get(symbol) - 1);
    }
}
