package com.algorithmStudy.test.programmers.LvBasic;

public class programmsers_countEvenOddNumber_19 {
    // Q : 정수가 담긴 리스트 num_list가 주어질 때, num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.

    public static int[] solution_1(int[] num_list) {
        int[] answer = new int[2];
        for (int i : num_list) {
            if (i % 2 == 0) answer[0] = answer[0] + 1;
            else answer[1] = answer[1] + 1;
        }
        return answer;
    }

    public static int[] solution_2(int[] num_list) {
        int[] answer = new int[2];

        for(int i = 0; i < num_list.length; i++)
            answer[num_list[i] % 2]++;

        return answer;
    }

    public static void main(String[] args) {
        int[] result = solution_2(new int[] {1,2,3,4,5});
        for (int i : result) {
            System.out.println("i = " + i);
        }
        System.out.println("solution = " + result);
    }
}
