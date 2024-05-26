package com.algorithmStudy.test.backjoon;

import java.util.PriorityQueue;
import java.util.Scanner;

public class backjoon_2751_sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        PriorityQueue<Integer> heapSort = new PriorityQueue<>();

        for (int i = 0; i < size; i++) {
            heapSort.add(scanner.nextInt());
        }

        for (Integer integer : heapSort) {
            System.out.println(integer);
        }
    }
}

//시간 초과 실패코드 (선택 정렬)
//public class backjoon_2751_sort {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int[] arr = new int[scanner.nextInt()];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = scanner.nextInt();
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                int temp = arr[i];
//                if (temp > arr[j]){
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//
//        for (int i : arr) {
//            System.out.println(i);
//        }
//    }
//}
