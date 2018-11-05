package com.company;

public class PassengerM {

    public static void main (String[] args) {
        Passenger passenger = new Passenger();
        passenger.setCheckedBags(5);
        Passenger fred = new Passenger(2);
        Passenger june =new Passenger(5, 7);
        june.setCheckedBags(5);
        Passenger april = new Passenger (8, 9);
        april.setCheckedBags(8);
        Passenger cheapJoe = new Passenger(0.01d);

    }
}
