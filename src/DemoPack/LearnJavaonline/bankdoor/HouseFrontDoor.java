package DemoPack.LearnJavaonline.bankdoor;

public class HouseFrontDoor extends Door {
    private String keys;


    public HouseFrontDoor (String keys) {
        super();


        this.keys = keys;

    }

    public void equals() {
        if (keys == "Yes") {
            System.out.println("\nHouse:\nYou have keys from your house!!!");
            open();
        } else if (keys == "No") {

            {
                System.out.println("\nHouse:\nYou have not keys, go to find them!!!");
                close();
            }
        }
    }
}

