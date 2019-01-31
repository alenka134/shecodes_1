package DemoPack.Lesson11.Interface.ComparableExample;

import java.util.*;

public class TestSort1 {
    public static void main(String[] args) {

        ArrayList<Aspirant> al = new ArrayList<Aspirant>();
        al.add(new Aspirant(101, "Vijay", 23));
        al.add(new Aspirant(105, "Ajay", 27));
        al.add(new Aspirant(106, "Jay", 21));

        Collections.sort(al);
        for(Aspirant aspirant:al){
            System.out.println(aspirant.number + " " + aspirant.name + " " + aspirant.age);
        }
    }
}
