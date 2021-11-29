package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void hello() {
        System.out.println("Welcome to the Brain Games!");
        Scanner scanName = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String retString = scanName.nextLine();
        System.out.println("Hello, " + retString + "!");
    }
}
