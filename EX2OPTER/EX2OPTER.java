package EX2OPTER;

public class EX2OPTER {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Valore: " + i);
            System.out.println(checkValue(i));
        }
    }

    private static String checkValue(int value) {

        final String msg = value % 5 == 0 ? "\"FizzBuzz\"" : "\"Buzz\"";

        return msg;
    }
}

