package com.brendan.module2.one;

public class Main {
    public static void main(String[] args) {

        PlanetType planetType = new PlanetType("Giant");
        Planet planet = new Planet("Saturn",planetType);
        System.out.println(planet.toString());
    }
}