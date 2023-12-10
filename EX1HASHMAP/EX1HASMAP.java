package EX1HASHMAP;

import java.util.HashMap;
import java.util.Map;

public class EX1HASMAP {
    public static void main(String[] args) {

        Map<String, Integer> hashMap1 = new HashMap<>();
        hashMap1.put("Londra", 10);
        hashMap1.put("Milano", 20);
        hashMap1.put("Parigi", 30);

        // Metodo 2: Inizializzazione con in-line initialization
        Map<String, Integer> hashMap2 = new HashMap<>() {{
            put("LondraCity", 40);
            put("MilanoCity", 50);
            put("ParigiCity", 60);
        }};

        Map<String, Integer> tempHashMap = new HashMap<>();
        tempHashMap.put("L1", 70);
        tempHashMap.put("M2", 80);
        tempHashMap.put("P3", 90);
        Map<String, Integer> hashMap3 = new HashMap<>(tempHashMap);


        System.out.println("HashMap1:");
        stampaContenutoHashMap(hashMap1);

        System.out.println("\nHashMap2:");
        stampaContenutoHashMap(hashMap2);

        System.out.println("\nHashMap3:");
        stampaContenutoHashMap(hashMap3);
    }


    public static void stampaContenutoHashMap(Map<String, Integer> hashMap) {
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Chiave: " + entry.getKey() + ", Valore: " + entry.getValue());
        }
    }
}
