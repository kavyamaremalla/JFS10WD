import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeBasics {

    public static void main(String[] args) {
//        testBasics();

//        testLocalDateTime();

//        testZonedDateTime();

//        testChronoUnit();

        testPeriodAndDuration();

    }

    private static void testPeriodAndDuration() {
        LocalDate currentDate = LocalDate.now();

        LocalDate date1 = currentDate.plus(1, ChronoUnit.YEARS);

        Period period = Period.between(date1, currentDate);
        System.out.println(period);

        LocalTime time = LocalTime.now();
        Duration twoHours = Duration.ofMinutes(2);

        LocalTime time1 = time.plus(twoHours);
        Duration duration = Duration.between(time, time);
        System.out.println(duration.isZero());

        LocalDate dob = LocalDate.parse("2020-06-28");

        Period age = Period.between(dob, currentDate);
        System.out.println(age.getMonths());
    }

    private static void testChronoUnit() {
        LocalDate today = LocalDate.now();

        LocalDate nextWeek =  today.plus(1, ChronoUnit.WEEKS);
        System.out.println(nextWeek);

        LocalDate nextMonth =  today.plus(1, ChronoUnit.MONTHS);
        System.out.println(nextMonth);

        LocalDate nextYear =  today.plus(1, ChronoUnit.YEARS);
        System.out.println(nextYear);

        LocalDate nextDecade =  today.plus(1, ChronoUnit.DECADES);
        System.out.println(nextDecade);
    }


    private static void testZonedDateTime() {
        ZonedDateTime dateTime = ZonedDateTime.parse("2020-12-03T10:15:30+05:30[Asia/Karachi]");
        System.out.println(dateTime);

        ZoneId  zoneId = ZoneId.of("Europe/Paris");
        System.out.println(zoneId);

        ZoneId currentZone = ZoneId.systemDefault();
        System.out.println(currentZone);
    }

    private static void testBasics() {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E, MM dd yyyy hh:mm:ss");
//dd-MM-yyyy HH:mm:ss
        String formattedDateTime = dateTime.format(formatter);
        System.out.println(formattedDateTime);
    }

    private static void testLocalDateTime() {
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println(currentTime);

        LocalDate date1 = currentTime.toLocalDate();
        System.out.println(date1);

        Month month = currentTime.getMonth();
        int day = currentTime.getDayOfMonth();
        int seconds = currentTime.getSecond();

        System.out.println(month + " " + day + " " + seconds);

        LocalTime localTime = LocalTime.of(22,15);
        System.out.println(localTime);

        LocalDate date = LocalDate.of(2015, Month.APRIL, 12);
        System.out.println(date);

        LocalTime time = LocalTime.parse("17:16:20");
        System.out.println(time);
    }
}
