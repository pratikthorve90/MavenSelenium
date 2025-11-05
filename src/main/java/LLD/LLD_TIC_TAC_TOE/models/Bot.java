package LLD.LLD_TIC_TAC_TOE.models;

import LLD.LLD_TIC_TAC_TOE.strategies.botPlayingStrategy.BotPlayingStrategy;
import LLD.LLD_TIC_TAC_TOE.strategies.botPlayingStrategy.BotPlayingStrategyFactory;

public class Bot extends Player{

    private BotDifficultyLevel difficulty;
    private BotPlayingStrategy botPlayingStrategy;


    public Bot(Symbol symbol, String name, BotDifficultyLevel difficulty) {
        super(symbol, name, PlayerType.BOT);
        this.difficulty = difficulty;
        this.botPlayingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategy(difficulty);
    }

    public BotDifficultyLevel getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(BotDifficultyLevel difficulty) {
        this.difficulty = difficulty;
    }

    @Override
    public Cell makeMove(Board board){
            return botPlayingStrategy.makeMove(board);
    }
}
