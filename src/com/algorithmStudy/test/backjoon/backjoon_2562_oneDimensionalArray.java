package com.algorithmStudy.test.backjoon;

import java.util.Scanner;

public class backjoon_2562_oneDimensionalArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[9];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int max = array[0];
        int idx = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                idx = i;
            }
        }

        System.out.println(max);
        System.out.println(idx + 1);
    }
}
