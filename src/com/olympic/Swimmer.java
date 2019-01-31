package com.olympic;

public class Swimmer extends Athlete {
    private int distance;
    private String style;

    public Swimmer(String athleteName, int distance, String style, String[] achievements) {
        super(athleteName, achievements);
        this.distance = distance;
        this.style = style;
    }

    public int getDistance() {
        return distance;
    }

    public String getStyle() {
        return style;
    }

    public void printSwimmer() {
        System.out.println(getDistance() + "m swimming distance " + " and " + getStyle() + "- swimming style");
    }
}


