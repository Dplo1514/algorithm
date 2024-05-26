package com.algorithmStudy.test.programmers.beforeEmployment;

import java.util.ArrayList;

public class programmers_exhaustiveSearch_1 {
    //모의고사
    static class Solution {
        /*
        1번 수포자가 찍는 방식: 1, 2, 3, 4, 5 / 1, 2, 3, 4, 5
        2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5 / 2, 1, 2, 3, 2, 4, 2, 5
        3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 / 3, 3, 1, 1, 2, 2, 4, 4, 5, 5
        */

        public static int[] solution(int[] answers) {
            //학생들이 정답을 체크하는 패턴을 확인해 배열에 할당한다.
            int[] studentA = new int[] {1, 2, 3, 4, 5};
            int[] studentB = new int[] {2, 1, 2, 3, 2, 4, 2, 5};
            int[] studentC = new int[] {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
            int[] compare = new int[] {0 , 0 , 0};
            ArrayList<Integer> compareArrayList = new ArrayList<>();

            //i가 만들어둔 배열보다 클 경우를 생각해 i를 배열의 크기로 나눈 나머지를 인덱스해준다.
            //피제수(i)가 제수(studentA.length)보다 작다면 나머지는 피제수(i)이다.
            for (int i = 0; i < answers.length; i++) {
                if (studentA[i % studentA.length] == answers[i]) {compare[0]++;}
                if (studentB[i % studentB.length] == answers[i]) {compare[1]++;}
                if (studentC[i % studentC.length] == answers[i]) {compare[2]++;}
            }

            //배열의 0번째와 1번째를 비교 큰 값을 찾는다 -> 나온 값을 2번째와 비교 가장 큰 값을 찾는다.
            int maxValue = Math.max(Math.max(compare[0], compare[1]), compare[2]);

            //가장 큰 값과 배열의 0,1,2 번째를 비교하고 같으면 리턴할 학생들의 인덱스를 할당한다.
            if (compare[0] == maxValue)compareArrayList.add(1);
            if (compare[1] == maxValue)compareArrayList.add(2);
            if (compare[2] == maxValue)compareArrayList.add(3);

            //문제의 요구 데이터 타입에 맞출 수 있도록 배열을 생성 할당 후 리턴한다.
            int[] result = new int[compareArrayList.size()];

            for (int i = 0; i < result.length; i++) {
                result[i] = compareArrayList.get(i);
            }

            return result;
        }

    }

    public static void main(String[] args) {
        int[] answer = new int[]{1, 3, 2, 4, 2};


        int[] solution = Solution.solution(answer);
        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }
}
