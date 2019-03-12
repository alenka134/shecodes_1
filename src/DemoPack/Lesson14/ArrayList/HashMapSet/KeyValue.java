package DemoPack.Lesson14.ArrayList.HashMapSet;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class KeyValue {
    public static void main(String[] args) {
        // Create the HashMap
        HashMap <String, String> hmap = new HashMap<>();

        //Adding elements to HashMap
        hmap.put("575757", "Ella");
        hmap.put("6586868", "Boris");
        hmap.put("3124353", "Alex");

        //Get values based on key
        String var = hmap.get("575757");

        System.out.println("Person with id 575757 is: " + var); //will print Ella

        //Remove value based on key
        hmap.remove("6586868");

        System.out.println(hmap);

        Set set = hmap.entrySet();

        Iterator iterator = ((Set) set).iterator();

        while (iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();

            System.out.println("Key is: " + mentry.getKey() + " & Value is: " + mentry.getValue());

        }
    }
}
