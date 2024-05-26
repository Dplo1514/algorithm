package com.algorithmStudy.test.programmers.beforeEmployment;

import java.util.PriorityQueue;

public class programmers_heap_1 {
    //더 맵게

    static class Solution {
        static int solution(int[] scoville, int k) {
            int answer = 0;

            //자동으로 내림차순 정렬해주는 우선순위 큐를 사용
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

            //우선순위 큐에 할당
            for (Integer i : scoville) {
                priorityQueue.offer(i);
            }

            //우선 순위 큐의 크기가 1보다 큰 동안 반복해야한다 -> 1일 경우 다음 값을 꺼내오는 동작에서 NPE가 발생하기 때문
            while (priorityQueue.size() > 1) {
                //compare = 큐의 1번째 + ( 큐의 2번째 *2 )
                int compare = priorityQueue.poll() + (priorityQueue.poll() * 2);
                //compare가 큐에 할당되어 새롭게 비교되어야 하기 때문에 큐에 재할당한다.
                priorityQueue.offer(compare);
                answer++;

                //다음 요소가 k보다 크거나 같다는 조건은 이전 요소들이 모두 k보다 크거나 같음을 의미 break;
                if (priorityQueue.peek() >= k) break;
            }
            //반복문이 모두 종료됐음에도 k보다 큐에 할당된 값이 작다면 모든 요소를 더했음에도 k보다 작음을 의미 -1을 리턴한다.
            if(k > priorityQueue.poll()) return -1;

            return answer;
        }
    }

    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int k = 7;

        System.out.println("result = " + Solution.solution(scoville, k));
    }
}
