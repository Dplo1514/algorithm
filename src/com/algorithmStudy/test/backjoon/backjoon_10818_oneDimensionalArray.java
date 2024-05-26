package com.algorithmStudy.test.backjoon;
import java.util.Arrays;
import java.util.Scanner;

public class backjoon_10818_oneDimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //숫자의 갯수가 주어진다.
        int param = scanner.nextInt();

        int [] ints = new int[param];

        for (int i = 0; i < ints.length; i++) {
            //공백을 기준으로 입력되는 숫자들을 하나씩 배열에 할당한다.
            ints[i] = scanner.nextInt();
        }

        Arrays.sort(ints);

        scanner.close();

        System.out.println(ints[0] + " " + ints[param-1]);
    }
}
