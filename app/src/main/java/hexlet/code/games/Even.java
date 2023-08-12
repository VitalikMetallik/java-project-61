package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;

public class Even {

    public static void evenGame() {
        Cli.askUsername();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int count = 0; // Инициализация счетчика попыток
        final int maxCount = 3;
        String currentAnswer = "yes"; // Задание начального ответа

        while (count < maxCount) { // Цикл для выполнения игры
            Scanner answer = new Scanner(System.in);
            final int number = (int) (Math.random() * 10); // Генерация случайного числа
            final boolean checkAnswer = number % 2 == 0; // Проверка четности числа

            System.out.println("Question: " + number);
            String answerNext = answer.next();

            if (!(checkAnswer)) {
                currentAnswer = "no";
            }
            if (Engine.rightOrWrong(answerNext.equals(currentAnswer), currentAnswer, answerNext)) {
                break;
            }

            count++; // Увеличиваем счетчик правильных ответов
            currentAnswer = "yes";
        }

        Engine.congratulations(count == maxCount);
    }
}
