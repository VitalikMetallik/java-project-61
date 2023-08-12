package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;

public class Calc {

    static String question;

    public static void calcGame() {
        Cli.askUsername();
        System.out.println("What is the result of the expression?");

        int count = 0; // Счетчик правильных ответов
        final int maxCount = 3; // Максимальное количество вопросов

        while (count < maxCount) {
            Scanner answer = new Scanner(System.in); // Создаем сканнер для получения ответов пользователя
            int result = getResult(); // Генерируем и получаем правильный ответ на текущий вопрос

            System.out.println(question); // Выводим текущий вопрос в консоль
            final int answerNext = answer.nextInt(); // Получаем ответ пользователя

            if (Engine.rightOrWrong(answerNext == result, result, answerNext)) {
                break; // Если ответ правильный, выходим из цикла
            }

            count++; // Увеличиваем счетчик правильных ответов
        }

        Engine.congratulations(count == maxCount);
    }

    private static int getResult() {

        final int number1 = (int) (Math.random() * 100); // Генерируем первое число от 0 до 99
        final int number2 = (int) (Math.random() * 100); // Генерируем второе число от 0 до 99
        final int choiceAction = (int) (Math.random() * 3);
        String action = " + "; // По умолчанию операция сложения

        if (choiceAction == 0) {
            action = " - "; // Задаем операцию вычитания
        } else if (choiceAction == 1) {
            action = " * ";  // Задаем операцию умножения
        }

        question = "Question: " + number1 + action + number2; // Формируем вопрос с текущими числами и операцией

        return switch (choiceAction) {
            case 0 -> number1 - number2; // Возвращаем правильный ответ для операции вычитания
            case 1 -> number1 * number2; // Возвращаем правильный ответ для операции умножения
            default -> number1 + number2; // Возвращаем правильный ответ для операции сложения
        };

    }
}
