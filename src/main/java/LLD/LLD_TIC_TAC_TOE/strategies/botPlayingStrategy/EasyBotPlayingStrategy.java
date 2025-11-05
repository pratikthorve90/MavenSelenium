package LLD.LLD_TIC_TAC_TOE.strategies.botPlayingStrategy;

import LLD.LLD_TIC_TAC_TOE.models.Board;
import LLD.LLD_TIC_TAC_TOE.models.Cell;
import LLD.LLD_TIC_TAC_TOE.models.CellState;

import java.util.List;

public class EasyBotPlayingStrategy implements BotPlayingStrategy {
    @Override
    public Cell makeMove(Board board) {
        // Strategy is to return first empty

        for(List<Cell> row: board.getBoard()){
            for(Cell cell: row){
                if(cell.getCellState().equals(CellState.EMPTY)){
                    return cell;
                }
            }
        }

        return null; // Will never be called
    }
}
