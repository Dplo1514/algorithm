package com.algorithmStudy.test.Company;

public class Company_01 {
    public static int[] Q1ReverseArr(int[] arr){
        int len = arr.length;
        int[] result = new int[len];

        for (int i = 0; i < arr.length; i++) {
            result[(len-1)-i] = arr[i];
        }

        return result;
    }

    public static int[] Q2TargetArr(int[] arr){
        int len = arr.length;
        int target = 0;
        int[] result = new int[len];

        for (int i = 0; i < arr.length; i++) {
            target = arr[i];

            if (target != arr[i]){
                result[i] = arr[i*i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // 배열 뒤집기
        int[] result = Q1ReverseArr(new int[]{1, 2, 3, 4, 5});
        for (int i : result) {
            System.out.println("i = " + i);
        }
    }
}

