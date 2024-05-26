package com.algorithmStudy.test.programmers.LvBasic;

import java.util.stream.IntStream;

public class programmers_numberOfOrderedPairs_16 {
    /*
        Q : 순서쌍이란 두 개의 숫자를 순서를 정하여 짝지어 나타낸 쌍으로 (a, b)로 표기합니다.
            자연수 n이 매개변수로 주어질 때 두 숫자의 곱이 n인 자연수 순서쌍의 개수를 return 하도록 solution 함수를 완성해주세요.
     */

    // 제한
    // 1 ≤ n ≤ 1,000,000
    public static int solution_1(int n) {
        int answer = 0;
        int[] ints = IntStream.range(1, n+1).toArray();
        for (int i : ints) {
            if (n % i == 0){
                answer++;
            }
        }
        return answer;
    }

    public static int solution_2(int n) {
        int answer = 0;
        int divsion = 1;

        // (4*5=20) , (5*4=20) 동일하게 순서쌍이나 두번 연산하여 판단하지 않기 위한 divsion * divsion < n 조건으로 while
        while (divsion * divsion < n){
            if (n % divsion == 0){
                answer+= 2;
            }
            divsion++;
        }

        if (divsion * divsion == n){
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int result = solution_2(20);
        System.out.println("result = " + result);
    }
}
