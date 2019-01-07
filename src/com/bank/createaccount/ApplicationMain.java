package com.bank.createaccount;

public class ApplicationMain {
    public static void main(String[] args) {
        Checking checking = new Checking("lena", 12.9, 10.0);
        Saving saving = new Saving("lenaUSD", 1500.0, "USD");
        COD cod = new COD("Lena Lena", 1512.0, 6);

        checking.print();
        checking.printbankAccount();
        saving.printCurrency();
        cod.printCOD();
    }
}
