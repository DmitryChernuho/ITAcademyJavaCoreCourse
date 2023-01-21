package enums;

public enum DayPartMessage {
    MORNING("Good morning!"),
    DAY("Good day!"),
    EVENING("Good evening!"),
    NIGHT("Good night!");

    private final String DayPartMessage;

    DayPartMessage(String WeekDaysNumber) {
        this.DayPartMessage = WeekDaysNumber;
    }

    public String getDayPartMessage() {
        return DayPartMessage;
    }
}
