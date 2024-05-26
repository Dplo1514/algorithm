package com.algorithmStudy.test.programmers.LvBasic;

public class programmers_iceAmericano_13 {
    // Q : 머쓱이는 추운 날에도 아이스 아메리카노만 마십니다. 아이스 아메리카노는 한잔에 5,500원입니다.
    // 머쓱이가 가지고 있는 돈 money가 매개변수로 주어질 때,
    // 머쓱이가 최대로 마실 수 있는 아메리카노의 잔 수와 남는 돈을 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.

    // 제한 : 0 < money ≤ 1,000,000

    static int[] solution(int n) {
        if (n < 1 || n > 1000000) throw new IllegalArgumentException();

        return new int[] {n / 5500 , n % 5500};
    }

    public static void main(String[] args) {
        int[] result = solution(10);
        System.out.println("solution = " + result[0] + "" + result[1]);
    }
}
