package hexlet.code;

import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Вывод меню выбора игр
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        // Получаем выбор пользователя
        int choice = scanner.nextInt();

        if (choice == 1) {
            Cli.greetUser();
        } else if (choice == 2) {
            Even.runGame();
        } else if (choice == 0) {
            System.out.println("Exiting...");
        } else {
            System.out.println("Invalid choice");
        }

        scanner.close();
    }
}
