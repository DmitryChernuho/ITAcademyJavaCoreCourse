import enums.DayPartHours;
import enums.DayPartMessage;
import enums.WeekDays;
import enums.WeekDaysNumber;

public class Tasks {
    private final static String MESSAGE_PATTERN = "%s - is %s\n";

    public static void printWeekDayByDayNumberUsingSwitchCase(int dayNumber) {
        switch (dayNumber) {
            case 1 -> System.out.printf(MESSAGE_PATTERN, dayNumber, WeekDays.SUNDAY.getWeekDay());
            case 2 -> System.out.printf(MESSAGE_PATTERN, dayNumber, WeekDays.MONDAY.getWeekDay());
            case 3 -> System.out.printf(MESSAGE_PATTERN, dayNumber, WeekDays.TUESDAY.getWeekDay());
            case 4 -> System.out.printf(MESSAGE_PATTERN, dayNumber, WeekDays.WEDNESDAY.getWeekDay());
            case 5 -> System.out.printf(MESSAGE_PATTERN, dayNumber, WeekDays.THURSDAY.getWeekDay());
            case 6 -> System.out.printf(MESSAGE_PATTERN, dayNumber, WeekDays.FRIDAY.getWeekDay());
            case 7 -> System.out.printf(MESSAGE_PATTERN, dayNumber, WeekDays.SATURDAY.getWeekDay());
            default -> System.out.println("Week day is not valid");
        }
    }

    public static void printWeekDayByDayNumberUsingIfElse(int dayNumber) {
        if (dayNumber == Integer.parseInt(WeekDaysNumber.SUNDAY.getWeekDaysNumber())) {
            System.out.printf(MESSAGE_PATTERN, dayNumber, WeekDays.SUNDAY.getWeekDay());
        } else if (dayNumber == Integer.parseInt(WeekDaysNumber.MONDAY.getWeekDaysNumber())) {
            System.out.printf(MESSAGE_PATTERN, dayNumber, WeekDays.MONDAY.getWeekDay());
        } else if (dayNumber == Integer.parseInt(WeekDaysNumber.TUESDAY.getWeekDaysNumber())) {
            System.out.printf(MESSAGE_PATTERN, dayNumber, WeekDays.TUESDAY.getWeekDay());
        } else if (dayNumber == Integer.parseInt(WeekDaysNumber.WEDNESDAY.getWeekDaysNumber())) {
            System.out.printf(MESSAGE_PATTERN, dayNumber, WeekDays.WEDNESDAY.getWeekDay());
        } else if (dayNumber == Integer.parseInt(WeekDaysNumber.THURSDAY.getWeekDaysNumber())) {
            System.out.printf(MESSAGE_PATTERN, dayNumber, WeekDays.THURSDAY.getWeekDay());
        } else if (dayNumber == Integer.parseInt(WeekDaysNumber.FRIDAY.getWeekDaysNumber())) {
            System.out.printf(MESSAGE_PATTERN, dayNumber, WeekDays.FRIDAY.getWeekDay());
        } else if (dayNumber == Integer.parseInt(WeekDaysNumber.SATURDAY.getWeekDaysNumber())) {
            System.out.printf(MESSAGE_PATTERN, dayNumber, WeekDays.SATURDAY.getWeekDay());
        }
    }

    public static void printPartOfDayByHourUsingIfElse(int hour) {
        if (hour > Integer.parseInt(DayPartHours.NIGHT.getDayPartHours()) && hour < Integer.parseInt(DayPartHours.MORNING.getDayPartHours())) {
            System.out.println(DayPartMessage.MORNING.getDayPartMessage());
        } else if (hour > Integer.parseInt(DayPartHours.MORNING.getDayPartHours()) && hour < Integer.parseInt(DayPartHours.DAY.getDayPartHours())) {
            System.out.println(DayPartMessage.DAY.getDayPartMessage());
        } else if (hour > Integer.parseInt(DayPartHours.DAY.getDayPartHours()) && hour < Integer.parseInt(DayPartHours.EVENING.getDayPartHours())) {
            System.out.println(DayPartMessage.EVENING.getDayPartMessage());
        } else if (hour < Integer.parseInt(DayPartHours.NIGHT.getDayPartHours())) {
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
}
