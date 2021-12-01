package hexlet.code;

import java.util.Random;

public class Utils {
    static final int MAX_RANDOM_INT = 30;

    public static int getRandomInt() {
        return getRandomInt(MAX_RANDOM_INT);
    }

    public static int getRandomInt(int maxInt) {
        Random randomInt = new Random();
        return randomInt.nextInt(maxInt);
    }

    public static String booleanToString(boolean answer) {
        return (answer) ? "yes" : "no";

    }
}
