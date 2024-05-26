package com.algorithmStudy.test.programmers.CodeTestBasic.Hash;

import java.util.*;
import java.util.stream.Collectors;

public class programmers_ponketmon_01 {

    /*
        * Q
            * 당신은 폰켓몬을 잡기 위한 오랜 여행 끝에, 홍 박사님의 연구실에 도착했습니다. 홍 박사님은 당신에게 자신의 연구실에 있는 총 N 마리의 폰켓몬 중에서 N/2마리를 가져가도 좋다고 했습니다.
            * 홍 박사님 연구실의 폰켓몬은 종류에 따라 번호를 붙여 구분합니다. 따라서 같은 종류의 폰켓몬은 같은 번호를 가지고 있습니다.
            * 예를 들어 연구실에 총 4마리의 폰켓몬이 있고, 각 폰켓몬의 종류 번호가 [3번, 1번, 2번, 3번]이라면 이는 3번 폰켓몬 두 마리, 1번 폰켓몬 한 마리, 2번 폰켓몬 한 마리가 있음을 나타냅니다.
            * 이때, 4마리의 폰켓몬 중 2마리를 고르는 방법은 다음과 같이 6가지가 있습니다.
                * 첫 번째(3번), 두 번째(1번) 폰켓몬을 선택
                * 첫 번째(3번), 세 번째(2번) 폰켓몬을 선택
                * 첫 번째(3번), 네 번째(3번) 폰켓몬을 선택
                * 두 번째(1번), 세 번째(2번) 폰켓몬을 선택
                * 두 번째(1번), 네 번째(3번) 폰켓몬을 선택
                * 세 번째(2번), 네 번째(3번) 폰켓몬을 선택
            * 이때, 첫 번째(3번) 폰켓몬과 네 번째(3번) 폰켓몬을 선택하는 방법은 한 종류(3번 폰켓몬 두 마리)의 폰켓몬만 가질 수 있지만, 다른 방법들은 모두 두 종류의 폰켓몬을 가질 수 있습니다.
            * 따라서 위 예시에서 가질 수 있는 폰켓몬 종류 수의 최댓값은 2가 됩니다.
            * 당신은 최대한 다양한 종류의 폰켓몬을 가지길 원하기 때문에, 최대한 많은 종류의 폰켓몬을 포함해서 N/2마리를 선택하려 합니다.
            * N마리 폰켓몬의 종류 번호가 담긴 배열 nums가 매개변수로 주어질 때, N/2마리의 폰켓몬을 선택하는 방법 중, 가장 많은 종류의 폰켓몬을 선택하는 방법을 찾아,
            * 그때의 폰켓몬 종류 번호의 개수를 return 하도록 solution 함수를 완성해주세요.
    */

    /*
        * 제한사항
         * 1. nums는 폰켓몬의 종류 번호가 담긴 1차원 배열입니다.
         * 2. nums의 길이(N)는 1 이상 10,000 이하의 자연수이며, 항상 짝수로 주어집니다.
         * 3. 폰켓몬의 종류 번호는 1 이상 200,000 이하의 자연수로 나타냅니다.
         * 4. 가장 많은 종류의 폰켓몬을 선택하는 방법이 여러 가지인 경우에도, 선택할 수 있는 폰켓몬 종류 개수의 최댓값 하나만 return 하면 됩니다.
     */


    static class Solution {
        public static int solution(int[] nums) {
            if (nums.length > 10000 || nums.length < 1 || ( nums.length % 2 ) != 0) throw new IllegalArgumentException();

            // 중복 포켓몬 제거
            Set<Integer> poncketmonKind = new HashSet<>();
            for (Integer poncketmon : nums) {
                poncketmonKind.add(poncketmon);
            }
            // 포켓몬 종류
            int countPoncketmonKind = poncketmonKind.size();
            //총 가져갈 수 있는 마리수 > 포켓몬 종류 => 가져갈 수 있는 포켓몬 종류별로 다 가져감
            if (nums.length / 2 > countPoncketmonKind) return countPoncketmonKind;
            //아닌 경우에는 가져갈 수 있는 마리 수만 가져감
            else return nums.length / 2;
        }
    }
    static class OtherDeveloperSolution {
        public int solution(int[] nums) {
            return Arrays.stream(nums)
                    // 각 정수를 해당하는 래퍼 클래스로 변환하여 스트림을 생성합니다. (Boxing)
                    .boxed()
                    // 중복을 제거한 후 Set으로 수집합니다.
                    .collect(Collectors.collectingAndThen(Collectors.toSet(),
                            // 중복 제거된 요소의 개수와 배열 길이의 절반 중 작은 값을 반환합니다.
                            phonekemons -> Integer.min(phonekemons.size(), nums.length / 2)));
        }
    }


    public static void main(String[] args) {
        int answer = Solution.solution(new int[]{3, 3, 3, 2, 2, 4});
        System.out.println("answer = " + answer);
    }
}
