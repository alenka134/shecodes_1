package com.company;

public class MainBlockFlight {
    public static void main(String[] args) {
        BlockFlight TLVtoNYC = new BlockFlight();
        int seats;
        seats = 20;
       boolean[] isSeatAvailable;
        {
            isSeatAvailable = new boolean[seats];
        for (int i = 0; i < seats; i++ )
        isSeatAvailable[i] = true;


        }

        int flightNumber;
        flightNumber = 3724;

       System.out.println("Seats ="+ seats);
       System.out.println("Flight Number = "+ flightNumber);

    }
}