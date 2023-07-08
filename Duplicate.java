package com.bl.day10;

public class Duplicate {
    public static void main(String[] args) {
        int element[] = {1,2,3,4,5,2,6,3,7,8,8};
        for(int i=0; i< element.length; i++){
            for(int j=i+1; j< element.length; j++){
                if(element[i]==element[j]){
                    System.out.println(element[j]);
                }
            }
        }
    }
}
