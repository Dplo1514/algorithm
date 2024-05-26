package com.algorithmStudy.test.backjoon;

import java.util.Scanner;

public class backjoon_9498_if {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        scanner.close();

        if (score >= 90 && score <= 100) System.out.println("A");
        else if (score >= 80 && score <= 89) System.out.println("B");
        else if (score >= 70 && score <= 79) System.out.println("C");
        else if (score >= 60 && score <= 69) System.out.println("D");
        else System.out.println("F");
    }

}
