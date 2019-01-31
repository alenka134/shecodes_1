package com.olympic;

public class RhythmicGymnasticGroup extends Athlete {
    private String apparatus;

    public RhythmicGymnasticGroup(String athleteName, String apparatus, String[] achievements) {
        super(athleteName, achievements);
        this.apparatus = apparatus;
    }

    public String getApparatus() {
        return apparatus;
    }

    public void printRhytm() {
        System.out.println("Gym performance with " + apparatus);
    }
}

