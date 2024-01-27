package com.Brendan.module1.one;

public class TwoDShape {


    private double width;

    private double height;

    TwoDShape(double width, double height){
        this.width = width;
        this.height = height;
    }

    TwoDShape(){
        width = 0;
        height = 0;
    }

    double getArea(){
        return width * height;
    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double  getWidth(){
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }



    public String toString(){
        return super.toString();
    }
}
