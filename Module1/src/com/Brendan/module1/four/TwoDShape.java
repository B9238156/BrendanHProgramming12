package com.Brendan.module1.four;

public abstract class TwoDShape {


    private double width;

    private double height;

    public Colour colour;

    /**
     * compute TwoDShape
     * @param width
     * @param height
     * @param colour
     */
    TwoDShape(double width, double height, Colour colour){
        this.width = width;
        this.height = height;
        this.colour =  colour;
    }

    TwoDShape(){
        width = 0;
        height = 0;
    }

    public abstract double getArea();


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
