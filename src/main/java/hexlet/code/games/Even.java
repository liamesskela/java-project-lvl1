package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.HashMap;
import java.util.Map;

public class Even {
    public static void even(String sendNameToEngine) {
        String sendTermToEngine = "Answer 'yes' if number even otherwise answer 'no'.";
        final int QUESTIONS = 3;

        Map<String, String> sendQuestionsMapToEngine = new HashMap<>();

        for (int counter = 0; counter < QUESTIONS; counter++) {

            final int randomInt = Utils.getRandomInt();
            String question = createQuestion(randomInt);
            String correctAnswer = Utils.booleanToString(generateAnswer(randomInt));
            sendQuestionsMapToEngine.put(question, correctAnswer);
        }
        Engine.engineOfGame(sendQuestionsMapToEngine, sendTermToEngine, sendNameToEngine);
    }

    public static String createQuestion(int randomInt) {
        return "Question: " + randomInt;
    }

    private static boolean generateAnswer(int randomInt) {
        return randomInt % 2 == 0;
    }
}
