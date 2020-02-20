package com.Engeto;

public class ShortCircuit {
    public static void main(String[] args){
        int i = 10;
        System.out.println(i++);    // 10
        System.out.println(i);      // 11
        System.out.println(++i);    // 12

        if(++i < 30 || i > 5){
            System.out.println();
        }
        System.out.println(i);
    }
}
