package DemoPack;


public class Tutorial {
    public static void main(String[] args) {
        Student lobster = new Student("Boris", 78);
        Student tortille = new Student("Alex", 98);

        lobster.display();
        tortille.display();

        Student group = new Student(2, "Medicine");
        group.display1();
    }
}
