package com.company;

public class Main {

    public static void main(String[] args) {

        //for example
        System.out.println(calculate(12, 13, 14, 15));
    }
    public static float calculate(float a, float b, float c, float d){
        return  a * (b + (c / d));
    }
}
