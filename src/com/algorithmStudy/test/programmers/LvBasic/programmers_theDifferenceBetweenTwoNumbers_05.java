package com.algorithmStudy.test.programmers.LvBasic;

public class programmers_theDifferenceBetweenTwoNumbers_05 {
    // Q : 정수 num1과 num2가 주어질 때, num1에서 num2를 뺀 값을 return하도록 soltuion 함수를 완성해주세요.
    // 제한 : -50000 ≤ num1 ≤ 50000 , -50000 ≤ num2 ≤ 50000
    static int solution(int num1 , int num2) {

        if (num1 < -50000 || num1 > 50000 || num2 < -50000 || num2 > 50000 ) throw new IllegalArgumentException();
        return num1 - num2;
    }

    public static void main(String[] args) {
        int result = solution(25 , 30);
        System.out.println("solution = " + result);
    }
}