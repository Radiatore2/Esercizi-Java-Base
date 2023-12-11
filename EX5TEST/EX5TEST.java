package EX5TEST;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class EX5TEST {

    public static void main(String[] args) {
        String dateString = "2023-03-01T13:00:00Z";
        DateTimeFormatter formatter = DateTimeFormatter.ISO_INSTANT;
        LocalDateTime dateTime = LocalDateTime.parse(dateString, formatter.withZone(ZoneId.of("UTC")));

        LocalDateTime nextYear = dateTime.plusYears(1);

        LocalDateTime nextYearMinusMonth = nextYear.minusMonths(1);

        LocalDateTime finalDateTime = nextYearMinusMonth.plusDays(7);

        ZonedDateTime zonedDateTime = finalDateTime.atZone(ZoneId.of("Europe/Rome"));
        DateTimeFormatter italianFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss").localizedBy(Locale.ITALY);
        String localizedDateTime = zonedDateTime.format(italianFormatter);

        System.out.println(localizedDateTime);
    }

}
