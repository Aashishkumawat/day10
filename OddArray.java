package com.bl.day10;

public class OddArray {
    public static void main(String[] args) {
        int num[] = {2,15,8,23,16,89,44};
        for(int i=0; i< num.length; i=i+2){
            System.out.println(num[i]);
        }
    }
}
