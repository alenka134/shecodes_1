package DemoPack.Lesson11.Interface.ComparableExample;

public class Aspirant implements Comparable<Aspirant> {

    int number;
    String name;
    int age;

    Aspirant(int number, String name, int age){

        this.number = number;
        this.name = name;
        this.age = age;
    }

    public int compareTo(Aspirant aspirant) {
        if(name == aspirant.name)
            return 0;
        else if (name != aspirant.name)
            return -1;
        else
            return 1;
    }
}
