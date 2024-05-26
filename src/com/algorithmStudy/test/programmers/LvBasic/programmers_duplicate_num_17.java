package com.algorithmStudy.test.programmers.LvBasic;

import java.util.Arrays;

public class programmers_duplicate_num_17 {
    /*
        Q : 정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때, array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.
     */

    public static int solution_1(int[] array, int n) {
        int answer = 0;
        for (int i : array) {
            if (i == n) answer++;
        }
        return answer;
    }

    public static int solution_2(int[] array, int n){
        return (int) Arrays.stream(array)
                .filter(e -> e == n)
                .count();
    }

    public static void main(String[] args) {
        int result = solution_1(new int[]{1, 1, 2, 3, 4, 5} , 1);
        System.out.println("result = " + result);
    }
}
