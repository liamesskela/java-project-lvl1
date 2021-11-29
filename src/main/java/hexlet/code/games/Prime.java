package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Prime {
    public static void prime(String receivedName) {
        String returnName = receivedName;
        int k = 0;
        final int count = 3;
        final int startRange = 1;
        final int finishRange = 2_147; //_483_647;
        String yesAnswer = "yes";
        String noAnswer = "no";
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");


        for (int i = 0; i < count; i++) {
            Scanner scanPrime = new Scanner(System.in);
            String primeTrueOrFalse = "";
            int primeRangeResult = (int) (Math.random() * (finishRange - startRange))
                    + startRange;
            System.out.println("Question: " + primeRangeResult);
            System.out.print("Your answer: ");
            String name = scanPrime.nextLine();
            for (int j = 2; j <= primeRangeResult / 2; j++) {
                if (primeRangeResult % j == 0) {
                    primeTrueOrFalse = "no";
                    break;
                } else {
                    primeTrueOrFalse = "yes";
                }
            }
            if (primeTrueOrFalse.equals(name)) {
                System.out.println("Correct!");
                k++;
            } else {
                System.out.println("'" + name + "' is wrong answer ;(. Correct answer was '" + primeTrueOrFalse + "'.\n"
                        + "Let's try again, " + returnName + "!");
                break;
            }
            if (k == count) {
                System.out.println("Congratulations, " + returnName + "!");
            }
        }
    }
}
