package DemoPack.Lesson14.ArrayList.HashMapSet;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Create the HashMap
        HashMap<String, String> hm = new HashMap<>();

        // Put data
        hm.put("Katie", "Android, Wordpress");
        hm.put("Magda", "FB");
        hm.put("Vanda", "Tools");
        hm.put("Elena", "Java");
        hm.put("Elena", "Web"); // Put another data under the same key, old data will override

        // HashMap iteration
        for (String key: hm.keySet())
            System.out.println(key + ":" + hm.get(key));
        System.out.println();

        if (hm.containsValue("Cooking"))
            System.out.println("Hashmap contains value 'Cooking'");
        else
            System.out.println("Hashmap DOESN't contain value 'Cooking'");
    }
}
