public class EX1STRBUILD {
    public static void main(String[] args) {

        String result = compareStrings();

        System.out.println(result);
    }

    public static String compareStrings() {

        StringBuilder x = new StringBuilder("Bellissimo");
        StringBuilder z = new StringBuilder("Bellissimo");

        if (!x.toString().equals(z.toString())) {
            return "Le due stringhe sono differenti";
        } else {
            return "Le due stringhe sono uguali";
        }
    }
}
