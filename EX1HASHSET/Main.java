import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<String> fruit = new HashSet<String>();

        fruit.add("Mela");
        fruit.add("Pera");
        fruit.add("Arancia");

        System.out.println(fruit.size());
        System.out.println(fruit);
    }
}