package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.HashMap;
import java.util.Map;

public class GCD {

    static final String SEND_TERM_TO_ENGINE = "Find the greatest common divisor of given numbers.";

    public static void divider() {

        Map<String, String> questionToAnswer = new HashMap<>();

        for (int counter = 0; counter < Engine.QUESTIONS; counter++) {

            final int randomInt1 = Utils.getRandomInt();
            final int randomInt2 = Utils.getRandomInt();

            final String question = buildQuestion(randomInt1, randomInt2);
            final int correctAnswer = findGDC(randomInt1, randomInt2);

            questionToAnswer.put(question, String.valueOf(correctAnswer));

        }
        Engine.runGame(questionToAnswer, SEND_TERM_TO_ENGINE);
    }

    static String buildQuestion(int randomInt1, int randomInt2) {
        return " " + randomInt1 + " " + randomInt2;
    }

    static int findGDC(int x, int y) {
        while (x != 0 && y != 0) {
            if (x > y) {
                x = x % y;
            } else {
                y = y % x;
            }
        }
        return x + y;

    }
}
