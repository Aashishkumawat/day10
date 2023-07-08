package com.bl.day10;

public class Largest {
    public static void main(String[] args) {
        int number[] = {25, 13, 5, 89, 56};
        int max = number[0];
        for (int i = 0; i < number.length; i++) {
             if (number[i] > max) {
                max=number[i];

            }
        }
        System.out.println(max);
    }
}