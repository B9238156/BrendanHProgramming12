package com.Brendan.module1.four;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<TwoDShape> shapes = new ArrayList<>();
        shapes.add(new Circle(5, Colour.BLUE));
        shapes.add(new Triangle(9, 5, 7, Colour.GREEN));

        for (TwoDShape s : shapes) {
            System.out.println(s.toString());
            System.out.println("My Area is " + s.getArea());
        }
    }
}