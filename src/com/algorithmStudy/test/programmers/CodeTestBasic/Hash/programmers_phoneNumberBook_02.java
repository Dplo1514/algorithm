package com.algorithmStudy.test.programmers.CodeTestBasic.Hash;

import java.util.*;

public class programmers_phoneNumberBook_02 {
    /*
     * Q
        * 전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다.
        * 전화번호가 다음과 같을 경우, 구조대 전화번호는 영석이의 전화번호의 접두사입니다.
            * 구조대 : 119
            * 박준영 : 97 674 223
            * 지영석 : 11 9552 4421
        * 전화번호부에 적힌 전화번호를 담은 배열 phone_book 이
        * solution 함수의 매개변수로 주어질 때,
        * 어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록 solution 함수를 작성해주세요.
     */

    /*
     * 제한사항
        * 1. phone_book의 길이는 1 이상 1,000,000 이하입니다.
        * 2. 각 전화번호의 길이는 1 이상 20 이하입니다.
        * 3. 같은 전화번호가 중복해서 들어있지 않습니다.
     */


    static class Solution {
        public static boolean solutionLongAnswer(String[] phone_book) {
            if (phone_book.length > 1000000 || phone_book.length < 1) throw new IllegalArgumentException();
            for (int i = 0; i < phone_book.length; i++) {
                for (int j = 0; j < phone_book.length; j++) {
                    if (phone_book[i] != phone_book[j] && phone_book[i].startsWith(phone_book[j])) return false;
                }
            }
            return true;
        }

        public static boolean solutionAnswer1(String[] phone_book) {
            if (phone_book.length > 1000000 || phone_book.length < 1) throw new IllegalArgumentException();
            Arrays.sort(phone_book);

            for (int i = 0; i < phone_book.length -1; i++) {
                if ( phone_book[i + 1].startsWith((phone_book[i])) ) return false;
            }
            return true;
        }

        public static boolean solutionAnswer2(String[] phone_book) {
            if (phone_book.length > 1000000 || phone_book.length < 1) throw new IllegalArgumentException();

            Map<String , Integer> map = new HashMap<>();
            for (String phoneNumber : phone_book) {
                map.put(phoneNumber , 1);
            }

            for (int i = 0; i < phone_book.length; i++) {
                for (int j = 1; j < phone_book[i].length(); j++) {
                    if(map.containsKey(phone_book[i].substring(0 , j)))
                        return false;
                }
            }

            return true;
        }
    }

    public static void main(String[] args) {
        boolean answer = Solution.solutionAnswer2(new String[]{"119", "97674223", "1195524421"});
        System.out.println("answer = " + answer);
    }
}
