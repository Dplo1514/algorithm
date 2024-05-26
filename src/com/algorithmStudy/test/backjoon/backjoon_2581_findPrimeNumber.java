package com.algorithmStudy.test.backjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class backjoon_2581_findPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int count = 0;
        int idx = 2;
        int answer = 0;
        List<Integer> numberRange = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        while (m <= n) {
            numberRange.add(m);
            m++;
        }

        for (int i = 0; i < numberRange.size(); i++) {
            if (numberRange.get(i) != 1) {
                while (idx < numberRange.get(i)) {
                    if (numberRange.get(i) % idx == 0) count++;
                    idx++;
                }
                if (count == 0) result.add(numberRange.get(i));
                count = 0;
                idx = 2;
            }
        }

        if (result.size() == 0) System.out.println(-1);
        else {
            Collections.sort(result);
            for (Integer i : result) {
                answer += i;
            }
            System.out.println(answer);
            System.out.println(result.get(0));
        }
    }
}
