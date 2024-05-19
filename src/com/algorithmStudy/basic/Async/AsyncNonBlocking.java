package com.algorithmStudy.basic.Async;

import java.util.concurrent.CompletableFuture;

public class AsyncNonBlocking {

    public static void main(String[] args) throws InterruptedException {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(
            () -> {
                try {
                    // 2,000 millis의 시간이 소요되는 작업 예시
                    System.out.println("1. Start Async Process");
                    Thread.sleep(2000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return "Success";
            }
        );

        /*
        - ASync Non Blocking
          1. Main Thread는 future 작업이 끝날 때 까지 대기하지 않으며 콜백을 통한 결과 처리
          2. thenAccept()는 Consumer<? super T> action 자체를 파라미터로 받고 있으며 future 종료시 call back 처리
        */
        future.thenAccept(result ->
            // Call back
            System.out.println("2. Result: " + result)
        );

        System.out.println("3. Continue...");
        // 콜백 확인을 위한 Main Thread Sleep
        Thread.sleep(10000);
    }
}
