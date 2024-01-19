package com.designPattern.Solid.SingleResponsiblityPrinciple;

import java.util.logging.Logger;

/*
 * 참고 자료 : https://www.youtube.com/watch?v=Tit-bJJm9iw
 * 단일 책임 원칙
    * 모든 method, class , module은 하나의 책임만 가져야한다.
    * Class 단위의 단일 책임 원칙
 */
public class SRP_Class {

    // Good Case : 고양이는 먹고 , 걷고 , 말할 수 있으며 자신의 상태를 알릴 수 있다.
    class Good_CatClass{

        private int age;
        private String name;

        public Good_CatClass(int age, String name) {
            this.age = age;
            this.name = name;
        }

        private void eat(){}
        private void walk(){}
        private void speak(){}
        private String representation(){
            return "age is" + this.age + "name is" + this.name;
        }

    }

    // Bad Case : 고양이는 먹고 , 걷고 , 말할 수 있으나 고양이 상태를 프린트하거나 , 고양이 상태를 로그로 남기는 등의 동작은 고양이 클래스에 적절하지 않다.
    class Bad_CatClass{
        private int age;
        private String name;

        public Bad_CatClass(int age, String name) {
            this.age = age;
            this.name = name;
        }

        private void eat(){}
        private void walk(){}
        private void speak(){}
        private void print(){
            System.out.println("age is" + this.age + "name is" + this.name);
        }
        private void log(){
            Logger log = Logger.getGlobal();
            log.severe("age is" + this.age + "name is" + this.name);
        }
    }

    // 고양이 클래스를 사용하는 Client Code에서 고양이의 상태를 어떻게 사용할지 결정하는 것이 옳다.
    class Client{
        public void getAnimalsStatus() {
            Good_CatClass goodCatClass = new Good_CatClass(3, "navi");
            String catRepresentation = goodCatClass.representation();
            Logger log = Logger.getGlobal();
            System.out.println("catRepresentation = " + catRepresentation);
            log.severe("catRepresentation = " + catRepresentation);
        }
    }

}
