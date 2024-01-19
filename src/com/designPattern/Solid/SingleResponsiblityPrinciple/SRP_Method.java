package com.designPattern.Solid.SingleResponsiblityPrinciple;

/*
 * 참고 자료 : https://www.youtube.com/watch?v=Tit-bJJm9iw
 * 단일 책임 원칙
 * 모든 method, class, module은 하나의 책임만 가져야한다.
 */
public class SRP_Method {


    // Good Case : 하나의 메서드가 숫자를 더하고 , 숫자를 출력하는 하나의 책임만을 가지고 있음
    private int add(int num1, int num2) {
        return num1 + num2;
    }

    private void numPrint(int num) {
        System.out.print("num = " + num);
    }

    // Bad Case : 하나의 메서드가 숫자를 더하고 결과를 출력하는 두개의 책임을 가지고 있음
    private void numAddAndPrint(int num1, int num2) {
        int result = num1 + num2;
        System.out.print("result = " + result);
    }

}
