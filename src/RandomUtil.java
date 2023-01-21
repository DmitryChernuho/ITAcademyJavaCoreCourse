public class RandomUtil {
    public static int getRandomIntegerNumber(String limitValue) {
        int randomNumber = (int) (Math.random() * Integer.parseInt(limitValue));
        System.out.println("random number = " + randomNumber);
        return randomNumber;
    }

    public static double getRandomFractionalNumber(String limitValue) {
        double randomNumber = (Math.random() * Integer.parseInt(limitValue));
        System.out.println("random number = " + randomNumber);
        return randomNumber;
    }
}
