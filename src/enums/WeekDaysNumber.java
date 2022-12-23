package enums;

public enum WeekDaysNumber {
    SUNDAY ("1"),
    MONDAY ("2"),
    TUESDAY ("3"),
    WEDNESDAY ("4"),
    THURSDAY ("5"),
    FRIDAY ("6"),
    SATURDAY ("7");

    private final String WeekDaysNumber;

    WeekDaysNumber(String WeekDaysNumber) {
        this.WeekDaysNumber = WeekDaysNumber;
    }

    public String getWeekDaysNumber() {
        return WeekDaysNumber;
    }
}
