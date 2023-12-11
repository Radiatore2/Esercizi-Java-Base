package EX1DATE;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class EX1DATE {
    public static void main(String[] args) {

        String inputString = "2002-03-01T13:00:00Z";

        OffsetDateTime dateTime = OffsetDateTime.parse(inputString);

        DateTimeFormatter fullFormatter  = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        DateTimeFormatter mediumFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        DateTimeFormatter shortFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);

        String fullFormatted = dateTime.format(fullFormatter);
        String mediumFormatted = dateTime.format(mediumFormatter);
        String shortFormatted = dateTime.format(shortFormatter);

        System.out.println(fullFormatted);
        System.out.println(mediumFormatted);
        System.out.println(shortFormatted);
    }
}
