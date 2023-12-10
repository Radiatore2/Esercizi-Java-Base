package EX2HASHMAP;

import java.util.HashMap;
import java.util.*;

public class EX2HASHMAP {
    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "Primo");
        hashMap.put(3, "Terzo");
        hashMap.put(2, "Secondo");
        hashMap.put(4, "Quarto");

        Collection<String> valori = hashMap.values();

        System.out.println("Valori ordinati:");
        for (String valore : hashMap.values()) {
            System.out.println(valore);
        }
    }
}
