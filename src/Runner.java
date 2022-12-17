public class Runner {

    public static void main(String[] args) {
        int firstValue = RandomUtil.getRandomIntegerNumber(LimitValue.TENS.getLimitValue());
        int secondValue = RandomUtil.getRandomIntegerNumber(LimitValue.HUNDREDS.getLimitValue());
        double fractionalValue = RandomUtil.getRandomFractionalNumber(LimitValue.UNITS.getLimitValue());
        Tasks.taskNumberFive(fractionalValue);
    }
}
