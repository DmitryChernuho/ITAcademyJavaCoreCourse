public class Tasks {

    public static void printNumbersStartZeroTillTen(int limitNumber) {
        for (int i = 0; i < limitNumber; i++) {
            System.out.printf("%s, ", i);
        }
        System.out.println(limitNumber);
    }

    public static void printNumbersStartTenTillZero(int limitNumber) {
        for (int i = limitNumber; i > 0; i--) {
            System.out.printf("%s, ", i);
        }
        System.out.println(0);
    }

    public static void printFibonacciListValue(int limitNumber) {
        int firstTerm = 0;
        int secondTerm = 1;
        int nextTerm;
        for (int i = 1; i <= limitNumber; ++i) {
            if(i == limitNumber) {
                System.out.printf("%s.\n", firstTerm);
                continue;
            }
            System.out.printf("%s, ", firstTerm);
            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }

    public static void printIncreaseTable(int limitNumber) {
        int firstCounter = 1;
        int secondCounter = 1;
        while (firstCounter <= limitNumber) {
            while (secondCounter <= limitNumber) {
                int firstResult = firstCounter * secondCounter;
                System.out.printf("%s * %s = %s   \t", secondCounter, firstCounter, firstResult);
                secondCounter++;
            }
            System.out.print("\n");
            secondCounter = 1;
            firstCounter++;
        }
    }
}
