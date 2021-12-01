package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.HashMap;
import java.util.Map;

public class GCD {

    static final int GENERATE = 3;
    static final String SEND_TERM_TO_ENGINE = "Find the greatest common divisor of given numbers.";

    public static void divider(String sendNameToEngine) {

        Map<String, String> sendQuestionsMapToEngine = new HashMap<>();

        for (int counter = 0; counter < GENERATE; counter++) {

            final int randomInt1 = Utils.getRandomInt();
            final int randomInt2 = Utils.getRandomInt();

            final String question = generateQuestion(randomInt1, randomInt2);
            final int correctAnswer = generateAnswer(randomInt1, randomInt2);

            sendQuestionsMapToEngine.put(question, String.valueOf(correctAnswer));

        }
        Engine.engineOfGame(sendQuestionsMapToEngine, SEND_TERM_TO_ENGINE, sendNameToEngine);
    }

    static String generateQuestion(int randomInt1, int randomInt2) {
        return "Question: " + randomInt1 + " " + randomInt2;
    }

    static int generateAnswer(int x, int y) {
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
