package com.brendan.module3.two;

public class Main {
    public static void one(int n){
        if (n == 7){
            return;
        }
        System.out.println(n);
        one(n -2);
    }

    public static void two(int n){
        if (n > 256){
            return;
        }
        System.out.println(n);
        two(n * 2);
    }


    public static void main(String[] args){
        System.out.println("*** one ***");
        one(25);
        System.out.println("*** two ***");
        two(1);
        System.out.println("*** three ***");
    }
}
