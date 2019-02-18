package DemoPack.Lesson14.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {
    public static void main(String[] args) {
        ArrayList<String> stringArray = new ArrayList<>();

        //add element to ArrayList
        stringArray.add("Biber");
        stringArray.add("Solange");
        stringArray.add("Lopes");

        //Create iterator
        Iterator <String>itr = stringArray.iterator();

        //iterate over stringArray
        while (itr.hasNext()) {
            String elementFromArrayList = itr.next();
            System.out.println(elementFromArrayList);
        }
    }
}
