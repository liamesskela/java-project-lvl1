package hexlet.code.games;

import java.util.Scanner;

public class Engine {
    public static String hello() {
        System.out.println("Welcome to the Brain Games!");
        Scanner scanName = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String retString = scanName.nextLine();
        System.out.println("Hello, " + retString + "!");
        return retString;
    }


}
