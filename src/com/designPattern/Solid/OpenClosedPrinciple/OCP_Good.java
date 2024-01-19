package com.designPattern.Solid.OpenClosedPrinciple;

/*
 * 참고 자료 : https://www.youtube.com/watch?v=EmnIdUvTRfk

 * 확장 폐쇄 원칙
    * 모든 method, class , module은 확장에는 열려있고 수정에는 닫혀있어야한다.
 */
public abstract class OCP_Good {

    static abstract class Animal_Good {
        public abstract void speak();
    }

    static class Cat extends Animal_Good{
        public void speak() {
            System.out.println("meow");
        }
    }

    static class Dog extends Animal_Good{
        public void speak() {
            System.out.println("bark");
        }
    }

    static class Cow extends Animal_Good{
        public void speak() {
            System.out.println("mumu");
        }
    }

    static class Sheep extends Animal_Good{
        public void speak() {
            System.out.println("Meaaaah");
        }
    }

    public static void main(String[] args) {
        /*
            Animal class의 범주는 정해져있지 않으므로
            소와 양이 추가되게 되면 Animal class를 상속받는 class를 추가로 작성하면 된다 .
            이는 client의 사용에 따라 Animal class가 변경될 필요는 없으나
            추가적인 클래스가 Animal class를 필요에따라 확장하여 사용 가능함으로 open-closed 원칙을 위반하지 않는다.
        */
        Animal_Good cat = new Cat();
        cat.speak();
        Animal_Good dog = new Dog();
        dog.speak();
        Animal_Good cow = new Cow();
        cow.speak();
        Animal_Good sheep = new Sheep();
        sheep.speak();
    }

}
