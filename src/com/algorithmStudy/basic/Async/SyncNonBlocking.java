package com.algorithmStudy.basic.Async;

public class SyncNonBlocking {

    public static void main(String[] args) {
        /*
        - Sync Non Blocking
          1. Main Thread가 task 수행 하지 않음
          2. task에서 별도 스레드 생성하여 task 수행
          3. task 종료를 기다리지 않고 다음 process 수행
        */
        long thread = Thread.currentThread().getId();
        System.out.println("--------------------------");
        System.out.println("Thread ID : " + thread);
        System.out.println("Task 1. Start Sync Process");
        System.out.println("-------------------------- \n");

        nonBlockingMethod();

        System.out.println("--------------------------");
        System.out.println("Thread ID : " + thread);
        System.out.println("Task 3. Continue...");
        System.out.println("--------------------------\n");
    }

    public static void nonBlockingMethod() {
        new Thread(() -> {
            try {
                Thread.sleep(2000);
                long thread = Thread.currentThread().getId();
                System.out.println("--------------------------");
                System.out.println("Thread ID : " + thread);
                System.out.println("Task 2. Result: " + "Success");
                System.out.println("--------------------------\n");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
