package DemoPack;

public class Dog {
    public static void main(String[] args) {

        aircraft cessna172 = new aircraft();    // creates objects of class aircraft
        aircraft piperSaratoga = new aircraft();

//double cessna172Endurance;
//double piperSaratogaEndurance;

        cessna172.passengers = 4;
        cessna172.cruiseSpeed = 140;
        cessna172.fuelCapacity = 56.5;
        cessna172.fuelBurnRate = 9.5;


        // System.out.println("Cessna 172 passengers: " + cessna172.passengers);
        // System.out.println("Cessna 172 Fuel Burn Rate: " + cessna172.fuelBurnRate + " gph");

        piperSaratoga.passengers = 6;
        piperSaratoga.cruiseSpeed = 210;
        piperSaratoga.fuelCapacity = 100.5;
        piperSaratoga.fuelBurnRate = 20.5;

        System.out.println("Cessna 172");
        cessna172.calculateEndurance();
        System.out.println("For Cessna172 to fly 4.5 hr, it takes " + cessna172.fuelNeeded(4.5) + " gallons of fuel");

        System.out.println("\nPiper Saratoga");
        piperSaratoga.calculateEndurance();
        System.out.println("For Piper Saratoga to fly 5.5 hr, it takes " + piperSaratoga.fuelNeeded(5.5) + " gallons of fuel");


        //  cessna172Endurance = cessna172.fuelCapacity / cessna172.fuelBurnRate;
        // System.out.println("Cessna 172 endurance: " + cessna172Endurance + " hours in the air");

        //  piperSaratogaEndurance = piperSaratoga.fuelCapacity / piperSaratoga.fuelBurnRate;
        //  System.out.println("Piper Saratoga endurance: " + piperSaratogaEndurance + " hours in the air");

        // System.out.println("Piper Saratoga passengers: " + piperSaratoga.passengers);
        //  System.out.println("Piper Saratoga cruise speed: " + piperSaratoga.cruiseSpeed + " mph");

    }

}

class aircraft {
    int passengers;                 // number of people
    int cruiseSpeed;                // miles per hour
    double fuelCapacity;            // gallons
    double fuelBurnRate;            // gallons per hour

    // method to calculate endurance

    double calculateEndurance() {
        double endurance;
        endurance = fuelCapacity / fuelBurnRate;

        System.out.println("The endurance is " + endurance + "hours.");

        return endurance;
        // System.out.println("The endurance is " + endurance + "hours.");

    }

    double fuelNeeded(double time) {

        return fuelBurnRate * time;
    }
}