package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.HashMap;
import java.util.Map;

public class Even {
    public static void even(String sendNameToEngine) {
        String sendTermToEngine = "Answer 'yes' if number even otherwise answer 'no'.";
        final int QUESTIONS = 3;

        Map<String, String> sendQuestionsToEngine = new HashMap<>();

        for (int questionsGenerate = 0; questionsGenerate < QUESTIONS; questionsGenerate++) {
            final int randomInt = Utils.getRandomInt();
            String question = createQuestion(randomInt);
            String correctAnswer = Utils.booleanToString(generateAnswer(randomInt));
            sendQuestionsToEngine.put(question, correctAnswer);
        }
        Engine.engineOfGame(sendQuestionsToEngine, sendTermToEngine, sendNameToEngine);
    }

    public static String createQuestion(int randomInt) {
        return "Question: " + randomInt;
    }

    private static boolean generateAnswer(int randomInt) {
        return randomInt % 2 == 0;
    }
}
