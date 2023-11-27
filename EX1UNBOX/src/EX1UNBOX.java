public class EX1UNBOX {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        char character = 'A';

        stampSum(num1, num2);
        stampCharacter(character);
        stampSum(Integer.valueOf(num1), Integer.valueOf(num2));
        stampCharacter(Character.valueOf(character));

        int numInt = 15;
        double numDouble = 3.14;
        char charCharacter = 'B';

        Integer numeroIntegerBoxing = numInt;
        Double numeroDoubleBoxing = numDouble;
        Character carattereBoxing = charCharacter;

        int numeroInteroUnboxing = numeroIntegerBoxing;
        double numeroDoubleUnboxing = numeroDoubleBoxing;
        char carattereUnboxing = charCharacter;
    }

    public static void stampSum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    public static void stampCharacter(char c) {
        System.out.println(c);
    }

    public static void stampSum(Integer a, Integer b) {
        int sum = a + b;
        System.out.println(sum);
    }

    public static void stampCharacter(Character c) {
        System.out.println(c);
    }
}

