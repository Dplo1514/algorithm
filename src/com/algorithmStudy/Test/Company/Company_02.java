package com.algorithmStudy.test.Company;

import java.util.HashMap;
import java.util.Map;

public class Company_02 {
    static class Solution{
        public static int solution(String pharse) {
            // 1. 문자열을 배열로 쪼갠다.
            char[] chars = pharse.replaceAll(" " , "").toCharArray();

            // 2. 해싱처리할 맵 생성
            Map<String , Integer> candleMap = new HashMap<>();

            // 3. 해싱 처리 진행
            for (int i = 0; i < chars.length; i++) {
                // 홀수 번째 글자는 초록
                if (i % 2 == 1){
                    candleMap.put("G" + chars[i] , candleMap.getOrDefault("G" + chars[i], 0) + 1);
                }
                // 짝수 번째 글자는 빨강
                else {
                    candleMap.put("R" + chars[i] , candleMap.getOrDefault("R" + chars[i], 0) + 1);
                }
            }

            // 4. 결과 값 확인
            return candleMap.keySet().size();
        }

        public static void main(String[] args) {
            System.out.println(solution("HELLO WORLD")); // 8
            solution("HAPPY BIRTHDAY"); // 11
            solution("MERRY CHRISMAS"); // 12
            solution("L AA A L R RRL"); // 5
            solution("AAAAAAAAA"); // 2
        }
    }
}
