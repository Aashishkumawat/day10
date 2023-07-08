package com.bl.day10;

import java.util.*;
public class Findfreqarray {

    public static void main(String args[]) {

        int t, i, j, len, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements to insert in an array: ");
        len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter elements to insert in an array: ");
        for (i = 0; i < len; i++) {
            t = sc.nextInt();
            arr[i] = t;
        }
        System.out.println("\n");
        for (i = 0; i < len; i++) {
            count = 1;
            for (j = i + 1; j <= len - 1; j++) {
                if (arr[i] == arr[j] && arr[i] != '\0') {
                    count++;
                    arr[j] = '\0';
                }
            }
            if (arr[i] != '\0') {
                System.out.println(arr[i] + " is " + count + " times.\n");
            }
        }
    }
}