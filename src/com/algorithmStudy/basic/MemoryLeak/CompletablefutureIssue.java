package com.algorithmStudy.basic.MemoryLeak;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CompletablefutureIssue {

    public static void main(String[] args) {
        List<String> data = new ArrayList<>();
        for (int i = 0; i < 900000; i++) {
            // 100,000개의 데이터를 생성
            data.add("Item " + i);
        }

        try {
            processWithMemoryLeak(data);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    public static void processWithMemoryLeak(List<String> data) throws InterruptedException, ExecutionException {
        List<CompletableFuture<Void>> futures = new ArrayList<>();

        for (String item : data) {
            CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
                // 일부 작업 수행
                try {
                    TimeUnit.MILLISECONDS.sleep(10);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("Processing " + item);
            });

            // 메모리 누수를 유발할 수 있는 방식으로 CompletableFuture를 관리
            futures.add(future);
        }

        // 모든 작업이 완료되기를 기다림
        CompletableFuture<Void> allOf = CompletableFuture.allOf(futures.toArray(new CompletableFuture[0]));
        allOf.get();
    }

    public static void processWithoutMemoryLeak(List<String> data) throws InterruptedException, ExecutionException {
        List<CompletableFuture<Void>> futures = new ArrayList<>();

        for (String item : data) {
            CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
                try {
                    TimeUnit.MILLISECONDS.sleep(10);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("Processing " + item);
            });

            futures.add(future);
        }

        // 모든 작업이 완료되기를 기다리고 나서 리스트를 비움
        CompletableFuture<Void> allOf = CompletableFuture.allOf(futures.toArray(new CompletableFuture[0]));
        allOf.get();

        // 완료된 작업에 대한 참조를 제거하여 메모리 누수를 방지
        futures.clear();
    }

}
