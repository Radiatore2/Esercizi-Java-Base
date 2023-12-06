package EX1LINKLIST;

import java.util.LinkedList;

public class EX1LINKLIST {
    public static void main(String[] args) {
        LinkedList<String> fruit = new LinkedList<String>();

        fruit.add("Mela");
        fruit.add("Banana");
        fruit.add("Arancia");

        System.out.println(fruit);

        fruit.addFirst("Limone");
        fruit.addLast("Anguria");


        System.out.println(fruit);

    }

    private static void printFruitList(LinkedList<String> fruit) {
        for (String Fruit : fruit) {
            System.out.println(fruit);
        }
    }
}
