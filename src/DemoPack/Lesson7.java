package DemoPack;

public class Lesson7 {
    public static void main(String[] args) {

        Planner cessna172 = new Planner(4, 140, 56.5, 9.5);    // creates objects of class aircraft
        Planner piperSaratoga = new Planner(6, 210, 100.5, 20.5);

        System.out.println("Cessna 172 time in the air: " + cessna172.calculateEndurance() + " hrs");
        System.out.println("\nPiper Saratoga time in the air: " + piperSaratoga.calculateEndurance() + " hrs");
    }

}

//class planner {
