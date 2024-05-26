package com.algorithmStudy.test.programmers.beforeEmployment;

import java.util.*;


public class programmers_hash_1 {
    //완주하지 못한 선수
    static class Solution_List {
        public static String solution(String[] participant, String[] completion) {

            int i = 0;
            Arrays.sort(participant);
            Arrays.sort(completion);

            //두개의 배열을 정렬해서 비교한다.
            //비교할 때 일치하지 않거나 participant 배열의 마지막 요소까지 for문이 진행되면 해당 요소를 리턴한다.
            for (i = 0; i < completion.length; i++)
                if (!participant[i].equals(completion[i])) break;

            return participant[i];
        }
    }

    static class Solution_Hash {
        public static String solution(String[] participant, String[] completion) {
            HashMap<String, Integer> map = new HashMap<>();
            String result = null;

            // .getOrDefault(key, defaultValue) 두개의 매개변수를 필요로 한다.
            // key에는 값을 가져와야하는 요소의 키이다 , defaultValue에는 hash안에 찾는 key값에 대해 있는지 없는지 확인하고 알맞는 반환값을 넣어준다.
            // key 값이 없다면 0을 반환하고 +1을 더한다. , key값이 있다면 해당 키의 value를 반환하고 +1을 더한다.

            for (String player : participant) map.put(player, map.getOrDefault(player, 0) + 1);

            for (String player : completion) map.put(player, map.get(player) - 1);

            for (String index : map.keySet())
                if (map.get(index) == 1) result = index ;

            return result;
        }
    }

    public static void main(String[] args) {
        String[] participant = new String[]{"mislav", "stanko", "mislav", "ana"};
        String[] completion = new String[]{"stanko", "ana", "mislav"};

        String result = Solution_Hash.solution(participant, completion);

        System.out.println("result = " + result);
    }
}
