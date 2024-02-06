package com.brendan.module3.one;

public class Main {
    /**
     * Fibonacci numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144.....
     * m = (n - 1) + (n - 2)
     * @param n
     * @return
     */
    public static int fibonacci(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }
        return fibonacci(n -1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println("Answer = " + fibonacci(4));
    }
}