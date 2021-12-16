package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.HashMap;
import java.util.Map;

public class Progression {

    static final String SEND_TERM_TO_ENGINE = "What number is missing in the progression?";
    static final int LENGTH_PROGRESSION = 10;
    static final int MAX_STEP = 12;
    private static int hiddenNum;

    public static void progress() {
        Map<String, String> sendQuestionsMapToEngine = new HashMap<>();
        for (int counter = 0; counter < Engine.QUESTIONS; counter++) {

            int indexOfHiddenNum = Utils.getRandomInt(LENGTH_PROGRESSION);
            int startNumOfProgression = Utils.getRandomInt();
            int step = Utils.getRandomInt(MAX_STEP);

            String question = generateQuestion(startNumOfProgression, indexOfHiddenNum, step);
            sendQuestionsMapToEngine.put(question, String.valueOf(hiddenNum));
        }
        Engine.runGame(sendQuestionsMapToEngine, SEND_TERM_TO_ENGINE);
    }
    public static String generateQuestion(int startNumOfProgression, int indexOfHiddenNum, int step) {

        StringBuilder stringBuilder = new StringBuilder();
        for (int counter = 0; counter < LENGTH_PROGRESSION; counter++) {
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
