package hexlet.code.games;

import java.util.Scanner;

public class Progression {
    public static void progress() {
        String returnName = Engine.hello();
        System.out.println("What number is missing in the progression?");
        final int countSmall = 3;
        final int countBig = 9;
        int k = 0;
        String dots = "..";

        for (int i = 0; i < countSmall; i++) {
            final int rndRangeStart = 1;
            final int rndRangeFinish = 10;
            final int rndStartProgression = 1;
            final int rndFinishProgression = 10;
            final int rndStartDots = 1;
            final int rndFinishDots = 10;
            int progressDotInt = 0;
            int rndRangeResult = (int) (Math.random() * (rndRangeFinish - rndRangeStart))
                    + rndRangeStart;
            int rndProgressionResult = (int) (Math.random() * (rndFinishProgression - rndStartProgression))
                    + rndStartProgression;
            int rndDotsResult = (int) (Math.random() * (rndFinishDots - rndStartDots))
                    + rndStartDots;
            System.out.print("Question: ");
            System.out.print(rndProgressionResult + " ");
            for (int j = 0; j < countBig; j++) {
                if (j != rndDotsResult) {
                    rndProgressionResult = rndProgressionResult + rndRangeResult;
                    System.out.print(rndProgressionResult + " ");
                } else {
                    rndProgressionResult = rndProgressionResult + rndRangeResult;
                    progressDotInt = rndProgressionResult;
                    System.out.print(dots + " ");
                }
            }
            System.out.println();
            System.out.print("Your answer: ");
            Scanner scanInt = new Scanner(System.in);
            int num = scanInt.nextInt();
            if (num == progressDotInt) {
                System.out.println("Correct!");
                k++;
            } else {
                System.out.println("'" + num + "' is wrong answer ;(. Correct answer was '" + progressDotInt + "'.\n"
                        + "Let's try again, " + returnName + "!");
                break;
            }
        }
            if (k == countSmall) {
            System.out.println("Congratulations, " + returnName + "!");
        }
    }
}
