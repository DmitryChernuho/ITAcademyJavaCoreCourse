public class Tasks {
    private static final double PI = 3.14;
    public static void taskNumberOne(int x, int y) {
        int division = x / y;
        int divisionRemainder = x % y;
        System.out.println("Division result = " + division);
        System.out.println("Remainder of the division = " + divisionRemainder);
    }

    public static void taskNumberTwo(int weight, int height) {
        int perimeter = 2 * (weight + height);
        int square = weight * height;
        System.out.println("Perimeter = " + perimeter);
        System.out.println("Square = " + square);
    }

    public static void taskNumberThree(int radius) {
        double square = PI * Math.pow(radius, 2);
        double circumference = 2 * PI * radius;
        System.out.println("Square = " + square);
        System.out.println("Circumference = " + circumference);
    }

    public static void taskNumberFour(int n) {
        int firstNumber = n / 100;
        int secondNumber = (n % 100) / 10;
        int thirdNumber = n % 10;
        int sum = firstNumber + secondNumber + thirdNumber;
        System.out.println("Sum = " + sum);
    }

    public static void taskNumberFive(double value) {
        boolean isValueHaveRealPart = value % 1 != 0;
        System.out.printf("Value have a real part = %s", isValueHaveRealPart);
    }
}
