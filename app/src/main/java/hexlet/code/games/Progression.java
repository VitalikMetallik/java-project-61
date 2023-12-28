package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static final String DESCRIPTION = "What number is missing in the progression?";

    // Генерация числовой прогрессии и заполнение массива
    static void fillArrayRandomProgression(String[] array, int firstNum, int length, int step) {
        for (var i = 0; i < length; i++) {
            array[i] = Integer.toString(firstNum + (i * step));
        }
    }

    // Генерация вопроса и ответа
    static String[] generateQuestionAndAnswer() {
        final int minNumbersLength = 5;
        final int maxNumbersLength = 10;
        int numbersLength = Utils.generateRandomNum(minNumbersLength, maxNumbersLength);
        String[] numbers = new String[numbersLength];

        int firstNum = Utils.generateRandomNum(0, 100);
        int step = Utils.generateRandomNum(1, 10);
        fillArrayRandomProgression(numbers, firstNum, numbersLength, step);

        int placeOfMissingNumber = Utils.generateRandomNum(0, numbersLength);
        String correctAnswer = numbers[placeOfMissingNumber];
        numbers[placeOfMissingNumber] = "..";

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
