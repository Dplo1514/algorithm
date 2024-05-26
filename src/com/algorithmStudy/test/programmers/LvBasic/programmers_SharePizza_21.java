package com.algorithmStudy.test.programmers.LvBasic;


public class programmers_SharePizza_21 {
    /*
    Q : 머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다.
    피자를 나눠먹을 사람의 수 n이 주어질 때, 모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 return 하는 solution 함수를 완성해보세요.
    */
    static int solution(int n) {
        return (double) (n/7.0) % 1 == 0.0 ? n/7: n/7 + 1;
    }

    static double solution_example2(int[] numbers) {
        double answer = 0;

        int sum = 0;
        for(int i: numbers){
            sum+=i;
        }
        answer = sum/(double)numbers.length;
        return answer;
    }


    public static void main(String[] args) {
        int result = solution(7);
//        int result = solution(1);
//        int result = solution(15);
        System.out.println("solution = " + result);
    }
}