package com.algorithmStudy.test.backjoon;

import java.util.Scanner;

public class backjoon_11720_String {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        String str = scanner.next();
        String[] split = str.split("");
        int result = 0;
        scanner.close();

        for (int i = 0; i < str.length(); i++) {
            result += Integer.parseInt(split[i]);
        }

        System.out.println(result);

    }

}
