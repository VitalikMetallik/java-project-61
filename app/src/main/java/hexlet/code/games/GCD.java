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

    // Метод для генерации вопроса и правильного ответа
    static String[] questionAndAnswer() {
        int num1 = Utils.randomNum();
        int num2 = Utils.randomNum();
        String question = num1 + " " + num2;
        String correctAnswer = Integer.toString(gcdOfNumbers(num1, num2));
        return new String[]{question, correctAnswer};
    }

    // Метод для запуска игры
    public static void runGame() {
        int arraysCount = Engine.ROUNDS_COUNT;
        String[][] dataForGame = new String[arraysCount][2];
        for (var item : dataForGame) {
            String[] data = questionAndAnswer();
            item[0] = data[0];
            item[1] = data[1];
        }
        Engine.gameEngine(DESCRIPTION, dataForGame);
    }
}
