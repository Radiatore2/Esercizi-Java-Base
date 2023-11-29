import java.util.Arrays;
import java.util.HashSet;

public class Main {

            public static void main(String[] args) {

                HashSet<String> fruit = new HashSet<String>(Arrays.asList("Mela", "Kiwi", "Ciliegia"));
                String objectToCompare = "Elemento da confrontare";
                removeElements(fruit, objectToCompare);
                fruit.clear();

                System.out.println(fruit);

            }

            private static HashSet<String> fruitHashset() {
                HashSet<String> fruit = new HashSet<String>();

                fruit.add("Mela");
                fruit.add("Pera");
                fruit.add("Banana");
                fruit.add("Lampone");

                return fruit;
            }

            private static void removeElements(HashSet<String> fruit, String controlDuplicate) {
                HashSet<String> fruitRemoved = new HashSet<>();

                for (String element : fruit) {
                    if (element.equals(controlDuplicate)) {
                        fruitRemoved.add(element);
                    }
                }

                fruit.removeAll(fruitRemoved);
            }
        }
