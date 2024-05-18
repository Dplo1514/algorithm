package com.algorithmStudy.basic.MemoryLeak;

import java.util.ArrayList;
import java.util.List;

public class ReferenceTypeIssue {

    public static void main(String[] args) {
        testPrimitive();
        testReference();
    }

    private static void testPrimitive() {
        // 1. 배열의 크기를 500000000으로 설정
        long[] primitiveArray = new long[500000000];

        // 2. 로직 실행 전 사용 중인 메모리 양
        long primitiveMemoryBefore = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("Primitive type memory usage Task Before : " + primitiveMemoryBefore);

        // 3. 원시 타입 배열에 원시 타입 값 할당
        for (int i = 0; i < primitiveArray.length; i++) {
            primitiveArray[i] = i;
        }

        // 4. 로직 실행 후 사용 중인 메모리 양
        long primitiveMemoryAfter = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("Primitive type memory usage Task After : " + primitiveMemoryAfter);
    }

    private static void testReference() {
        // 1. 배열의 크기를 500000000으로 설정
        List<Long> referenceArray = new ArrayList();

        // 2. 로직 실행 전 사용 중인 메모리 양
        long referenceMemoryBefore = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("Reference type memory usage Task Before : " + referenceMemoryBefore);

        // 3. 원시 타입 배열에 원시 타입 값 할당
        for (int i = 0; i < 500000000; i++) {
            referenceArray.add((long) i);
        }

        // 4. 로직 실행 후 사용 중인 메모리 양
        long referenceMemoryAfter = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("Reference type memory usage Task After : " + referenceMemoryAfter);
    }

}
