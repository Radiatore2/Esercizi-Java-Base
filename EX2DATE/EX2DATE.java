package EX2DATE;


import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class EX2DATE {
    public static void main(String[] args) {

        String inputString = "2023-03-01T13:00:00Z";

        OffsetDateTime dateTime = OffsetDateTime.parse(inputString);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        String formattedDate = dateTime.format(formatter);

        System.out.println(formattedDate);
    }
}
