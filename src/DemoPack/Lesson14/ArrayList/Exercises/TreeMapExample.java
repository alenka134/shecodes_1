package DemoPack.Lesson14.ArrayList.Exercises;

import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;

public class TreeMapExample {
    public static void main(String[] args) {
// This is how declare TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        //Adding elements to TreeMap
        treeMap.put(1, "Data1");
        treeMap.put(23, "Data2");
        treeMap.put(77, "Data3");
        treeMap.put(17, "Data4");

        //Display content using Iterator
        Set set = treeMap.entrySet();
        Iterator iterator = set.iterator();

        //Maintains descending order
        System.out.println("\nDescending order Map: " + treeMap.descendingMap());
        System.out.println("\nIt is used to return the last (highest) key currently in the sorted map--> " + treeMap.lastKey());

        while (iterator.hasNext()) {
            Map.Entry mapEntry = (Map.Entry) iterator.next();

            System.out.println("Key is: " + mapEntry.getKey() + " & Value is: " + mapEntry.getValue());


        }
    }
}



