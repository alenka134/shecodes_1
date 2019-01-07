package com.bank.createaccount;

public class BankAccount {
    private String account;
    private double balance;

    public BankAccount(String account, double balance) {           //Checking Constructor
        this.account = account;
        this.balance = balance;
    }


    public String getBankAccount() {         //Standard method
        return account;
    }

    public double getBalance() {
        return balance;
    }

    public void printbankAccount() {
        System.out.println(getBankAccount() + " - bank account name; \n" + getBalance() + " - bank account balance");
    }
}




