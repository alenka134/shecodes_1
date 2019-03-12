package DemoPack.Lesson14.ArrayList.Exercises;

import java.util.ArrayList;

public class ColorList {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();  //--> ArrayList that accepts str elements.

        ArrayList<Integer> list = new ArrayList<>(); //--> ArrayList that accepts int elements.

        arrayList.add("Red");
        arrayList.add("Blue");
        arrayList.add("Black");

        //displaying str elements
        System.out.println(arrayList);

        arrayList.add(2, "White"); //adding WHITE at the two position and
                                                    //display it
        System.out.println(arrayList);

        list.add(1);
        list.add(2);
        list.add(34);

        System.out.println(list);

        list.add(1, 90);
        System.out.println(list);
    }
}
