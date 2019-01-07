package com.bank.createaccount;

public class Saving extends BankAccount {

    private String currency;                    //Instance Variables


    public Saving(String account, double balance, String currency) {
        super(account, balance);
        this.currency = currency;
    }


    public String getAccountSaving() {         //Standard method
        return currency;

    }

    public void printCurrency() {
        System.out.println(getAccountSaving() + " - account currency");
    }

}