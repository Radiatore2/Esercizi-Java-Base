import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static HashSet<String> makingHashSet() {
        HashSet<String> fruit = new HashSet<>();
        fruit.add("Mela");
        fruit.add("Pera");
        fruit.add("Anguria");
        return fruit;
    }
    public static void main(String[] args) {
        HashSet<String> myHashSet = makingHashSet();
        String newFruit = "Lampone";

        Iterator<String> iterator = myHashSet.iterator();
        while (iterator.hasNext()) {
            String elemento = iterator.next();
            if (elemento.equals(newFruit)) {
                iterator.remove();
            }
        }

        myHashSet.clear();

        if (myHashSet.isEmpty()) {
            System.out.println("HashSet is empty");
        } else {
            System.out.println("HashSet is full");
        }
    }
}
