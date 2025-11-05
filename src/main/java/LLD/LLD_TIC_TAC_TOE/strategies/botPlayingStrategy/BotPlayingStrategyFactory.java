package LLD.LLD_TIC_TAC_TOE.strategies.botPlayingStrategy;

import LLD.LLD_TIC_TAC_TOE.models.BotDifficultyLevel;

import static LLD.LLD_TIC_TAC_TOE.models.BotDifficultyLevel.*;

public class BotPlayingStrategyFactory {

    public static BotPlayingStrategy getBotPlayingStrategy(BotDifficultyLevel difficultyLevel){

        // Since we plan to not implement all strategy , just returning new easy bot strategy

        return new EasyBotPlayingStrategy();


//        switch (difficultyLevel) {
//            case EASY:
//                return new EasyBotPlayingStrategy();
//            case MEDIUM:
//                return new MediumBotPlayingStrategy();
//            case HARD:
//                return new HardBotPlayingStrategy();
//            default:
//                return new EasyBotPlayingStrategy();
//        }
    }
}
