package com.algorithmStudy.test.backjoon;

import java.util.Scanner;

public class backjoon_2798_bruteForce {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int [] arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = bruteForce(N , M , arr);
        System.out.println(result);
    }

    static int bruteForce(int N , int M , int[] arr){
        int result = 0;
        int compare = 0;
        //N(카드의 개수)
        //0번째부터 마지막 -1 , 1번째부터 마지막 -2
        for (int x = 0; x < N; x++) {
            for (int y = x + 1;  y < N; y++) {
                for (int z = y + 1;  z < N; z++) {
                    compare = arr[x] + arr[y] + arr[z];

                    if (compare == M)return compare;

                    if (result < compare && compare < M)result = compare;
                }
            }
        }
        return result;
    }
}
