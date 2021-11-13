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
    }
    if (name.equals("2")) {
      Even.even();
    }
    if (name.equals("3")) {
      Calc.calculation();
    }
    if (name.equals("4")) {
      GCD.divider();
    }
    if (name.equals("5")) {
      Progression.progress();
    }
    if (name.equals("6")) {
      Prime.prime();
    }
  }
}
