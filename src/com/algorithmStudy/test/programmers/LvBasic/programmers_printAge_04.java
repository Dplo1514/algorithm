package com.algorithmStudy.test.programmers.LvBasic;

import java.time.Instant;
import java.time.ZoneId;

public class programmers_printAge_04 {
    // Q : 머쓱이는 40살인 선생님이 몇 년도에 태어났는지 궁금해졌습니다. 나이 age가 주어질 때, 2022년을 기준 출생 연도를 return 하는 solution 함수를 완성해주세요.
    // 제한 : 0 < age ≤ 120 , 나이는 태어난 연도에 1살이며 1년마다 1씩 증가합니다.
    static int solution(int age) {
        if (age < 0 || age > 120) throw new IllegalArgumentException();
        return Instant.now().atZone(ZoneId.of("Asia/Seoul")).getYear() - age;
    }

    public static void main(String[] args) {
        int result = solution(25);
        System.out.println("solution = " + result);
    }
}