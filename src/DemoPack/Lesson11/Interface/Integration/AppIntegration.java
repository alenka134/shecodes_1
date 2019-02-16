package DemoPack.Lesson11.Interface.Integration;

public class AppIntegration {
    public static void main(String[] args) {

        Machine mach1 = new Machine();
        mach1.start();

        Person person1 = new Person("Bob");
        person1.greet();

        Info info1 = new Machine();
        info1.showInfo();

        Info info2 = person1;
        info2.showInfo();

        System.out.println("___________");

        outputinfo(mach1);
        outputinfo(person1);
    }
    private static void outputinfo(Info info){
        info.showInfo();
    }
}
