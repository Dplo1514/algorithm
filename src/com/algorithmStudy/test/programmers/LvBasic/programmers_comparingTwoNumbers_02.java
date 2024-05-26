package com.algorithmStudy.test.programmers.LvBasic;

public class programmers_comparingTwoNumbers_02 {
    // Q : 정수 num1과 num2가 매개변수로 주어집니다. 두 수가 같으면 1 다르면 -1을 retrun하도록 solution 함수를 완성해주세요.
    // 제한 : 0 ≤ num1 ≤ 10000 , 0 ≤ num2 ≤ 10000
    static int solution(int num1, int num2) {
        if (num1 < 0 || num1 > 10000 || num2 < 0 || num2 > 10000) throw new IllegalArgumentException();
        return num1 == num2 ? 1 : -1;
    }

    public static void main(String[] args) {
        int result = solution(1, 1);
        System.out.println("solution = " + result);
    }
}