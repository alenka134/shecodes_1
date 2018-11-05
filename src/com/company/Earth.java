package com.company;

public class Earth {
    public static void main(String[] args) {
        long circumferenceInMiles = 24901;
        long circumferenceInKm =
                Math.round(circumferenceInMiles * 1.6d);

System.out.println("R, (km) = " + circumferenceInKm);
    }
}