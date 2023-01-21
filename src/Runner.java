public class Runner {
    public static void main(String[] args) {
        int value = RandomUtil.getRandomIntegerNumber(LimitValue.HUNDREDS.getLimitValue());
        Tasks.taskNumberFour(value);
    }
}
