package EX1BIGDEC;
import java.math.BigDecimal;
public class EX1BIGDEC {
    public static void main(String[] args) {
        BigDecimal numero1 = new BigDecimal("10");
        BigDecimal numero2 = new BigDecimal("5");
        Operation operation = Operation.ADDIZIONE;
        BigDecimal operazione = eseguiOperazione(operation, numero1, numero2);


        System.out.println(numero1);
        System.out.println(operation.getSimbol());
        System.out.println(numero2);
        System.out.println(operazione);
    }

    public static BigDecimal eseguiOperazione(Operation operation, BigDecimal num1, BigDecimal num2) {
        switch (operation) {
            case ADDIZIONE:
                return num1.add(num2);
            case SOTTRAZIONE:
                return num1.subtract(num2);
            case MOLTIPLICAZIONE:
                return num1.multiply(num2);
            case DIVISIONE:
                if (num2.compareTo(BigDecimal.ZERO) != 0) {
                    return num1.divide(num2);
                } else {
                    throw new ArithmeticException("Impossible zero");
                }
            case MIN:
                return num1.min(num2);
            case MAX:
                return num1.max(num2);
            default:
                throw new IllegalArgumentException("Operation not valid");
        }
    }
}
