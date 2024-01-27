package com.Brendan.module1.three;

public class Triangle extends TwoDShape implements Rotate {
    private double side1;

    private double side2;

    private double side3;

    private double height;

    private double rotate;



    public Triangle(double width, double height) {
        super(width, height);
    }
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.height = heronsHeight();
        this.rotate = 0;

    }

    @Override
    public double getArea(){
        double s;
        double a;
        s =(side1 + side2 + side3)/2;
        a = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return a;
    }

    private double heronsHeight(){
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

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public void setHeight(double height) {
        this.height = height;
    }

    public String toString(){
       return  "I am a triangle with the sides " + side1 + " and " + side2 + " and " + side3 + " and a height of " + heronsHeight();
    }

    @Override
    public void rotate90(){
        rotate += 90;
    }


    @Override
    public void rotate180(){
        rotate += 180;
    }
    @Override
    public void rotate(double degree){
        rotate +=  degree;
    }

}

