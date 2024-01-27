package com.Brendan.module1.four;

public class Circle extends TwoDShape{
    public double PI = Math.PI;

    double radius;

    /**
     * Compute Circle
     * @param radius
     * @param colour
     */
     public Circle(double radius, Colour colour){
        this.radius = radius;
        this.colour = colour;
    }

    /**
     * Find the Area
     * @return Area or -1 if invalid radius
     */
   public double getArea(){
       if (radius <= 0) {
           return -1;
       }
        return PI * Math.sqrt(radius);
    }

    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString(){
        return  "I am a circle with a radius of " + radius + " and my colour is " + colour;
    }

}

