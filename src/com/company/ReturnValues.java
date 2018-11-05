package com.company;

public class ReturnValues {
    private int passengers ;
    private int seats;


    public boolean hasRoom(ReturnValues f2) {
       int total = this.passengers + f2.passengers;
       return total <= seats;
    }

    public ReturnValues createNewWithBoth(ReturnValues f2) {

     ReturnValues newReturnValues = new ReturnValues();
     newReturnValues.seats = seats;
     newReturnValues.passengers = passengers + f2.passengers;
     return newReturnValues;

    }

}

