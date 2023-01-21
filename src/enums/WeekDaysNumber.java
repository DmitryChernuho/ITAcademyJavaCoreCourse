package enums;

public enum WeekDaysNumber {
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7);

    private final int WeekDaysNumber;

    WeekDaysNumber(int WeekDaysNumber) {
        this.WeekDaysNumber = WeekDaysNumber;
    }

    public int getWeekDaysNumber() {
        return WeekDaysNumber;
    }
}
