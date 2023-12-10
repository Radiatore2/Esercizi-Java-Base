package EX5DATE;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class EX5DATE {

    public static void main(String[] args) {

        LocalDateTime primaData = LocalDateTime.parse("2023-03-01T13:00:00Z", DateTimeFormatter.ISO_DATE_TIME);
        LocalDateTime secondaData = LocalDateTime.parse("2024-03-01T13:00:00Z", DateTimeFormatter.ISO_DATE_TIME);

        boolean primaDataPrimaDiSecondaData = primaData.isBefore(secondaData);

        boolean secondaDataDopoPrimaData = secondaData.isAfter(primaData);

        LocalDateTime oraAttuale = LocalDateTime.now(ZoneOffset.UTC);
        boolean primaDataUgualeAdOra = primaData.isEqual(oraAttuale);
        boolean secondaDataUgualeAdOra = secondaData.isEqual(oraAttuale);

        System.out.println(primaDataPrimaDiSecondaData);
        System.out.println(secondaDataDopoPrimaData);
        System.out.println(primaDataUgualeAdOra);
        System.out.println(secondaDataUgualeAdOra);
    }
}
