package com.algorithmStudy.test.programmers.beforeEmployment;

import java.util.Arrays;

public class programmers_greedy_1 {
    //체육복
    //점심시간에 도둑이 들어, 일부 학생이 체육복을 도난당했습니다. 다행히 여벌 체육복이 있는 학생이 이들에게 체육복을 빌려주려 합니다.
    //학생들의 번호는 체격 순으로 매겨져 있어, 바로 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있습니다.
    //예를 들어, 4번 학생은 3번 학생이나 5번 학생에게만 체육복을 빌려줄 수 있습니다.
    //체육복이 없으면 수업을 들을 수 없기 때문에 체육복을 적절히 빌려 최대한 많은 학생이 체육수업을 들어야 합니다.
    //전체 학생의 수 n, 체육복을 도난당한 학생들의 번호가 담긴 배열 lost, 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve가 매개변수로 주어질 때,
    //체육수업을 들을 수 있는 학생의 최댓값을 return 하도록 solution 함수를 작성해주세요.

    static class Solution {
        static int solution(int n, int[] lost, int[] reserve) {
            int answer = n;
            int[] students = new int[n];
            Arrays.fill(students, 1);

            //체육복을 도난당한 학생의 숫자는 -1 -> 0으로 셋팅
            for (int i : lost) {
                students[i - 1] -= 1;
            }
            //체육복을 도난당하지 않고 여분이 존재하는 학생의 숫자는 +1 -> 2로 셋팅
            for (int i : reserve) {
                students[i - 1] += 1;
            }

            for (int i = 0; i < students.length; i++) {
                if (students[i] == 0) {
                    //i 기준으로 왼쪽 값이 2라면 -1해서 1로 맞춘다.
                    if (i > 0 && students[i - 1] == 2) {
                        students[i - 1] -= 1;
                    } else if (i < n - 1 && students[i + 1] == 2) {
                        //i 기준으로 오른쪽 값이 2라면 -1해서 1로 맞춘다.
                        students[i + 1] -= 1;
                    } else {
                        //위 조건에서 처리되지 않는다면 양쪽에서 체육복을 빌릴 수 없음을 의미 answer를 -1한다.
                        answer--;
                    }
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {3};

        int solution = Solution.solution(n, lost, reserve);
        System.out.println("solution = " + solution);
    }
}
