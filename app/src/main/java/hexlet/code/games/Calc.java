
package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static final String DESCRIPTION = "What is the result of the expression?";

    // Генерация случайного оператора
    static String randomOperator() {
        String[] operators = {"+", "-", "*"};
        return operators[Utils.randomNum(0, 2)];
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
            default -> {
                return "";
            }
        }
    }

    // Генерация вопроса и правильного ответа
    static String[] questionAndAnswer() {
        int num1 = Utils.randomNum();
        int num2 = Utils.randomNum();
        String operator = randomOperator();
        String question = num1 + " " + operator + " " + num2;
        String correctAnswer = correctAnswer(operator, num1, num2);
        return new String[]{question, correctAnswer};
    }

    // Запуск игры
    public static void runGame() {
        String[][] dataForGame = new String[Engine.ROUNDS_COUNT][2];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            String[] data = questionAndAnswer();
            dataForGame[i][0] = data[0];
            dataForGame[i][1] = data[1];
        }
        Engine.gameEngine(DESCRIPTION, dataForGame);
    }
}
