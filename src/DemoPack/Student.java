package DemoPack;

public class Student {
    private String name;
    private int exampoint;
    private boolean result;
    private int group;
    private String faculty;

    //Started constructor:

    public Student(String name, int ep) {
        this.name = name;
        exampoint = ep;
    }
    public Student(int g, String f) {
        group = g;
        faculty = f;
    }

    public void display() {

        System.out.println("\nStudent name: " + name);
        System.out.println("Exam point: " + exampoint);
        System.out.println("Result - " + result);
    }



    public void display1() {

        System.out.println("\nStudents Group - " + group);
        System.out.println("Students Faculte - " + faculty);
    }

}



