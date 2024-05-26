package com.algorithmStudy.test.backjoon;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class backjoon_11654_String {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        byte[] bytes = input.getBytes(StandardCharsets.UTF_8);

        System.out.println(bytes[0]);
    }
}
