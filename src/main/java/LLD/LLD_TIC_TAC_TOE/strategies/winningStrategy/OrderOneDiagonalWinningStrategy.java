package LLD.LLD_TIC_TAC_TOE.strategies.winningStrategy;

import LLD.LLD_TIC_TAC_TOE.models.Board;
import LLD.LLD_TIC_TAC_TOE.models.Move;
import LLD.LLD_TIC_TAC_TOE.models.Player;
import LLD.LLD_TIC_TAC_TOE.models.Symbol;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Order one cause this O(1) time complexity strategy
public class OrderOneDiagonalWinningStrategy implements WinningStrategy {
    private final Map<Symbol, Integer> leftDiagMap;
    private final Map<Symbol, Integer> rightDiagMap;

    public OrderOneDiagonalWinningStrategy(List<Player> players) {
        leftDiagMap = new HashMap<>();
        rightDiagMap = new HashMap<>();

        for (Player player: players) {
            leftDiagMap.put(player.getSymbol(), 0);
            rightDiagMap.put(player.getSymbol(), 0);
        }
    }

    @Override
    public boolean checkWinner(Board board, Move move) {
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        Symbol symbol = move.getPlayer().getSymbol();

        // We can do validation directly here , but we shall avoid it , because if we declare the winner
        // The map will be left in inconsistent state , we do not want that.
        if (row == col) {
            leftDiagMap.put(symbol, leftDiagMap.get(symbol) + 1);
        }

        if (row + col == board.getSize() - 1) {
            rightDiagMap.put(symbol, rightDiagMap.get(symbol) + 1);
        }

        if (row == col) {
            if (leftDiagMap.get(symbol) == board.getSize()) {
                return true;
            }
        }

        if (row + col == board.getSize() - 1) {
            if (rightDiagMap.get(symbol) == board.getSize()) {
                return true;
            }
        }

        return false;
    }

    @Override
    public void undo(Board board, Move move) {

        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        Symbol symbol = move.getPlayer().getSymbol();

        if (row == col) {
            leftDiagMap.put(
                    symbol, leftDiagMap.get(symbol) - 1
            );
        }

        if (row + col == board.getSize() - 1) {
            rightDiagMap.put(
                    symbol, rightDiagMap.get(symbol) - 1
            );
        }
    }

}
