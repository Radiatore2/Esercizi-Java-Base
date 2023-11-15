public class EX1TRYCATCH {
    public static void main(String[] args) {

        int num = 6;
        int min = 1;
        int max = 10;

        try {
            boolean range = checkRange(num, min, max);
            System.out.println(range);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean checkRange(int number, int min, int max) throws Exception {
        if (number >= min && number <= max) {
            return true;
        } else {
            throw new Exception("Non è nel range");
        }
    }
}


