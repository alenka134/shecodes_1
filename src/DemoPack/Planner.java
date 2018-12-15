package DemoPack;

public class Planner {
    int passengers;
    int cruiseSpeed;
    double fuelCapacity;
    double fuelBurnRate;

   public Planner(int p, int c, double fc, double fbr) {
        passengers = p;
        cruiseSpeed = c;
        fuelCapacity = fc;
        fuelBurnRate = fbr;

    }

    // method to calculate endurance

   public double calculateEndurance() {
        double endurance;
        endurance = fuelCapacity / fuelBurnRate;

        return endurance;


    }

}