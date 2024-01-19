package com.designPattern.Solid.InterfaceSegregationPrinciple;

/*
 * 참고 자료 : https://www.youtube.com/watch?v=WBJm4U86m5k

 * 인터페이스 분리 원칙
 * 하나의 큰 인터페이스보다 작은 단위로 분리한 인터페이스들로 설계하는 것이 더 적절하다.
 */
public class ISP_Bad {

    // 큰 하나의 교통 수단 인터페이스
    interface ITransportation {
        void drive();
        void turnLeft();
        void turnRight();
        void steer();
        void steerLeft();
        void steerRight();
    }

    // 교통 수단 인터페이스를 상속한 아반떼는
    // drive , turnLeft, turnRight method는 필요하지만
    // steer , steerLeft, steerRight method는 필요하지 않아도
    // 교통 수단이라는 큰 인터페이스를 구현한 구현체이기 때문에 내부에 메서드가 존재한다.
    static class Avante implements ITransportation {

        @Override
        public void drive() {

        }

        @Override
        public void turnLeft() {

        }

        @Override
        public void turnRight() {

        }

        @Override
        public void steer() {

        }

        @Override
        public void steerLeft() {

        }

        @Override
        public void steerRight() {

        }
    }

    // 교통 수단 인터페이스를 상속한 벤츠는
    // drive , turnLeft, turnRight method는 필요하지만
    // steer , steerLeft, steerRight method는 필요하지 않아도
    // 교통 수단이라는 큰 인터페이스를 구현한 구현체이기 때문에 내부에 메서드가 존재한다.
    static class Benz implements ITransportation {

        @Override
        public void drive() {
            System.out.println("Benz Drive");
        }

        @Override
        public void turnLeft() {
            System.out.println("Benz turn Left");
        }

        @Override
        public void turnRight() {
            System.out.println("Benz turn Right");
        }

        @Override
        public void steer() {

        }

        @Override
        public void steerLeft() {

        }

        @Override
        public void steerRight() {

        }
    }

    // 교통 수단 인터페이스를 상속한 제트스키는
    // steer , steerLeft, steerRight method는 필요하지만
    // drive , turnLeft, turnRight method는 필요하지 않아도
    // 교통 수단이라는 큰 인터페이스를 구현한 구현체이기 때문에 내부에 메서드가 존재한다.
    static class ZetSki implements ITransportation {

        @Override
        public void drive() {

        }

        @Override
        public void turnLeft() {
            System.out.println("Avante turn Left");
        }

        @Override
        public void turnRight() {
            System.out.println("Avante turn Right");
        }

        @Override
        public void steer() {

        }

        @Override
        public void steerLeft() {

        }

        @Override
        public void steerRight() {

        }
    }

    public static void main(String[] args) {
        Avante avante = new Avante();
        Benz benz = new Benz();
        ZetSki zetSki = new ZetSki();
    }

}
