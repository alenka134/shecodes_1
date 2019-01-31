package DemoPack.LearnJavaonline.bankdoor;

public class UniversalDoorKey extends Door {
    //Instance Variables
    private String nameDoor;
    private int numberOfLockers;
    private double speedOfOpen;

    // Constructor
    public UniversalDoorKey(String nameDoor, int numberOfLockers) {
        super("Bank");
        this.nameDoor = nameDoor;
        this.numberOfLockers = numberOfLockers;
        speedOfOpen = 20.6;

    }

    //Standard methods

    public String getNameDoor() {
        return nameDoor;

    }

    public void printUniversalDoorKey() {
        int fit;

        nameDoor = getNameDoor();

        fit = getNameDoor().compareTo(getName());

        if (fit > 0 || fit < 0) {

            System.out.println("Name of the door does not fit");
            close();

        } else if (fit == 0) {
            System.out.println("\nDoor is: \n" + getNameDoor() + "\nDoor is fit!");
            open();
        }
    }
}