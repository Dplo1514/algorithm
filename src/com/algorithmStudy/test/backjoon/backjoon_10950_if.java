package com.algorithmStudy.test.backjoon;

import java.util.Scanner;

public class backjoon_10950_if {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        int[] array = new int[x];

        for (int i = 0; i < array.length; i++) {
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            array[i] = y + z;
            System.out.println(array[i]);
        }
    }
}
