package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Вывод меню выбора игр
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
        System.out.println("Your choice: ");
        int gameChoice = scanner.nextInt();
        switch (gameChoice) {
            case 0 -> scanner.close();
            case 1 -> Cli.askUsername();
            case 2 -> Even.evenGame();
            case 3 -> Calc.calcGame();
            default -> throw new RuntimeException("\"Invalid choice. Please try again.\" " + gameChoice);
        }
    }
}
