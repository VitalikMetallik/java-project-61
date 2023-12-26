
package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    private static final int GAME_CHOICE_GREET = 1;
    private static final int GAME_CHOICE_EVEN = 2;
    private static final int GAME_CHOICE_CALC = 3;
    private static final int GAME_CHOICE_GCD = 4;
    private static final int GAME_CHOICE_PROGRESSION = 5;
    private static final int GAME_CHOICE_PRIME = 6;
    private static final int GAME_CHOICE_EXIT = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println(GAME_CHOICE_GREET + " - Greet");
        System.out.println(GAME_CHOICE_EVEN + " - Even");
        System.out.println(GAME_CHOICE_CALC + " - Calc");
        System.out.println(GAME_CHOICE_GCD + " - GCD");
        System.out.println(GAME_CHOICE_PROGRESSION + " - Progression");
        System.out.println(GAME_CHOICE_PRIME + " - Prime");
        System.out.println(GAME_CHOICE_EXIT + " - Exit");
        System.out.println("Your choice: ");
        int gameChoice = scanner.nextInt();
        switch (gameChoice) {
            case GAME_CHOICE_EXIT -> scanner.close();
            case GAME_CHOICE_GREET -> Cli.askUsername();
            case GAME_CHOICE_EVEN -> Even.runGame();
            case GAME_CHOICE_CALC -> Calc.runGame();
            case GAME_CHOICE_GCD -> GCD.runGame();
            case GAME_CHOICE_PROGRESSION -> Progression.runGame();
            case GAME_CHOICE_PRIME -> Prime.runGame();
            default -> throw new RuntimeException("\"Invalid choice. Please try again.\" " + gameChoice);
        }
    }
}
