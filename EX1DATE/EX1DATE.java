package EX1DATE;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class EX1DATE {
    public static void main(String[] args) {

        String inputString = "2002-03-01T13:00:00Z";

        OffsetDateTime dateTime = OffsetDateTime.parse(inputString);

        DateTimeFormatter FULL = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy 'at' HH:mm:ss");
        DateTimeFormatter MEDIUM = DateTimeFormatter.ofPattern("MMM dd, yyyy 'at' HH:mm:ss");
        DateTimeFormatter SHORT = DateTimeFormatter.ofPattern("MM/dd/yy 'at' HH:mm");

        String fullFormatted = dateTime.format(FULL);
        String mediumFormatted = dateTime.format(MEDIUM);
        String shortFormatted = dateTime.format(SHORT);

        System.out.println(fullFormatted);
        System.out.println(mediumFormatted);
        System.out.println(shortFormatted);
    }
}
