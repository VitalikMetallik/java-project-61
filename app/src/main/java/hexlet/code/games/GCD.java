package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;

public class GCD {

    public static void gcdGame() {
        Cli.askUsername();
        System.out.println("Find the greatest common divisor of given numbers.");

        int count = 0;
        final int maxCount = 3;

        while (count < maxCount) {
            Scanner answer = new Scanner(System.in);
            final int number1 = (int) ((Math.random() * 100) + 1);
            final int number2 = (int) ((Math.random() * 100) + 1);
            int result = gcd(number1, number2);

            System.out.println("Question: " + number1 + " " + number2);
            int answerNext;
            answerNext = answer.nextInt();

            if (Engine.rightOrWrong(answerNext == result, result, answerNext)) {
                break;
            }

            count++;
        }

        Engine.congratulations(count == maxCount);

    }

    public static int gcd(int number1, int number2) {
        if (number2 == 0) {
            return number1;
        }
        return gcd(number2, number1 % number2);
    }
}
