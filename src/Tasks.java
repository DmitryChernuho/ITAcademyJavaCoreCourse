public class Tasks {

    public static void taskNumberOne(int limitNumber) {
        for (int i = 0; i < limitNumber; i++) {
            System.out.printf("%s, ", i);
        }
        System.out.println(limitNumber);
    }

    public static void taskNumberTwo(int limitNumber) {
        for (int i = limitNumber; i > 0; i--) {
            System.out.printf("%s, ", i);
        }
        System.out.println(0);
    }

    public static void taskThree(int limitNumber) {
        int counter = 0;
        int startValue = 0;
        int currentValue = 1;
        System.out.println(startValue);
        System.out.println(currentValue);
        while (counter < limitNumber) {
            int lastValue = currentValue;
            System.out.println(currentValue += startValue);
            startValue = lastValue;
            counter++;
        }
    }

    public static void taskNumberFour(int limitNumber) {
        int firstCounter = 1;
        int secondCounter = 1;
        while (firstCounter <= limitNumber) {
            while (secondCounter <= limitNumber) {
                int firstResult = firstCounter * secondCounter;
                System.out.printf("%s * %s = %s   \t",secondCounter, firstCounter, firstResult);
                secondCounter++;
            }
            System.out.print("\n");
            secondCounter = 1;
            firstCounter++;
        }
    }
}
