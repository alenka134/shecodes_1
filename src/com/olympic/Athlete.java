package com.olympic;

import java.util.Arrays;

public class Athlete {

    String athleteName;
    String[] achievements;

    public Athlete() {

    }


    public Athlete(String athleteName, String[] achievements) {
        super();
        this.athleteName = athleteName;
        this.achievements = achievements;
    }

    public String getAthleteName() {
        return athleteName;

    }

    public String[] getAchievements() {
        return achievements;
    }


    @Override
    public String toString() {
        return "Athlete [athleteName =" + athleteName +
                ", achievements=" + Arrays.toString(achievements) + "]";
    }

    public void printAthlete() {
        System.out.println("\n" + getAthleteName() + " - athlete name; \n" + Arrays.toString(achievements) + " - athlete achievements ");
    }
}



