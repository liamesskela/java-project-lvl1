package hexlet.code.games;

import java.util.Scanner;

public class GCD {
    public static void divider() {
        String returnName = Engine.hello();
        System.out.println("Find the greatest common divisor of given numbers.");
        final int count = 3;
        final int someInt = 100;
        int k = 0;
        int bigDiv;
        for (int i = 0; i < count; i++) {
            int rndFirst = (int) (Math.random() * someInt);
            int rndSecond = (int) (Math.random() * someInt);
            System.out.println("Question: " + rndFirst + " " + rndSecond);
            System.out.print("Your answer: ");
            Scanner scanInt = new Scanner(System.in);
            int num = scanInt.nextInt();
            if (rndFirst == 0) {
                bigDiv = rndSecond;
            } else {
                while (rndSecond != 0) {
                    if (rndFirst > rndSecond) {
                        rndFirst = rndFirst - rndSecond;
                    } else {
                        rndSecond = rndSecond - rndFirst;
                    }
                }
                bigDiv = rndFirst;
            }
            k++;
            if (bigDiv == num) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + num + "' is wrong answer ;(. Correct answer was '" + bigDiv + "'.\n"
                    + "Let's try again, " + returnName + "!");
            break;
        }

        }
        if (k == count) {
            System.out.println("Congratulations, " + returnName + "!");
        }

    }
}
