package DemoPack.Lesson11.Interface.Integration;

public class Person implements Info {

    private String name;

    public Person(String name){
        this.name = name;
    }
    public void greet(){
        System.out.println("Hello here.");
    }

    public void showInfo() {
        System.out.println("Person name is: " + name);
    }
}
