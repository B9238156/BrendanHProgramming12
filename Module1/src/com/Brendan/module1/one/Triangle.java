package com.Brendan.module1.one;

public class Triangle extends TwoDShape {
    private double side1;

    private double side2;

    private double side3;

    private double height;
    public Triangle(double width, double height) {
        super(width, height);
    }

    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.height = heronsHeight(side1, side2, side3);

    }

    @Override
    double getArea(){
        double s;
        double a;
        s =(side1 + side2 + side3)/2;
        a = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return a;
    }

    private double heronsHeight(double side1, double side2, double side3){
        double s;
        double a;
        double h;
        s = (side1 + side2 + side3) / 2;
        a = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        h = (a * 2) / side3; //Side 3 is the base
        return h;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public String toString(){
        return super.toString();
    }
}

