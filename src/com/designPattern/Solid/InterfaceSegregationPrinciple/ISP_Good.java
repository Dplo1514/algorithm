package com.designPattern.Solid.InterfaceSegregationPrinciple;

/*
 * 참고 자료 : https://www.youtube.com/watch?v=WBJm4U86m5k

 * 인터페이스 분리 원칙
 * 하나의 큰 인터페이스보다 작은 단위로 분리한 인터페이스들로 설계하는 것이 더 적절하다.
 */
public class ISP_Good {

    interface ICar {
        void drive();
        void turnLeft();
        void turnRight();
    }

    interface IBoat{
        void steer();
        void steerLeft();
        void steerRight();
    }

    // 자동차 인터페이스를 상속한 아반떼는
    // 자동차에 필요한 drive , turnLeft, turnRight method만을 구현하여 사용 가능하다.
    static class Avante implements ICar {

        @Override
        public void drive() {
            System.out.println("Avante Drive");
        }

        @Override
        public void turnLeft() {
            System.out.println("Avante turn Left");
        }

        @Override
        public void turnRight() {
            System.out.println("Avante turn Right");
        }
    }

    // 자동차 인터페이스를 상속한 아반떼는
    // 자동차에 필요한 drive , turnLeft, turnRight method만을 구현하여 사용 가능하다.
    static class Benz implements ICar {

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

    }

    // 보트 인터페이스를 상속한 제트스키는
    // drive , turnLeft, turnRight method만을 구현하여 사용 가능하다.
    static class ZetSki implements IBoat {

        @Override
        public void steer() {
            System.out.println("ZetSki steering");
        }

        @Override
        public void steerLeft() {
            System.out.println("ZetSki steer Left");
        }

        @Override
        public void steerRight() {
            System.out.println("ZetSki steer Right");
        }
    }

    // 수륙 양용 자동차가 필요하다면!
    // 작은 인터페이스들의 다중 상속을 활용하여 구현이 가능함으로
    // 인터페이스를 작게 쪼겠을 때의 장점을 알 수 있다.
    static class CarBoat implements ICar , IBoat{

        @Override
        public void drive() {
            System.out.println("CarBoat drive");
        }

        @Override
        public void turnLeft() {
            System.out.println("CarBoat turn Left");
        }

        @Override
        public void turnRight() {
            System.out.println("CarBoat turn Right");
        }

        @Override
        public void steer() {
            System.out.println("CarBoat steering");
        }

        @Override
        public void steerLeft() {
            System.out.println("CarBoat steer Left");
        }

        @Override
        public void steerRight() {
            System.out.println("CarBoat steer Right");
        }
    }

    // 육지에서 운전하는 경우에도 수륙 양용 자동차를 사용할 수 있다.
    static void driveLand(){
        ICar avante = new Avante();
        avante.drive();
        ICar benz = new Benz();
        benz.drive();
        ICar carBoat = new CarBoat();
        carBoat.drive();
    }

    static void driveSea(){
        IBoat zetSki = new ZetSki();
        zetSki.steer();
        IBoat carBoat = new CarBoat();
        carBoat.steer();
    }

    public static void main(String[] args) {
        driveLand();
        driveSea();
    }

}
