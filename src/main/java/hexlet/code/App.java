package hexlet.code;

import hexlet.code.games.*;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner scanNumber = new Scanner(System.in);
    System.out.println("Please enter the game number and press Enter.");
    System.out.println("1 - Greet");
    System.out.println("2 - Even");
    System.out.println("3 - Calc");
    System.out.println("4 - GCD");
    System.out.println("5 - Progression");
    System.out.println("6 - Prime");
    System.out.println("0 - Exit");

    System.out.print("Your choice: ");
    String name = scanNumber.nextLine();
    System.out.println();

    if (name.equals("1")) {
      Cli.hello();
        return;
    }
    System.out.println("Welcome to the Brain Games!");
    System.out.print("May I have your name? ");
    Scanner scanName = new Scanner(System.in);
    String retString = scanName.nextLine();
    System.out.println("Hello, " + retString + "!");

    switch(name) {
      case "0":
        break;
      case "2":
        Even.even(retString);
        break;
      case "3":
        Calc.calculation(retString);
        break;
      case "4":
        GCD.divider(retString);
        break;
      case "5":
        Progression.progress(retString);
        break;
      case "6":
        Prime.prime(retString);
        break;
    }
  }
}
