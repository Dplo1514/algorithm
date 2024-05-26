package com.algorithmStudy.test.programmers.LvBasic;

public class programmers_coordinate_18 {
    /*
        Q : x 좌표와 y 좌표가 모두 양수이면 제1사분면에 속합니다.
            x 좌표가 음수, y 좌표가 양수이면 제2사분면에 속합니다.
            x 좌표와 y 좌표가 모두 음수이면 제3사분면에 속합니다.
            x 좌표가 양수, y 좌표가 음수이면 제4사분면에 속합니다.
            x 좌표 (x, y)를 차례대로 담은 정수 배열 dot이 매개변수로 주어집니다. 좌표 dot이 사분면 중 어디에 속하는지
            1, 2, 3, 4 중 하나를 return 하도록 solution 함수를 완성해주세요.
     */

    public static int solution_1(int[] dot) {
        // x , y 가 0보다 크면
        if (dot[0] > 0 && dot[1] > 0){
            // 1 사분면
            return 1;
        }
        // x가 0보다 작고 , y 가 0보다 크면
        if (dot[0] < 0 && dot[1] > 0){
            // 2 사분면
            return 2;
        }
        // x가 0보다 작고 , y 가 0보다 작으면
        if (dot[0] < 0 && dot[1] < 0){
            // 3 사분면
            return 3;
        }
        // x가 0보다 크고 , y 가 0보다 작으면
        if (dot[0] > 0 && dot[1] < 0){
            // 4 사분면
            return 4;
        }
        return 0;
    }

    public static void main(String[] args) {
        int result = solution_1(new int[]{1, 1});
        System.out.println("result = " + result);
    }
}
