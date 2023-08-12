package hexlet.code;

public class Engine {

    public static boolean rightOrWrong(boolean condition, Object trueAnswer, Object answer) {

        System.out.println("Your answer: " + answer);

        if (condition) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + trueAnswer
                    + "'.\nLet's try again, " + Cli.getName() + "!");
            return true;
        }

        return false;

    }

    public static void congratulations(boolean condition) {
        if (condition) {
            System.out.println("Congratulations, " + Cli.getName() + "!");
        }
    }

}
