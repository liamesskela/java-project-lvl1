package hexlet.code;

import java.util.Map;
import java.util.Scanner;

public class Engine {

    public static void engineOfGame(Map<String, String> questions, String term, String nameOfUser) {
        System.out.println(term);

        for (Map.Entry<String, String> entry : questions.entrySet()) {
            System.out.println(entry.getKey());
            System.out.print("Your answer: ");
            Scanner scanAnswer = new Scanner(System.in);
            String receivedAnswer = scanAnswer.next();

            if (receivedAnswer.equals(entry.getValue())) {
                System.out.println("Correct!");
                }
            else {
                System.out.println(receivedAnswer + " is wrong answer ;(. Correct answer was " + entry.getValue());
                System.out.println("Let's try again, " + nameOfUser + "!");
                return;
                }
            }
        System.out.println("Congratulations, " + nameOfUser + "!");
    }
}



