package DemoPack.LearnJavaonline.bankdoor;

public class BankVaultDoor extends Door {
    private int code;

    public BankVaultDoor(int code) {
        super();
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void printBankVaultDoor() {
        enterCombination();
        pull();
    }

    private void enterCombination() {
        System.out.println("\n Bank: \nEnter bank door open combination: " + getCode());
    }

    private void pull() {
        System.out.println("You can pull the door");
        open();
    }


}
