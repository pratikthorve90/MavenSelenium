package LLD.LLD_TIC_TAC_TOE.strategies.botPlayingStrategy;

import LLD.LLD_TIC_TAC_TOE.models.Board;
import LLD.LLD_TIC_TAC_TOE.models.Cell;

public interface BotPlayingStrategy {

    Cell makeMove(Board board);

}
