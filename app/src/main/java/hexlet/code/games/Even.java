package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int MIN_NUMBER = 0;
    private static final int MAX_NUMBER = 100;

    // Функция для проверки числа на чётность
    static boolean isEven(int num) {
        return num % 2 == 0;
    }

    // Генерация вопроса и ответа
    static String[] generateQuestionAndAnswerEven() {
        int number = Utils.generateRandomNum(MIN_NUMBER, MAX_NUMBER);
        String question = Integer.toString(number);
        String correctAnswer = isEven(number) ? "yes" : "no";
        return new String[]{question, correctAnswer};
    }

    // Запуск игры
    public static void runEvenGame() {
        int arraysCount = Engine.ROUNDS_COUNT;
        String[][] dataForGame = new String[arraysCount][2];
        for (int i = 0; i < arraysCount; i++) {
            dataForGame[i] = generateQuestionAndAnswerEven();
        }
        Engine.gameEngine(DESCRIPTION, dataForGame);
    }
}
