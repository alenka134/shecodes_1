package com.bank.createaccount;

public class COD extends BankAccount {

    private int transfers;                    //Instance Variables


    public COD(String account, double balance, int transfers) {
        super(account, balance);
        this.transfers = transfers;
    }


    public int getAccountTransfers() {         //Standard method
        return transfers;

    }

    public void printCOD() {
        System.out.println(getAccountTransfers() + " - number of transfers allowed");
    }

}
