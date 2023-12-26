package hexlet.code;

public class Utils {
    // Генерация случайного числа в диапазоне от 0 до 100
    public static int randomNum() {
        final int maxRandomNumber = 100;
        return maxRandomNumber - ((int) (Math.random() * maxRandomNumber));
    }

    // Генерация случайного числа в заданном диапазоне
    public static int randomNum(int min, int max) {
        return (int) (Math.random() * (max - min - 1)) + min;
    }


}
