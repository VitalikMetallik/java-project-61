package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static final String DESCRIPTION = "What number is missing in the progression?";

    // Генерация вопроса и ответа
    static String[] generateQuestionAndAnswer() {
        final int minNumbersLength = 5;
        final int maxNumbersLength = 10;
        int numbersLength = Utils.generateRandomNum(minNumbersLength, maxNumbersLength);
        String[] numbers = new String[numbersLength];

        int firstNum = Utils.generateRandomNum(0, 100);
        int step = Utils.generateRandomNum(1, 10);
        int placeOfMissingNumber = Utils.generateRandomNum(0, numbersLength - 1);

        String correctAnswer = Integer.toString(firstNum + step * placeOfMissingNumber);

        for (int i = 0; i < numbersLength; i++) {
            if (i == placeOfMissingNumber) {
                numbers[i] = "..";
            } else {
                numbers[i] = Integer.toString(firstNum + (i * step));
            }
        }

        String question = String.join(" ", numbers);
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
