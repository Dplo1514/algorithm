package com.algorithmStudy.test.backjoon;

import java.util.Scanner;

public class backjoon_1546 {
    /*
        세준이는 기말고사를 망쳤다 , 세준이는 점수를 조작해서 집에 가져가기로 했다.
        일단 세준이는 자기 점수 중에 최댓값을 골랐다 , 이 값을 M이라고 한다.
        그리고 나서 모든 점수를 점수/M*100 으로 고쳤다.
        예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면
        수학점수는 50/70*100이 되어 71.43점이 된다.
        세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.

        @Input
            * 첫째 줄에 시험 본 과목의 개수 N이 주어진다 , 이 값은 1000보다 작거나 같다.
              둘째 줄에 세준이의 현재 성적이 주어진다 , 이 값은 100보다 작거나 같은 음이 아닌 정수이고, 적어도 하나의 값은 0보다 크다.
            * Example : 3 \n 40 80 60
        @OutPut
            * 첫째 줄에 새로운 평균을 출력한다, 실제 정답과 출력값의 절대오차 또는 상대오차가 10-2 이하이면 정답이다.
            * Example : 75.0
    */

    public static void main(String[] args) {
        solution_3();
    }

    private static void solution_1() {
        Scanner sc = new Scanner(System.in);
        int totalSubject = sc.nextInt();
        float[] scoreArr = new float[totalSubject];
        for (int i = 0; i < scoreArr.length; i++) {
            scoreArr[i] = sc.nextInt();
        }
        sc.close();

        // 1. 최고점 추출
        float maxScore = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            maxScore = maxScore < scoreArr[i] ? scoreArr[i] : maxScore;
        }

        // 2. 각 과목의 점수 재 정의 = ( 과목 점수 / 최고점 ) * 100
        // 3. 평균 구하기 = 전체 과목 점수 / 전체 과목 개 수
        float result = 0;
        for (float score : scoreArr) {
            result += (score / maxScore * 100);
        }

        System.out.println(result / totalSubject);
    }

    private static void solution_2() {
        Scanner sc = new Scanner(System.in);
        int totalSubject = sc.nextInt();
        float[] scoreArr = new float[totalSubject];
        for (int i = 0; i < scoreArr.length; i++) {
            scoreArr[i] = sc.nextInt();
        }
        sc.close();

        // 1. 최고점 추출 및 전체 과목 점수 더하기
        float maxScore = 0;
        float totalScore = 0;

        for (int i = 0; i < scoreArr.length; i++) {
            maxScore = maxScore < scoreArr[i] ? scoreArr[i] : maxScore;
            totalScore += scoreArr[i];
        }

        // 2. 전체 점수 / 최고점 * 100
        float result = ( totalScore / maxScore * 100 ) / totalSubject;
        System.out.println(result);
    }

    private static void solution_3() {
        Scanner sc = new Scanner(System.in);
        int totalSubject = sc.nextInt();

        float maxScore = 0;
        float totalScore = 0;

        for (int i = 0; i < totalSubject; i++) {
            int score = sc.nextInt();
            maxScore = maxScore < score ? score : maxScore;
            totalScore += score;
        }
        sc.close();
        System.out.print(( totalScore / maxScore * 100 ) / totalSubject);
    }

}
