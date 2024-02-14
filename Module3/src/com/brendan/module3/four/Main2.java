package com.brendan.module3.four;

public class Main2 {
    public static void main(String[] args) {
        int length = 100000;
        int[] numbers = new int[length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 10000);
        }
        int[] numbers2 = new int[length];
        for (int i = 0; i < numbers2.length; i++) {
            numbers2[i] = (int)(Math.random() * 10000);
        }
        System.out.println("Starting Sorts");
        long start = System.nanoTime();
        numbers = Sorter.mergeSort(numbers);
        numbers2 = Sorter.mergeSort(numbers2);
        long end = System.nanoTime();
        System.out.println("Merge: " + (end - start) / 1000000.00);
    }
}
