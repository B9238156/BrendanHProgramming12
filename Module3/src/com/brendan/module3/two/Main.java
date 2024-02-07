package com.brendan.module3.two;

public class Main {
    public static void one(int n){
        if (n < 9){
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

    public static void three(int n1, int n2){
        if(n1 > 68){
            return;
        }
        System.out.println(n1);
        three(n2, n1 + n2);
    }

    public static void four(int n1, int n2){
        if(n1 > 102){
            return;
        }
        System.out.println(n1);
        four(n2, n1 + n2);
    }


    public static void main(String[] args) {
        System.out.println("*** one ***");
        one(25);
        System.out.println("*** two ***");
        two(1);
        System.out.println("*** three ***");
        three(2, 2);
        System.out.println("*** four ***");
        four(3,3);
    }
}
