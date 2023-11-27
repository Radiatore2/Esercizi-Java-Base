public class EX1NULL {
    public static void main(String[] args) {
        Integer numeratore = 10;
        Integer denominatore = 0;

        try {
            double result = division(numeratore, denominatore);
            System.out.println("Il result è: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Errore: divisione per zero");
        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }

    public static double division(Integer numeratore, Integer denominatore) throws Exception {
        if (numeratore == null || denominatore == null) {
            throw new Exception("Numeratore e denominatore non possono essere nulli");
        }

        return (double) numeratore / denominatore;
    }
}