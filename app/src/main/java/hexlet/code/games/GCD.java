package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    public static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";

    //Метод для нахождения наибольшего общего делителя
    static int gcdOfNumbers(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcdOfNumbers(n2, n1 % n2);
    }

    // Генерация вопроса и ответа
    static String[] generateQuestionAndAnswer() {
        int num1 = Utils.generateRandomNum(0, 100);
        int num2 = Utils.generateRandomNum(0, 100);
        String question = num1 + " " + num2;
        String correctAnswer = Integer.toString(gcdOfNumbers(num1, num2));
        return new String[]{question, correctAnswer};
    }

    // Запуск игры
    public static void runGame() {
        int arraysCount = Engine.ROUNDS_COUNT;
        String[][] dataForGame = new String[arraysCount][2];
        for (int i = 0; i < arraysCount; i++) {
            dataForGame[i] = generateQuestionAndAnswer();
        }
        Engine.gameEngine(DESCRIPTION, dataForGame);
    }
}
