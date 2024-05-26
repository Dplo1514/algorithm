package com.algorithmStudy.test.programmers.beforeEmployment.programmers_skillCheck;

import java.util.HashMap;

public class programmers_skillCheck_lv1 {
    static class Solution_FindKim {
        static String solution(String[] seoul) {
            String answer = "";
            int count = 0;
            for (String s : seoul) {
                if (s.equals("Kim")) answer = "김서방은 " + count + "에 있다" ;
                count++;
            }
            return answer;
        }
    }

    static class Solution_Marathon {
         static String solution(String[] participant, String[] completion) {
            String answer = "";
             HashMap<String , Integer> participantMap = new HashMap<>();

             for (String player : participant)participantMap.put(player , participantMap.getOrDefault(player , 0) +1);

             for (String player : completion)participantMap.put(player , participantMap.get(player) - 1);


             for (String index : participantMap.keySet())
                 if (participantMap.get(index) == 1) answer = index ;

             return answer;
         }
    }


    public static void main(String[] args) {
//        String[] seoul = {"Jane" , "Kim"};
//
//        String solution = Solution_FindKim.solution(seoul);
//        System.out.println("solution = " + solution);

        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        Solution_Marathon.solution(participant , completion);
    }
}
