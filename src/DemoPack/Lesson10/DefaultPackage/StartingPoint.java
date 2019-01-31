package DemoPack.Lesson10.DefaultPackage;

import DemoPack.Lesson10.Character.Tommy;

public class StartingPoint {
    public static void main(String[] args) {
        Tommy tommy = new Tommy();              //creating object with data from other package, IMPORT CHARACTER.TOMMY
        System.out.println(tommy.getHealth());

        Travis travis = new Travis();
        int i = travis.health;
        System.out.println(travis.getHealth());
    }
}
