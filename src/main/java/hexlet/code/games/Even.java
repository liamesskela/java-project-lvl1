package hexlet.code.games;

import java.util.Scanner;

public class Even {
    public static void even() {
        String returnName = Engine.hello();
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        Scanner scanRnd = new Scanner(System.in);
        final int count = 3;
        final int someInt = 1000;
        int k = 0;
        for (int i = 0; i < count; i++) {
            int rnd = (int) (Math.random() * someInt);
            System.out.println("Question: " + rnd);
            System.out.print("Your answer: ");
            String name = scanRnd.nextLine();

            int numRnd = rnd % 2;
            if (name.equals("yes") && numRnd == 0) {
                    System.out.println("Correct!");
                    k++;
            }
            if (name.equals("no") && numRnd != 0) {
                    System.out.println("Correct!");
                    k++;
            }
            if (!name.equals("yes") && numRnd == 0  || !name.equals("no") && numRnd != 0) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n"
                        + "Let's try again, " + returnName + "!");
                break;
            }
        }
        if (k == count) {
            System.out.println("Congratulations, " + returnName + "!");
        }
    }
}
