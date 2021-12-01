package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.HashMap;
import java.util.Map;

public class Progression {

    static final String sendTermToEngine = "What number is missing in the progression?";
    static final int LENGTH_PROGRESSION = 10;
    static final int MAX_STEP = 12;
    static final int GENERATE = 3;
    static public int hiddenNum ;
    public static void progress(String sendNameToEngine) {
        Map<String, String> sendQuestionsMapToEngine = new HashMap<>();
        for (int counter = 0; counter < GENERATE; counter++) {

            int indexOfHiddenNum = Utils.getRandomInt(LENGTH_PROGRESSION);
            int startNumOfProgression = Utils.getRandomInt();
            int step = Utils.getRandomInt(MAX_STEP);

            String question = generateQuestion(startNumOfProgression, indexOfHiddenNum, step);
            sendQuestionsMapToEngine.put(question, String.valueOf(hiddenNum));
        }
        Engine.engineOfGame(sendQuestionsMapToEngine, sendTermToEngine, sendNameToEngine);
    }
    public static String generateQuestion(int startNumOfProgression, int indexOfHiddenNum, int step) {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Question:");
        for (int counter = 0; counter < LENGTH_PROGRESSION ; counter++) {
            if (counter == indexOfHiddenNum) {
                stringBuilder.append(" ..");
                hiddenNum = startNumOfProgression + (step * counter);
            } else {
                stringBuilder.append(" ").append(calcProgression(startNumOfProgression, step, counter));
            }
        }
        return stringBuilder.toString();
    }

    static int calcProgression(int begin, int step, int counter) {
        return begin + (step * counter);

    }
}
