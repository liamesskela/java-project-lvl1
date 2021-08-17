package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void hello() {
        Scanner scanName = new Scanner(System.in);
        System.out.println("May I have your name?");
        String name = scanName.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
