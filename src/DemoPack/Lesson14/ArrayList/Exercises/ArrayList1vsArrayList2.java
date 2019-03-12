package DemoPack.Lesson14.ArrayList.Exercises;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1vsArrayList2 {
    public static void main(String[] args) {


        List<Integer> l1 = new ArrayList<>();

        l1.add(1);
        l1.add(2);
        l1.add(3);

        List<Integer> l2 = new ArrayList<>();
        l2.add(10);
        l2.add(2);
        l2.add(30);

        System.out.println("l1 == " + l1);
        System.out.println("l2 == " + l2);

        List<Integer> l3 = new ArrayList<>(l2);
        l3.retainAll(l1);

        System.out.println("l3 == " + l3);

    }
}