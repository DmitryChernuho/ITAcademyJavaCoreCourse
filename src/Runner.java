import utils.RandomUtil;

public class Runner {
    public static void main(String[] args) {
        int firstValue = RandomUtil.getRandomWeekDay(1, 24);
        Tasks.printWeekDayByDayNumberUsingSwitchCase(firstValue);
        Tasks.printWeekDayByDayNumberUsingIfElse(firstValue);
        Tasks.printPartOfDayByHourUsingIfElse(firstValue);
        Tasks.printPartOfDayByHourUsingSwitchCase(firstValue);
    }
}
