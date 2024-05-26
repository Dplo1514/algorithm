package com.algorithmStudy.test.programmers.LvBasic;

public class programmers_findingTheRemainderBasic_03 {
    // Q :  정수 num1, num2가 매개변수로 주어질 때, num1를 num2로 나눈 나머지를 return 하도록 solution 함수를 완성해주세요.
    // 제한 : 0 ≤ num1 ≤ 100 , 0 ≤ num2 ≤ 100
    static int solution(int num1, int num2) {
        if (num1 < 0 || num1 > 100 || num2 < 0 || num2 > 100) throw new IllegalArgumentException();
        return num1 % num2;
    }

    public static void main(String[] args) {
        int result = solution(100, 0);
        System.out.println("solution = " + result);
    }
}