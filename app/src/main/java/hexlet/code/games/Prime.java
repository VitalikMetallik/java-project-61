package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MIN_NUMBER = 0;
    private static final int MAX_NUMBER = 100;

    // Функция для проверки является ли число простым
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i += 1) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Генерация вопроса и ответа
    static String[] generateQuestionAndAnswerPrime() {
        int number = Utils.generateRandomNum(MIN_NUMBER, MAX_NUMBER);
        String question = Integer.toString(number);
        String correctAnswer = isPrime(number) ? "yes" : "no";
        return new String[]{question, correctAnswer};
    }

    // Запуск игры
    public static void runPrimeGame() {
        int arraysCount = Engine.ROUNDS_COUNT;
        String[][] dataForGame = new String[arraysCount][2];
        for (int i = 0; i < arraysCount; i++) {
            dataForGame[i] = generateQuestionAndAnswerPrime();
        }
        Engine.gameEngine(DESCRIPTION, dataForGame);
    }
}
