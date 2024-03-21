import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;
import java.time.Month;

public class DateAndTimeAPI {
    public static void main(String[] args) {
        System.out.println("Date And Time API");
        System.out.println("1. What is today date?");
        LocalDate date = LocalDate.now();
        System.out.println("Today date: "+ date);
        System.out.println("2. What is the time right now?");
        LocalTime time = LocalTime.now();
        System.out.println("Current time: " + time);
        System.out.println("3. What is the date and time right now?");
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); // Customize the format pattern if needed
        String formattedDateTime = now.format(formatter);
        System.out.println("Current date and time: " + formattedDateTime);
        System.out.println("4. What is today day of week?");
        DayOfWeek dayOfWeek = DayOfWeek.from(date);
        System.out.println("Today is " + dayOfWeek.name().toLowerCase() + ".");
        System.out.println("5. What is today day of month?");
        Month month = Month.from(date);
        System.out.println("The current month is " + month.name().toLowerCase() + ".");
        System.out.println("6. Is this year a leap year?");
        System.out.println(date.isLeapYear());
        System.out.println("7. What is the time right now in India?");
        ZoneId zone1 = ZoneId.of("Asia/Kolkata");
        LocalTime time1 = LocalTime.now(zone1);
        System.out.println("India Time Zone: "+time1);
        System.out.println("8. What is the time right now in Japan?");
        ZoneId zone2 = ZoneId.of("Asia/Tokyo");
        LocalTime time2 = LocalTime.now(zone2);
        System.out.println("Japan Time Zone: "+time2);
        System.out.println("Thanks for using date and time api!!!");
    }
}
