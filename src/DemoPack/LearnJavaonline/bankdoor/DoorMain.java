package DemoPack.LearnJavaonline.bankdoor;

public class DoorMain {
    public static void main(String[] args) {

        BankVaultDoor bankVaultDoor = new BankVaultDoor(1233);
        HouseFrontDoor houseFrontDoor = new HouseFrontDoor("Yes");
        CarDoor carDoor = new CarDoor("Mazda", "Mazda");

        Door door = new Door("Bank");
        UniversalDoorKey universalDoorKey = new UniversalDoorKey("Bank", 3);


        carDoor.printCarDoor();
        bankVaultDoor.printBankVaultDoor();
        houseFrontDoor.equals();

        universalDoorKey.printUniversalDoorKey();

    }
}
