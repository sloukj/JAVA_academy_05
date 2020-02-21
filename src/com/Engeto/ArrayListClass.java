package com.Engeto;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListClass {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Integer inputValue = Integer.valueOf(scanner.nextLine());
            if (inputValue == 0) break;
            list.add(inputValue);
        }
        System.out.println();
        System.out.println(list.get(1) + list.get(2));
    }
}
