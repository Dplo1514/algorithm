package com.algorithmStudy.test.backjoon;

import java.util.Scanner;

public class backjoon_10872_factorial {

    static int factorialRecursion(int param) {
        if (param <= 1) return 1;

        return param * factorialRecursion(param - 1);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int param = scanner.nextInt();
        scanner.close();
        int result = factorialRecursion(param);

        System.out.println(result);
    }
}
