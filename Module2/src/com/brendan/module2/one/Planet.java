package com.brendan.module2.one;

public class Planet {
    private String designation;
    private double massKg;
    private double orbitEarthYears;
    private PlanetType type;

    public Planet(String designation, PlanetType type){
        this.designation = designation;
        this.type = type;
    }

    public Planet(String designation, double massKg, double orbitEarthYears, PlanetType type) {
        this.designation = designation;
        this.massKg = massKg;
        this.orbitEarthYears = orbitEarthYears;
        this.type = type;
    }


    @Override
    public int hashCode() {
        return designation.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Planet){
            Planet otherPlanet = (Planet)obj;
            return this.designation.equals(otherPlanet.designation);
        }
        return false;
    }

    @Override
    public String toString(){
        return "Designation: " + designation + "\tType: " + type;
    }

}
