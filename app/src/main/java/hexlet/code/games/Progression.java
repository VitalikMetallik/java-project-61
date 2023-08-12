package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Progression {

    static final Scanner ANSWER = new Scanner(System.in);

    public static void progressionGame() {
        Cli.askUsername();
        System.out.println("What number is missing in the progression?");

        int count = 0;
        final int maxCount = 3;

        while (count < maxCount) {
            int[] progression = generateProgression();
            int hiddenIndex = chooseHiddenIndex(progression.length);
            int answerNum = progression[hiddenIndex];

            System.out.println("Question: " + showProgression(progression, hiddenIndex));
            String answerNext = ANSWER.next();

            if (Engine.rightOrWrong(answerNext.equals(Integer.toString(answerNum)), "" + answerNum, answerNext)) {
                break;
            }

            count++;
        }

        Engine.congratulations(count == maxCount);
    }

    public static int[] generateProgression() {
        Random random = new Random();
        int progressionLength = random.nextInt(6) + 5; // Генерируем длину прогрессии от 5 до 10
        int progressionStep = random.nextInt(3) + 1; // Генерируем шаг прогрессии от 1 до 3

        int[] progression = new int[progressionLength];

        for (int i = 0; i < progressionLength; i++) {
            progression[i] = i * progressionStep + random.nextInt(progressionStep); // Генерируем число прогрессии
        }

        return progression;
    }

    public static int chooseHiddenIndex(int length) {
        Random random = new Random();
        return random.nextInt(length);
    }

    public static String showProgression(int[] progression, int hiddenIndex) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < progression.length; i++) {
            if (i == hiddenIndex) {
                sb.append(".. ");
            } else {
                sb.append(progression[i]).append(" ");
            }
        }
        return sb.toString().trim();
    }
}
