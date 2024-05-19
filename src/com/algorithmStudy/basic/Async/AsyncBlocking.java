package com.algorithmStudy.basic.Async;

import java.util.concurrent.CompletableFuture;

public class AsyncBlocking {

    public static void main(String[] args) {
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

        try {
            /*
            - ASync Blocking
              1. Main Thread는 async 작업이 끝날 때 까지의 대기 및 작업 결과 할당
            */
            String result = future.get();
            // 2. future 작업이 끝난 이후 출력
            System.out.println("2. Result: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("3. Continue...");
    }
}
