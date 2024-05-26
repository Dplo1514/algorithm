package com.algorithmStudy.test.programmers.beforeEmployment;

import java.util.*;

public class programmers_stackQueue_2 {
    //프린터
    //1. 인쇄 대기목록의 가장 앞에 있는 문서(J)를 대기목록에서 꺼냅니다.
    //큐의 첫번째를 꺼낸다 -> peek() 다음거랑 비교하면서 탐색해나간다
    //2. 나머지 인쇄 대기목록에서 J보다 중요도가 높은 문서가 한 개라도 존재하면 J를 대기목록의 가장 마지막에 넣습니다.
    //큰 값이 존재하면 마지막에 넣는다? 어떻게하지
    //3. 그렇지 않으면 J를 인쇄합니다.

    static class PrintJob {
        int priority;
        int location;

        public PrintJob(int priority, int location) {
            this.priority = priority;
            this.location = location;
        }
    }


    public static int solution(int[] priorities, int location) {
        int answer = 0;
        //1. 큐를 만든다.
        List<PrintJob> printJobs = new ArrayList<>();

        for (int i = 0; i < priorities.length; i++) {
            printJobs.add(new PrintJob(priorities[i], i));
        }

        while (!printJobs.isEmpty()) {
            //2. 0번째를 꺼내서 가장 큰 값이 아니면 다시 끝에 넣는다.
            PrintJob job = printJobs.remove(0);
            if (printJobs.stream().anyMatch(otherJob -> job.priority < otherJob.priority)) {
                printJobs.add(job);
            } else {
                answer++;
                //3. 가장 큰 값이면 내가 찾는 (location에 적합한) 값이 맞는지 확인한다.
                if (job.location == location) {
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] priorities = {1, 1, 9, 1, 1, 1};

        int location = 0;

        System.out.println(solution(priorities, location));
    }
}
