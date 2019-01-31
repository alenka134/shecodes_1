package DemoPack.LearnJavaonline.bankdoor;

public class CarDoor extends Door {
    private String car;
    private String remoteControl;


    public CarDoor(String car, String remoteControl) {
        super();
        this.car = car;
        this.remoteControl = remoteControl;


    }

    public String getCar() {
        return car;
    }

    public String getRemoteControl() {
        return remoteControl;
    }

    public void printCarDoor() {
        int result;

        car = getCar();
        remoteControl = getRemoteControl();
        result = getCar().compareTo(remoteControl);

        if (result > 0 || result < 0) {

            System.out.println("Car RC does not fit for this car");
            close();

        } else if (result == 0) {
            System.out.println("Car: \nCar model is: " + getCar() + "\nRemote control is correct!");
            open();
        }

    }
}

