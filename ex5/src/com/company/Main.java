package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(check(0));
    }
    public static int check(int a){
        if (a < 0){
            System.out.println("You entered negative num");
        }else if (a >= 0){
            System.out.println("You entered positive num");
        }
        return a;
    }
}
