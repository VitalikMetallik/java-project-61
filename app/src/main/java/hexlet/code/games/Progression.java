
package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static final String DESCRIPTION = "What number is missing in the progression?";

    // Заполнение массива числовой прогрессией
    static void fillArrayRandomProgression(String[] array) {
        int firstNum = Utils.randomNum();
        for (var i = 0; i < array.length; i++) {
            array[i] = Integer.toString(firstNum + i);
        }
    }
    // Преобразование массива чисел в строку
    static String arrayToString(String[] array) {
        return String.join(" ", array);
    }

    // Генерация вопроса и правильного ответа
    static String[] questionAndAnswer() {
        final int minNumbersLength = 5;
        final int maxNumbersLength = 10;
        int numbersLength = Utils.randomNum(minNumbersLength, maxNumbersLength);
        String[] numbers = new String[numbersLength];
        fillArrayRandomProgression(numbers);

        int placeOfMissingNumber = Utils.randomNum(0, numbersLength);
        String correctAnswer = numbers[placeOfMissingNumber];
        numbers[placeOfMissingNumber] = "..";

        String question = arrayToString(numbers);
        return new String[]{question, correctAnswer};
    }

    // Запуск игры
    public static void runGame() {
        int arraysCount = Engine.ROUNDS_COUNT;
        String[][] dataForGame = new String[arraysCount][2];
        for (int i = 0; i < arraysCount; i++) {
            dataForGame[i] = questionAndAnswer();
        }
        Engine.gameEngine(DESCRIPTION, dataForGame);
    }
}
