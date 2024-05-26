package com.algorithmStudy.test.programmers.LvBasic;

import java.util.Arrays;

public class programmers_averageOfArray_11 {
    // Q : 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
    // 제한 : 0 ≤ numbers의 원소 ≤ 1,000 , 1 ≤ numbers의 길이 ≤ 100 , 정답의 소수 부분이 .0 또는 .5인 경우만 입력으로 주어집니다.

    // 성능 1 / 다른 사람의 풀이
    static double solution_example2(int[] numbers) {
        double answer = 0;

        int sum = 0;
        for(int i: numbers){
            sum+=i;
        }
        answer = sum/(double)numbers.length;
        return answer;
    }

    // 성능 2 / 내 풀이
    static double solution(int[] numbers) {
        double len = numbers.length;
        if (len < 1 || len > 100) throw new IllegalArgumentException();
        return Arrays.stream(numbers).sum() / len;
    }

    // 성능 3 / 다른 사람의 풀이
    static double solution_example(int[] numbers) {
        return Arrays.stream(numbers).average().orElse(0);
    }


    public static void main(String[] args) {
        double result = solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        System.out.println("solution = " + result);
    }
}