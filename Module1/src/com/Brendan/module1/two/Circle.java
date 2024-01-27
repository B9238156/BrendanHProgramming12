package com.Brendan.module1.two;

public class Circle extends TwoDShape{
    public double PI = Math.PI;

    double radius;

     public Circle(double radius){
        this.radius = radius;
    }

   public double getArea(){
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
        return  "I am a circle with a radius of " + radius;
    }

}

