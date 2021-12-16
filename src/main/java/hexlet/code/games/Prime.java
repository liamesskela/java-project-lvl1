package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.HashMap;
import java.util.Map;

public class Prime {

    static final String SEND_TERM_TO_ENGINE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void prime() {

        Map<String, String> sendQuestionsMapToEngine = new HashMap<>();
        for (int counter = 0; counter < Engine.QUESTIONS; counter++) {
            final int randomInt = Utils.getRandomInt();
            final String question = generateQuestion(randomInt);
            boolean isPrime = generateAnswer(randomInt);
            sendQuestionsMapToEngine.put(question, Utils.booleanToString(isPrime));
        }
        Engine.runGame(sendQuestionsMapToEngine, SEND_TERM_TO_ENGINE);
    }

    static String generateQuestion(int randomInt) {
        return " " + randomInt;
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
