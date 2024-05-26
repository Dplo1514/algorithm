package com.algorithmStudy.test.programmers.LvBasic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class programmers_sum_of_tails_10 {
     /*
        * Q : 정수 n이 주어질 때, n 이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.
        * 제한 : 0 < n ≤ 1000
     */

    // 성능 1순위
    public static int solution_example1(int n) {
        int answer = 0;

        for(int i=2; i<=n; i+=2){
            answer+=i;
        }

        return answer;
    }

    // 성능 2순위
    public static int solution(int n) {
        if (n < 0 || n > 1000) throw new IllegalArgumentException();
        int result = 0;
        List<Integer> evenList = new ArrayList<Integer>();

        IntStream.range(1 , n+1)
                .forEach(x -> {
                    if ( x%2 == 0 ) evenList.add(x);
                });

        for (Integer x : evenList) {
            result += x;
        }

        return result;
    }

    // 성능 2순위
    public static int solution_2(int n) {
        return IntStream.rangeClosed(0, n)
                .filter(e -> e % 2 == 0)
                .sum();
    }



    public static void main(String[] args) {
        int result = solution(25);
        System.out.println("solution = " + result);
    }
}
