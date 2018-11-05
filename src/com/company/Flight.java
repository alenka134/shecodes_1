package com.company;

public class Flight {
    int passendgers;
    int seats;

    Flight() {

        seats = 150;
        passendgers = 160;
    }

    void add1Passendger() {
        if (passendgers < seats)
            passendgers += 1;
        else
            handleTooMany();
    }

    void handleTooMany() {
        System.out.println("Too many passengers");
    }
}
