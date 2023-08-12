package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;

public class Prime {

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void primeGame() {
        Cli.askUsername();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        int count = 0;
        final int maxCount = 3;
        String currentAnswer = "yes";

        while (count < maxCount) {
            Scanner scanner = new Scanner(System.in);

            final int question = (int) (Math.random() * 100);
            final boolean checkAnswer = isPrime(question);

            System.out.println("Question: " + question);
            String answer = scanner.next();

            if (!checkAnswer) {
                currentAnswer = "no";
            }

            if (Engine.rightOrWrong(answer.equals(currentAnswer), currentAnswer, answer)) {
                break;
            }

            count++;
            currentAnswer = "yes";
        }

        Engine.congratulations(count == maxCount);
    }
}
