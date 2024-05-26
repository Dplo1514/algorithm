package com.algorithmStudy.test.backjoon;

import java.util.Scanner;

public class backjoon_10870_fibonacciNumbers {
    static int fibonacci(int N){
        if (N == 0) return 0;
        if (N == 1) return 1;

        int result = fibonacci(N - 1) + fibonacci(N -2);
        
        return result;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(fibonacci(scanner.nextInt()));
    }
}
