package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.HashMap;
import java.util.Map;

public class GCD {

    static final int GENERATE = 3;
    static final String sendTermToEngine = "Find the greatest common divisor of given numbers.";

    public static void divider(String sendNameToEngine) {

        Map<String, String> sendQuestionsMapToEngine = new HashMap<>();

        for (int counter = 0; counter < GENERATE; counter++) {

            final int random_Int_1 = Utils.getRandomInt();
            final int random_Int_2 = Utils.getRandomInt();

            final String question = generateQuestion(random_Int_1, random_Int_2);
            final int correctAnswer = generateAnswer(random_Int_1, random_Int_2);

            sendQuestionsMapToEngine.put(question, String.valueOf(correctAnswer));

        }
        Engine.engineOfGame(sendQuestionsMapToEngine, sendTermToEngine, sendNameToEngine);
    }

    static String generateQuestion(int random_Int_1, int random_Int_2) {
        return "Question: " + random_Int_1 + " " + random_Int_2;
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
