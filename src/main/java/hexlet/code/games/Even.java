package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.HashMap;
import java.util.Map;

public class Even {

    static final String SEND_TERM_TO_ENGINE = "Answer 'yes' if number even otherwise answer 'no'.";

    public static void even() {

        Map<String, String> sendQuestionsMapToEngine = new HashMap<>();

        for (int counter = 0; counter < Engine.QUESTIONS; counter++) {

            final int randomInt = Utils.getRandomInt();
            String question = createQuestion(randomInt);
            String correctAnswer = Utils.booleanToString(generateAnswer(randomInt));
            sendQuestionsMapToEngine.put(question, correctAnswer);
        }
        Engine.runGame(sendQuestionsMapToEngine, SEND_TERM_TO_ENGINE);
    }

    public static String createQuestion(int randomInt) {
        return String.valueOf(randomInt);
    }

    private static boolean generateAnswer(int randomInt) {
        return randomInt % 2 == 0;
    }
}
