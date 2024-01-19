package com.designPattern.Solid.DependencyInversionPrinciple;

/*
 * 참고 자료 : https://www.youtube.com/watch?v=WBJm4U86m5k

 * 의존 역전 원칙
 * 고수준 모듈은 저수준 모듈에 의존해서는 안되며, 양쪽 모듈 모두 추상화에 의존해야 한다.
 */
public class DI_Bad {

    static class Cat{
        void speak() {
            System.out.println("meow");
        }
    }

    static class Dog{
        void speak() {
            System.out.println("bark");
        }
    }

    static class Sheep{
        void speak() {
            System.out.println("meahhh");
        }
    }

    static class Cow{
        void speak() {
            System.out.println("muuuuu");
        }
    }

    static class Zoo_Bad {

        private Cat cat = new Cat();
        private Dog dog = new Dog();

        // 동물원은 고양이 class와 강아지 class에 의존성이 있다.
        public Zoo_Bad(Cat cat, Dog dog) {
            this.cat = cat;
            this.dog = dog;
        }

        void speakAll(){
            cat.speak();
            dog.speak();
        }

        // 양이 추가되고 소가 추가되면?
        // 점점 더 많은 하위 레벨 모듈에 의존하게 된다.
        private Sheep sheep = new Sheep();
        private Cow cow = new Cow();

        public Zoo_Bad(Cat cat, Dog dog, Sheep sheep, Cow cow) {
            this.cat = cat;
            this.dog = dog;
        }
        // 또한 유지보수에 악영향을 끼친다.
//        void speakAll(){
//            cat.speak();
//            dog.speak();
//            sheep.speak();
//            cow.speak();
//        }
    }

    public static void main(String[] args) {
        Zoo_Bad zoo = new Zoo_Bad(new Cat(), new Dog());
        zoo.speakAll();
    }

}
