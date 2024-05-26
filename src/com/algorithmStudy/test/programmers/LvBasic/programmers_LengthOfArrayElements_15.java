package com.algorithmStudy.test.programmers.LvBasic;

import java.util.Arrays;

public class programmers_LengthOfArrayElements_15 {
    // Q : 문자열 배열 strlist가 매개변수로 주어집니다. strlist 각 원소의 길이를 담은 배열을 retrun하도록 solution 함수를 완성해주세요.

    // 제한
    // 1 ≤ strlist 원소의 길이 ≤ 100
    // strlist는 알파벳 소문자, 대문자, 특수문자로 구성되어 있습니다.

    static int[] solution(String[] n) {
        int[] answer = new int[n.length];
        int count = 0;

        for (String i : n) {
            int argsLength = i.length();
            answer[count] = argsLength;
            count++;
        }

        return answer;
    }

    static int[] solution_example(String[] strList) {
        return Arrays.stream(strList).mapToInt(String::length).toArray();
    }

    public static void main(String[] args) {
        int[] result = solution(new String[]{"We", "are", "the", "world!"});
        for (int i : result) {
            System.out.println("i = " + i);
        }
    }
}
