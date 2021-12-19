package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.HashMap;
import java.util.Map;

public class Even {

    static final String RULES = "Answer 'yes' if number even otherwise answer 'no'.";

    public static void even() {

        Map<String, String> questionToAnswer = new HashMap<>();

        for (int counter = 0; counter < Engine.QUESTIONS; counter++) {

            final int randomInt = Utils.getRandomInt();
            String question = createQuestion(randomInt);
            String correctAnswer = Utils.booleanToString(isEven(randomInt));
            questionToAnswer.put(question, correctAnswer);
        }
        Engine.runGame(questionToAnswer, RULES);
    }

    public static String createQuestion(int randomInt) {
        return " " + randomInt;
    }

    static boolean isEven(int randomInt) {
        return randomInt % 2 == 0;
    }
}
