package com.algorithmStudy.test.backjoon;

import java.util.Scanner;

public class backjoon_2739_for {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int i = 1 ;

        while (i < 10) {
            System.out.println(input + " * " + i + " = " + input * i);
            i++;
        }
    }
}
