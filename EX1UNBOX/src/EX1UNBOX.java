public class EX1UNBOX {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        char character = 'A';
        Integer numInt1 = 15;
        Integer numInt2 = 12;
        Double numDouble = 3.14;
        Character charCharacter = 'B';

        Integer numeroIntegerAutoBoxing = num1;
        Double numeroDoubleAutoBoxing = numDouble;
        Character carattereAutoBoxing = character;


        int numeroInteroUnboxing = numInt1;
        double numeroDoubleUnboxing = numDouble;
        char carattereUnboxing = charCharacter;
        System.out.println(numeroInteroUnboxing);
        System.out.println(numeroDoubleUnboxing);
        System.out.println(carattereUnboxing);
        System.out.println(numeroIntegerAutoBoxing);
        System.out.println(numeroDoubleAutoBoxing);
        System.out.println(carattereAutoBoxing);
    }

    public static void stampSum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println(sum);
    }

    public static void stampCharacter(char character) {
        System.out.println(character);
    }

    public static void stampSum(Integer numInt1, Integer numInt2) {
        int sum = numInt1 + numInt2;
        System.out.println(sum);
    }

    public static void stampCharacter(Character c) {
        System.out.println(c);
    }
}

