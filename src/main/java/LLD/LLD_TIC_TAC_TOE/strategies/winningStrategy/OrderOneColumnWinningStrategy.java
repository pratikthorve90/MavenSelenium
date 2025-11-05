package LLD.LLD_TIC_TAC_TOE.strategies.winningStrategy;

import LLD.LLD_TIC_TAC_TOE.models.Board;
import LLD.LLD_TIC_TAC_TOE.models.Move;
import LLD.LLD_TIC_TAC_TOE.models.Player;
import LLD.LLD_TIC_TAC_TOE.models.Symbol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


// Order one cause this O(1) time complexity strategy
public class OrderOneColumnWinningStrategy implements WinningStrategy {
    private List<Map<Symbol, Integer>> colMaps;

    public OrderOneColumnWinningStrategy(int size, List<Player> players) {
        colMaps = new ArrayList<>();
        for (int i = 0; i < size; ++i) {
            colMaps.add(new HashMap<>());
            for (Player player: players) {
                colMaps.get(i).put(player.getSymbol(), 0);
            }
        }
    }

    @Override
    public boolean checkWinner(Board board, Move move) {
        int col = move.getCell().getCol();
        Symbol symbol = move.getPlayer().getSymbol();

        colMaps.get(col).put(
                symbol, 1 + colMaps.get(col).get(symbol)
        );

        if (colMaps.get(col).get(symbol) == board.getSize()) {
            return true;
        }

        return false;
    }

    @Override
    public void undo(Board board, Move move) {
        int col = move.getCell().getCol();
        Symbol symbol = move.getPlayer().getSymbol();
        colMaps.get(col).put(symbol, colMaps.get(col).get(symbol) - 1);

    }

}
