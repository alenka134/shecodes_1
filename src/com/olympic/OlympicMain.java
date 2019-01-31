package com.olympic;

public class OlympicMain {
    public static void main(String[] args) {
        Athlete athlete = new Athlete();
        Judoka judoka = new Judoka("Yerden Gerbi",new String[] {"gold - 2013", "silver - 2014", "bronze - 2016"}, 63);
        RhythmicGymnasticGroup rhythmicGymnasticGroup = new RhythmicGymnasticGroup("Linoi Ashram", "Ball", new String[]{"gold - 2017"});
        Swimmer swimmer = new Swimmer("Amit Irvy", 500, "freestyle ", new String[]{"bronze - 2016"});

        judoka.printAthlete();
        judoka.printJudoka();
        rhythmicGymnasticGroup.printAthlete();
        rhythmicGymnasticGroup.printRhytm();
        swimmer.printAthlete();
        swimmer.printSwimmer();

    }
}
