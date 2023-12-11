package EX5TEST;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class EX5TEST {

    public static void main(String[] args) {
        String dataString = "2023-03-01T13:00:00Z";

        ZonedDateTime data = ZonedDateTime.parse(dataString, DateTimeFormatter.ISO_DATE_TIME);

        ZonedDateTime dateTimeLocal = localDate(data);

        System.out.println(dateTimeLocal);
    }

    public static ZonedDateTime localDate(ZonedDateTime date) {

        date = date.plusYears(1);

        date = date.minusMonths(1);

        date = date.plusDays(7);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z", Locale.ITALY);

        String dateFormat = formatter.format(date);

        return date;
    }

}
