import utils.RandomUtil;

public class Runner {
    public static void main(String[] args) {
        int firstValue = RandomUtil.getRandomWeekDay(1, 24);
        Tasks.weekDayByDayNumberUsingSwitchCase(firstValue);
        Tasks.weekDayByDayNumberUsingIfElse(firstValue);
        Tasks.printPartOfDayByHourUsingIfElse(firstValue);
        Tasks.printPartOfDayByHourUsingSwitchCase(firstValue);
    }
}
