import enums.DayPartHours;
import enums.DayPartMessage;
import enums.WeekDays;
import enums.WeekDaysNumber;

public class Tasks {
    private final static String MESSAGE_PATTERN = "%s - is %s\n";

    public static void weekDayByDayNumberUsingSwitchCase(int dayNumber) {
        switch (dayNumber) {
            case 1 -> printMessageNumberDayIsNameDay(dayNumber, WeekDays.SUNDAY.getWeekDay());
            case 2 -> printMessageNumberDayIsNameDay(dayNumber, WeekDays.MONDAY.getWeekDay());
            case 3 -> printMessageNumberDayIsNameDay(dayNumber, WeekDays.TUESDAY.getWeekDay());
            case 4 -> printMessageNumberDayIsNameDay(dayNumber, WeekDays.WEDNESDAY.getWeekDay());
            case 5 -> printMessageNumberDayIsNameDay(dayNumber, WeekDays.THURSDAY.getWeekDay());
            case 6 -> printMessageNumberDayIsNameDay(dayNumber, WeekDays.FRIDAY.getWeekDay());
            case 7 -> printMessageNumberDayIsNameDay(dayNumber, WeekDays.SATURDAY.getWeekDay());
            default -> System.out.println("Week day is not valid");
        }
    }

    public static void weekDayByDayNumberUsingIfElse(int dayNumber) {
        if (dayNumber == WeekDaysNumber.SUNDAY.getWeekDaysNumber()) {
            printMessageNumberDayIsNameDay(dayNumber, WeekDays.SUNDAY.getWeekDay());

        } else if (dayNumber == WeekDaysNumber.MONDAY.getWeekDaysNumber()) {
            printMessageNumberDayIsNameDay(dayNumber, WeekDays.MONDAY.getWeekDay());

        } else if (dayNumber == WeekDaysNumber.TUESDAY.getWeekDaysNumber()) {
            printMessageNumberDayIsNameDay(dayNumber, WeekDays.TUESDAY.getWeekDay());

        } else if (dayNumber == WeekDaysNumber.WEDNESDAY.getWeekDaysNumber()) {
            printMessageNumberDayIsNameDay(dayNumber, WeekDays.WEDNESDAY.getWeekDay());

        } else if (dayNumber == WeekDaysNumber.THURSDAY.getWeekDaysNumber()) {
            printMessageNumberDayIsNameDay(dayNumber, WeekDays.THURSDAY.getWeekDay());

        } else if (dayNumber == WeekDaysNumber.FRIDAY.getWeekDaysNumber()) {
            printMessageNumberDayIsNameDay(dayNumber, WeekDays.FRIDAY.getWeekDay());

        } else if (dayNumber == WeekDaysNumber.SATURDAY.getWeekDaysNumber()) {
            printMessageNumberDayIsNameDay(dayNumber, WeekDays.SATURDAY.getWeekDay());
        }
    }

    public static void printPartOfDayByHourUsingIfElse(int hour) {
        if (hour > DayPartHours.NIGHT.getDayPartHours() && hour < DayPartHours.MORNING.getDayPartHours()) {
            System.out.println(DayPartMessage.MORNING.getDayPartMessage());

        } else if (hour > DayPartHours.MORNING.getDayPartHours() && hour < DayPartHours.DAY.getDayPartHours()) {
            System.out.println(DayPartMessage.DAY.getDayPartMessage());

        } else if (hour > DayPartHours.DAY.getDayPartHours() && hour < DayPartHours.EVENING.getDayPartHours()) {
            System.out.println(DayPartMessage.EVENING.getDayPartMessage());

        } else if (hour < DayPartHours.NIGHT.getDayPartHours()) {
            System.out.println(DayPartMessage.NIGHT.getDayPartMessage());
        }
    }

    public static void printPartOfDayByHourUsingSwitchCase(int hour) {
        switch (hour) {
            case 1, 2, 3, 4, 5, 6 -> System.out.println(DayPartMessage.NIGHT.getDayPartMessage());
            case 7, 8, 9, 10, 11, 12 -> System.out.println(DayPartMessage.MORNING.getDayPartMessage());
            case 13, 14, 15, 16, 17, 18 -> System.out.println(DayPartMessage.DAY.getDayPartMessage());
            case 19, 20, 21, 22, 23, 24 -> System.out.println(DayPartMessage.EVENING.getDayPartMessage());
            default -> System.out.println("Hour is not valid");
        }
    }

    private static void printMessageNumberDayIsNameDay(int dayNumber, String weekDay) {
        System.out.printf(MESSAGE_PATTERN, dayNumber, weekDay);
    }
}
