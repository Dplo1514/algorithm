package com.algorithmStudy.test.backjoon;

import java.util.Scanner;

public class backjoon_1978_primeNumber {
    public static void main(String[] args) {
        //2에서 n-1까지 나눈다 -> 나눠서 나머지가 0이되는 숫자가 하나도 없다면 그 수는 소수이다.
        Scanner scanner = new Scanner(System.in);
        int param = scanner.nextInt();
        int number;
        int result = 0;

        for (int i = 0 ; i < param; i++) {
            int count = 0;
            number = scanner.nextInt();
            if (number != 1) {
                for (int x = 2; x < number; x++) {
                    if (number % x == 0) count++;
                }

                if (count == 0) result++;
            }
        }
        System.out.println(result);
    }
}
