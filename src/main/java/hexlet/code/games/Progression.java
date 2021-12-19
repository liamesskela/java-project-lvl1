package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.HashMap;
import java.util.Map;

public class Progression {

    static final String RULES = "What number is missing in the progression?";
    static final int LENGTH_PROGRESSION = 10;
    static final int MAX_STEP = 12;

    public static int toNowHiddenNum(int startNumOfProgression, int indexOfHiddenNum, int step) {
        return startNumOfProgression + step * indexOfHiddenNum;
    }
    public static void progress() {
        Map<String, String> questionToAnswer = new HashMap<>();
        for (int counter = 0; counter < Engine.QUESTIONS; counter++) {

            int indexOfHiddenNum = Utils.getRandomInt(LENGTH_PROGRESSION);
            int startNumOfProgression = Utils.getRandomInt();
            int step = Utils.getRandomInt(MAX_STEP);
            int hiddenNum = toNowHiddenNum(startNumOfProgression, indexOfHiddenNum, step);
            String question = generateQuestion(startNumOfProgression, indexOfHiddenNum, step);
            questionToAnswer.put(question, String.valueOf(hiddenNum));
        }
        Engine.runGame(questionToAnswer, RULES);
    }


    public static String generateQuestion(int startNumOfProgression, int indexOfHiddenNum, int step) {

        StringBuilder stringBuilder = new StringBuilder();
        for (int counter = 0; counter < LENGTH_PROGRESSION; counter++) {
            if (counter == indexOfHiddenNum) {
                stringBuilder.append(" ..");
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
