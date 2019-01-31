package com.olympic;

public class Judoka extends Athlete {
    private int weight;

    public Judoka(String athleteName, String[] achievements, int weight) {
        super(athleteName, achievements);
        this.weight = weight;


    }

    public int getAthleteJudoka() {         //Standard method
        return weight;

    }

    public void printJudoka() {
        System.out.println(getAthleteJudoka() + " - kg, permitted weight");
    }
}

