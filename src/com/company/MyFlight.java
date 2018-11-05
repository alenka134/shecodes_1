package com.company;

public class MyFlight {
    public static void main(String[] args) {
        ReturnValues lax1 = new ReturnValues();
        ReturnValues lax2 = new ReturnValues();

        // add passengers to both flights

        ReturnValues lax3 = null;
        if (lax1.hasRoom(lax2)) {
            lax3 = lax1.createNewWithBoth(lax2);
            // do some other work
        System.out.println(lax3);
        }

        if (lax3 != null) {
            System.out.println("Flights combined");
        }
    }

}

