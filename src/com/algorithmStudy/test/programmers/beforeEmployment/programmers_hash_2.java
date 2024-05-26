package com.algorithmStudy.test.programmers.beforeEmployment;

import java.util.HashMap;

public class programmers_hash_2 {
    //전화번호 목록
    static class Solution {
        public boolean solution(String[] phoneBook) {
            boolean answer = true;
            HashMap<String , Integer> map = new HashMap<>();

            for (int i = 0; i < phoneBook.length; i++) {
                map.put(phoneBook[i] , i);
            }

            for (int i = 0; i < phoneBook.length; i++) {
                for (int j = 0; j < phoneBook[i].length(); j++) {
                    if (map.containsKey(phoneBook[i].substring(0 , j)))return false;
                }
            }

            return answer;
        }

    }

    public static void main(String[] args) {
        String [] phoneBook = {"119", "97674223", "1195524421"};
        Solution solution = new Solution();
        boolean result = solution.solution(phoneBook);

        System.out.println("result = " + result);
    }
}
