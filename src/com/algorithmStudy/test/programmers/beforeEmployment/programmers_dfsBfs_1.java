package com.algorithmStudy.test.programmers.beforeEmployment;

public class programmers_dfsBfs_1 {
    //Target Number
    static class Solution {
        //재귀함수 : 함수가 함수 내부에서 자기 자신을 호출하는 방식의 함수
        //조건이 지정돼있지 않으면 무한 루프 -> stack overflow 발생 : 종료 조건을 필수적으로 설정해줘야함
        int numbers[];
        int target;
        int answer;

        void dfs(int idx , int sum) {

            //종료조건 : numbers 배열의 크기와 idx가 같다는건 배열의 끝까지 탐색이 끝남을 의미함
            if (numbers.length == idx){
                //크기가 같다면 종료전에 sum과 target의 값이 동일한지 확인하고 동일하면 anwser를 ++해야 마지막까지 확인이 가능하다.
                if (sum == target)answer++;
                return;
            }

            //수행동작
            //배열의 요소를 모두 탐색하며 배열의 마지막 요소까지 더하는 동작이 끝나면
            dfs(idx + 1 , sum + numbers[idx]);

            //배열의 요소 값 마다 탐색하며 배열의 마지막 요소까지 빼는 동작이 수행된다.
            dfs(idx + 1 , sum - numbers[idx]);

        }

        public int solution(int[] numbers , int target) {
            answer = 0;
            this.numbers = numbers;
            this.target = target;

            dfs(0,0);

            return answer;
        }

    }


    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;
        Solution solution = new Solution();

        System.out.println("solution = " + solution.solution(numbers , target));
    }
}
