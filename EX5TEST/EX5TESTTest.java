package EX5TEST;

import org.junit.jupiter.api.Test;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EX5TESTTest {

    @Test
    public void localDate() {
        String dataString = "2023-03-01T13:00:00Z";
        ZonedDateTime date = ZonedDateTime.parse(dataString, DateTimeFormatter.ISO_DATE_TIME);
        ZonedDateTime dataModification = EX5TEST.localDate(date);

        ZonedDateTime dataAspect = ZonedDateTime.parse("2024-02-08T13:00:00Z", DateTimeFormatter.ISO_DATE_TIME);

        assertEquals(dataAspect, dataModification);
    }
}
