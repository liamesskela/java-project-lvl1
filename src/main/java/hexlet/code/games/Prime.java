package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.HashMap;
import java.util.Map;

public class Prime {

    static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void prime() {

        Map<String, String> questionToAnswer = new HashMap<>();
        for (int counter = 0; counter < Engine.QUESTIONS; counter++) {
            final int randomInt = Utils.getRandomInt();
            final String question = generateQuestion(randomInt);
            boolean isPrime = isPrime(randomInt);
            questionToAnswer.put(question, Utils.booleanToString(isPrime));
        }
        Engine.runGame(questionToAnswer, RULES);
    }

    static String generateQuestion(int randomInt) {
        return " " + randomInt;
    }

    private static boolean isPrime(int randomInt) {
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
