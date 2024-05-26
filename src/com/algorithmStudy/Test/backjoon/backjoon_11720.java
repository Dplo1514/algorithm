package com.algorithmStudy.test.backjoon;

import java.util.Scanner;

public class backjoon_11720 {

    /*
        N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
        @Input
            * 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
            * Example : 5 \n 54321
        @OutPut
            * 입력으로 주어진 숫자 N개의 합을 출력한다.
            * Example : 15
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        String stringNum = sc.next();
        sc.close();
        char[] charArray = stringNum.toCharArray();
        int result = 0;
        // String -> Int : String ASCII Code - 48 = Int ASCII Code
        for (char c : charArray) {
            result += (c - 48);
        }
        System.out.println(result);
    }

}
