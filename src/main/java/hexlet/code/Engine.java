package hexlet.code;

import java.util.Map;
import java.util.Scanner;

public class Engine {
    public static final int QUESTIONS = 3;

    public static void runGame(Map<String, String> questionsToAnswers, String term) {


        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanName = new Scanner(System.in);
        String sentName = scanName.nextLine();
        System.out.println("Hello, " + sentName + "!");
        System.out.println(term);
        for (Map.Entry<String, String> questionAndAnswer : questionsToAnswers.entrySet()) {
            System.out.println("Question:" + questionAndAnswer.getKey());
            System.out.print("Your answer: ");
            Scanner scanAnswer = new Scanner(System.in);
            String receivedAnswer = scanAnswer.next();

            if (receivedAnswer.equals(questionAndAnswer.getValue())) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + receivedAnswer + "'" + " is wrong answer ;(. "
                        + "Correct answer was " + "'" + questionAndAnswer.getValue() + "'");
                System.out.println("Let's try again, " + sentName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + sentName + "!");
    }
}



