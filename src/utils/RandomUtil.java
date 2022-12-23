package utils;

public class RandomUtil {

    public static int getRandomWeekDay(int minLine, int maxLine) {
        int randomValue = (int) (Math.random() * (maxLine - minLine) + minLine);
        System.out.printf("!!! Random value = %s !!!\n", randomValue);
        return randomValue;
    }
}
