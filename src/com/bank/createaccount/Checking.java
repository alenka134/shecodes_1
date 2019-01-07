package com.bank.createaccount;


public class Checking extends BankAccount {

    private double limit;                    //Instance Variables


    public Checking(String account, double balance, double limit) {
        super(account, balance);
        this.limit = limit;
    }


    public double getAccountLimit() {         //Standard method
        return limit;

    }

    public void print (){
        System.out.println(getAccountLimit() + " - account limit");
    }



}





