package com.algorithmStudy.test.programmers.LvBasic;

public class programmers_protractor_09 {
    /*
    Q : 각에서 0도 초과 90도 미만은 예각, 90도는 직각, 90도 초과 180도 미만은 둔각 180도는 평각으로 분류합니다.
        각 angle이 매개변수로 주어질 때 예각일 때 1, 직각일 때 2, 둔각일 때 3, 평각일 때 4를 return하도록 solution 함수를 완성해주세요.
        예각 : 0 < angle < 90
        직각 : angle = 90
        둔각 : 90 < angle < 180
        평각 : angle = 180
    */
    // 제한 : 0 < angle ≤ 180
    static int solution(int angle) {
        if (angle < 0 || angle > 180) throw new IllegalArgumentException();
               //1. 직각 비교         //2. 평각 비교         // 예각 , 둔각 비교
        return (angle == 90) ? 2 : (angle == 180) ? 4 : (90 > angle) ? 1 : 3;
    }

    public static void main(String[] args) {
        int result = solution(10);
        System.out.println("solution = " + result);
    }
}