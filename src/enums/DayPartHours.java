package enums;

public enum DayPartHours {
    MORNING("12"),
    DAY("18"),
    EVENING("24"),
    NIGHT("6");

    private final String DayPartHours;

    DayPartHours(String WeekDaysNumber) {
        this.DayPartHours = WeekDaysNumber;
    }

    public String getDayPartHours() {
        return DayPartHours;
    }
}
