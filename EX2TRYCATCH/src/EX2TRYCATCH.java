public class EX2TRYCATCH {

    public static void main(String[] args) throws Exception  {

        try {
            char character = 'A';
            checkNumber(character);
            System.out.println("Is a number");
        } catch (Exception e) {
            System.out.println("Isn't a number");
        }
    }

    public static void checkNumber(char character) throws Exception {
        if (Character.isDigit(character)) {
            System.out.println("Is a number");
        } else {
            throw new Exception("Isn't a number");
        }
    }
}
