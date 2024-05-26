package com.algorithmStudy.test.backjoon;

import java.util.Scanner;

public class backjoon_1330_if {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        String print = "==";

        if (!(a == b)){
         print =  a < b ? "<" : ">" ;
        }

        System.out.println(print);
    }

}

