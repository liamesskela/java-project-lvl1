package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.HashMap;
import java.util.Map;

public class Prime {

    static final int QUESTIONS = 3;
    static final String sendTermToEngine = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void prime(String sendNameToEngine) {

        Map<String, String> sendQuestionsMapToEngine = new HashMap<>();
        for (int counter = 0; counter < QUESTIONS; counter++) {
            final int randomInt = Utils.getRandomInt();
            final String question = generateQuestion(randomInt);
            boolean isPrime = generateAnswer(randomInt);
            sendQuestionsMapToEngine.put(question, Utils.booleanToString(isPrime));
        }
        Engine.engineOfGame(sendQuestionsMapToEngine, sendTermToEngine, sendNameToEngine);
    }

    static String generateQuestion(int randomInt) {
        return "Question: " + randomInt;
    }

    private static boolean generateAnswer(int randomInt) {
        if (randomInt < 2) {
        return false;
        }
        for (int k = 2; k <= Math.sqrt(randomInt); k++) {
            if ((randomInt % k) == 0) {
                return false;
            }
        }
        return true;
    }
}
