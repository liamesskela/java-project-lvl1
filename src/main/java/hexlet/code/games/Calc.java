package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Calc {
    static final int QUESTIONS = 3;
    static final int OPERATIONS = 3;

    public static void calculation(String sendNameToEngine) {
        String sendTermToEngine = " What is the result of the expression?";
        Map<String, String> sendQuestionsMapToEngine = new HashMap<>();
        for (int counter = 0; counter < QUESTIONS; counter++) {

            final int randomInt1 = Utils.getRandomInt();
            final int randomInt2 = Utils.getRandomInt();
            final int randomCalculation = getRandomOperation();

            String question = generateQuestions(randomInt1, randomInt2, randomCalculation);
            int correctAnswer = generateAnswers(randomInt1, randomInt2, randomCalculation);
            sendQuestionsMapToEngine.put(question, String.valueOf(correctAnswer));
        }

        Engine.engineOfGame(sendQuestionsMapToEngine, sendTermToEngine, sendNameToEngine);
    }

    public static String generateQuestions(int randomInt1, int randomInt2, int randomOperation) {

        return "Question: " + randomInt1 + " " + getOperationOfString(randomOperation)
                + " " + randomInt2;
    }

    static int getRandomOperation() {
        Random randomInt = new Random();
        return randomInt.nextInt(OPERATIONS);
    }

    static String getOperationOfString(int operation) {
        switch (operation) {
            case 0:
                return "+";
            case 1:
                return "-";
            case 2:
                return "*";
            default:
                return "Something went wrong";
        }
    }

    static int generateAnswers(int randomInt1, int randomInt2, int operation) {
        switch (operation) {
            case 0:
                return randomInt1 + randomInt2;
            case 1:
                return randomInt1 - randomInt2;
            case 2:
                return randomInt1 * randomInt2;
            default:
                return 0;
        }
    }

}
