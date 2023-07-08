package com.bl.day10;

public class smallest {
    public static void main(String[] args) {
        int number[] = {25, 13, 5, 89, 56};
        int min = number[0];
        int max =number[0];
        for (int i = 1; i < number.length; i++) {
            if (number[i] < min) {
                min=number[i];

            }
            if(number[i]>max){
                max=number[i];
            }
        }
        System.out.println("max =" +max);
        System.out.println("min =" +min);
    }
}

