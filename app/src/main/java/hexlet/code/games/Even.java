package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Even {
    private static final int MAX_QUESTIONS = 3;

    public static void runGame() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int correctAnswers = 0;

        while (correctAnswers < MAX_QUESTIONS) {
            int randomNumber = generateRandomNumber();
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();

            if (isAnswerCorrect(randomNumber, userAnswer)) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;" + "(. Correct answer was '" + getCorrectAnswer(randomNumber) + "'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }

        if (correctAnswers == MAX_QUESTIONS) {
            System.out.println("Congratulations, " + userName + "!");
        }

        scanner.close();
    }

    private static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(101);
    }

    private static boolean isAnswerCorrect(int number, String answer) {
        if (number % 2 == 0 && answer.equals("yes")) {
            return true;
        } else return number % 2 != 0 && answer.equals("no");
    }

    private static String getCorrectAnswer(int number) {
        if (number % 2 == 0) {
            return "yes";
        } else {
            return "no";
        }
    }
}
