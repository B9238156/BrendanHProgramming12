package com.brendan.module3.two;

public class Main {
    public static void one(int n){
        if (n == 7){
            return;
        }
        System.out.println(n);
        one(n -2);
    }
    public static void main(String[] args){
        one(25);
    }
}
