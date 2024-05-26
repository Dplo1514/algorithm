package com.algorithmStudy.test.backjoon;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class backjoon_4673_selfNumber {

    static ArrayList<Integer> selfNumber(int num){

        ArrayList<Integer> compareArrayList = new ArrayList<>();

        int compare = num;

        while (num > 0) {
                compare += num % 10;
                num /=  10;
        }

        compareArrayList.add(compare);
        return compareArrayList;
    }

    public static void main(String[] args) {
        int[] arr = IntStream.range(1 , 10000).toArray();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i : arr) {
            arrayList.add(i);
        }

        for (int i : arr) {
            arrayList.removeAll(selfNumber(i));
        }

        for (Integer result : arrayList) {
            System.out.println(result);
        }
    }
}
