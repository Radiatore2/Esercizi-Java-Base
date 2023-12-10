package EX5TEST;

import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.format.DateTimeFormatter;
class EX5TESTTest {

    @org.junit.jupiter.api.Test
    void main() {

        LocalDateTime initialDateTime = LocalDateTime.of(2023, 3, 1, 13, 0, 0);

        LocalDateTime expectedDateTime = initialDateTime.plusYears(1).minusMonths(1).plusDays(7);

        LocalDateTime actualDateTime = initialDateTime.plusYears(1).minusMonths(1).plusDays(7);

        assertEquals(expectedDateTime, actualDateTime);

        LocalDateTime testDateTime = LocalDateTime.of(2023, 3, 1, 13, 0, 0);

        LocalDateTime finalDateTime = testDateTime.plusYears(1).minusMonths(1).plusDays(7);

        DateTimeFormatter italianFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String expectedLocalizedDateTime = finalDateTime.format(italianFormatter);

        assertEquals("2024-01-08 13:00:00", expectedLocalizedDateTime);
    }
}