package hexlet.code.games;

import java.util.Scanner;

public class Calc {
    public static void calculation() {
        String multiplyString = " * ";
        String plusString = " + ";
        String minusString = " - ";
        String result = "";
        String returnName = Engine.hello();
        System.out.println("What is the result of the expression?");
        final int count = 3;
        final int someInt = 12;
        int k = 0;
        for (int i = 0; i < count; i++) {
            int rndFirst = (int) (Math.random() * someInt);
            int rndSecond = (int) (Math.random() * someInt);
            final int a = 1;
            final int b = 4;
            int rndMath = (int) (Math.random() * (b - a)) + a;
            if (rndMath == 1) {
                result = multiplyString;
            }
            if (rndMath == 2) {
                result = plusString;
            }
            if (rndMath == count) {
                result = minusString;
            }
            Scanner scanInt = new Scanner(System.in);
            System.out.println("Question: " + rndFirst + result + rndSecond);
            System.out.print("Your answer: ");
            int num = scanInt.nextInt();
            int resMult = 0;
            int resPluss = 0;
            int resMinus = 0;
            if (result.equals(multiplyString)) {
                resMult = rndFirst * rndSecond;
                if (resMult == num) {
                    System.out.println("Correct!");
                    k++;
                } else {
                    System.out.println("'" + num + "' is wrong answer ;(. Correct answer was '" + resMult + "'.\n"
                            + "Let's try again, " + returnName + "!");
                    break;
                }
            }
            if (result.equals(plusString)) {
                resPluss = rndFirst + rndSecond;
                if (resPluss == num) {
                    System.out.println("Correct!");
                    k++;
                } else {
                    System.out.println("'" + num + "' is wrong answer ;(. Correct answer was '" + resPluss + "'.\n"
                            + "Let's try again, " + returnName + "!");
                    break;
                }
            }
            if (result.equals(minusString)) {
                resMinus = rndFirst - rndSecond;
                if (resMinus == num) {
                    System.out.println("Correct!");
                    k++;
                } else {
                    System.out.println("'" + num + "' is wrong answer ;(. Correct answer was '" + resMinus + "'.\n"
                            + "Let's try again, " + returnName + "!");
                    break;
                }
            }
        }
        if (k == count) {
            System.out.println("Congratulations, " + returnName + "!");
        }
    }
}
