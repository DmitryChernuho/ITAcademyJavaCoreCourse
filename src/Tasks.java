public class Tasks {

    public static void taskNumberOne(int x, int y) {
        int division = x / y;
        int divisionRemainder = x % y;
        System.out.println("Division result = " + division);
        System.out.println("Remainder of the division = " + divisionRemainder);
    }

    public static void taskNumberTwo(int weight, int height) {
        int perimeter = weight + weight + height + height;
        int square = weight * height;
        System.out.println("Perimeter = " + perimeter);
        System.out.println("Square = " + square);
    }

    public static void taskNumberThree(int radius) {
        double pi = 3.14;
        double square = pi * Math.pow(radius, 2);
        double circumference = 2 * pi * radius;
        System.out.println("Square = " + square);
        System.out.println("Circumference = " + circumference);
    }

    public static void taskNumberFour(int n) {
        int sum = 0;
        while (n != 0) {
            sum += (n % 10);
            n /= 10;
        }
        System.out.println("Sum = " + sum);
    }

    public static void taskNumberFive(double value) {
        boolean isValueHaveRealPart = value % 1 != 0;
        if (isValueHaveRealPart) {
            System.out.println("Value have a real part");
        } else {
            System.out.println("Value have not a real part");
        }
    }
}
