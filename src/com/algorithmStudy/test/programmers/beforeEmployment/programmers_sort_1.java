package com.algorithmStudy.test.programmers.beforeEmployment;

import java.util.Arrays;

public class programmers_sort_1 {
    //k번째 수

    static class Solution {

        public static int[] testSolution(int[] array, int[][] commands) {
            //배열을 나눈다 = commands[0][0] , commands[0][1]의 값으로
            //배열을 정렬한다 -> commands[0][2] 값을 가져온다.
            int[] result = new int[commands.length];

            int[] test1 = Arrays.copyOfRange(array , commands[0][0] - 1 , commands[0][1]);
            System.out.println("test1 = " + Arrays.toString(test1));
            int[] test2 = Arrays.copyOfRange(array , commands[1][0] - 1 , commands[1][1]);
            System.out.println("test2 = " + Arrays.toString(test2));
            int[] test3 = Arrays.copyOfRange(array , commands[2][0] - 1 , commands[2][1]);
            System.out.println("test3 = " + Arrays.toString(test3));

            Arrays.sort(test1);
            Arrays.sort(test2);
            Arrays.sort(test3);

            result[0] = test1[commands[0][2] - 1];
            result[1] = test2[commands[1][2] - 1];
            result[2] = test3[commands[2][2] - 1];


            return result;
        }

        public static int[] solution(int[] array, int[][] commands) {
            //배열을 나눈다 = commands[i][0] -1 , commands[i][1]의 값으로
            //배열을 정렬한다 -> commands[i][commands.negth-1] 값을 가져온다.
            int [] result = new int[commands.length];

            for (int i = 0 ; i < commands.length ; i ++){
                int[] division = Arrays.copyOfRange(array , commands[i][0] - 1 , commands[i][1]);

                Arrays.sort(division);

                result[i] = division[commands[i][2] -1 ];

            }

            return result;
        }

    }

    public static void main(String[] args) {
        int[] array = new int[] {1,5,2,6,3,7,4};
        int[][] commands = new int[][] { {2, 5, 3}, {4, 4, 1}, {1, 7, 3} };

        int[] result = Solution.solution(array, commands);
        System.out.println("result = " + Arrays.toString(result));
    }
}
