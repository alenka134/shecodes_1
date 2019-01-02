package DemoPack;

public class Car {

    //Instance Variables
    private int yearModel;
    private String model;
    private int speed;

    //Car Constructor
    public Car(int year, String m) {

        yearModel = year;
        model = m;
        speed = 20;

    }

    //Standard Accessor methods


    public int getYearModel() {
        return yearModel;

    }

    public String getModel() {
        return  model;

    }

    public int getSpeed() {
        return speed;
    }

    //Methods that perform calculations
    public void accelerate() {
        speed = speed + 10;
        System.out.println("My 1st car is " + model + ": " + yearModel);
        System.out.println("Accelerated speed " + speed);
    }

    public void brake() {
        speed = speed - 10;
        System.out.println("Brake speed: " + speed);
    }
}
