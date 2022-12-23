import utils.RandomUtil;

public class Runner {

    public static void main(String[] args) {
        int firstValue = RandomUtil.getRandomWeekDay(1, 24);
        Tasks.taskNumberOne(firstValue);
        Tasks.taskNumberTwo(firstValue);
        Tasks.taskNumberThree(firstValue);
        Tasks.taskNumberFour(firstValue);
    }
}
