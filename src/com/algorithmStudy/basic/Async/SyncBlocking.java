package com.algorithmStudy.basic.Async;

public class SyncBlocking {

    public static void main(String[] args) {
        /*
        - Sync Blocking
          1. Main Thread가 task 수행
          2. task 종료까지 대기
          3. task 종료 후 다음 프로세스 수행
        */
        long thread = Thread.currentThread().getId();

        String result = task();
        System.out.println("--------------------------");
        System.out.println("Thread ID : " + thread);
        System.out.println("Task 2. Result: " + result);
        System.out.println("--------------------------\n");

        System.out.println("--------------------------");
        System.out.println("Thread ID : " + thread);
        System.out.println("Task 3. Continue...");
        System.out.println("--------------------------\n");
    }

    public static String task() {
        try {
            // 2,000 millis의 시간이 소요되는 작업 예시
            long thread = Thread.currentThread().getId();
            System.out.println("--------------------------");
            System.out.println("Thread ID : " + thread);
            System.out.println("Task 1. Start Sync Process");
            System.out.println("-------------------------- \n");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Success";
    }
}
