package com.algorithmStudy.test.backjoon;

import java.util.Scanner;

public class backjoon_2292_honeyComb {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int layer = 1;
        int range = 2;

        if (n == 1) {
            System.out.println(1);
        } else {
            while (range <= n) {
                range = range + (layer * 6);
                layer++;
            }
            System.out.println(layer);
        }
    }

}

