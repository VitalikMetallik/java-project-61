package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    // Генерация вопроса и ответа
    static String[] questionAndAnswer() {
        int number = Utils.randomNum();
        String question = Integer.toString(number);
        String correctAnswer = (number % 2 == 0) ? "yes" : "no";
        return new String[]{question, correctAnswer};
    }

    // Запуск игры
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
