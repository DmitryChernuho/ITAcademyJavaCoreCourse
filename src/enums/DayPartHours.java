package enums;

public enum DayPartHours {
    MORNING(12),
    DAY(18),
    EVENING(24),
    NIGHT(6);

    private final int DayPartHours;

    DayPartHours(int WeekDaysNumber) {
        this.DayPartHours = WeekDaysNumber;
    }

    public int getDayPartHours() {
        return DayPartHours;
    }
}
