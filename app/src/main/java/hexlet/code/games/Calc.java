
package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static final String DESCRIPTION = "What is the result of the expression?";
    private static final int MIN_NUMBER = 0;
    private static final int MAX_NUMBER = 100;

    // Генерация случайного оператора
    static String randomOperator() {
        String[] operators = {"+", "-", "*"};
        return operators[Utils.generateRandomNum(0, 2)];
    }

    // Получение правильного ответа на основе оператора и чисел
    static String correctAnswer(String operator, int num1, int num2) {
        switch (operator) {
            case "+" -> {
                return Integer.toString(num1 + num2);
            }
            case "-" -> {
                return Integer.toString(num1 - num2);
            }
            case "*" -> {
                return Integer.toString(num1 * num2);
            }
            default -> throw new IllegalArgumentException("Invalid operator");
        }
    }

    // Генерация вопроса и ответа
    static String[] generateQuestionAndAnswer() {
        int num1 = Utils.generateRandomNum(MIN_NUMBER, MAX_NUMBER);
        int num2 = Utils.generateRandomNum(MIN_NUMBER, MAX_NUMBER);
        String operator = randomOperator();
        String question = num1 + " " + operator + " " + num2;
        String correctAnswer = correctAnswer(operator, num1, num2);
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
