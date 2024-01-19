package com.designPattern.Solid.DependencyInversionPrinciple;

import java.util.ArrayList;
import java.util.List;

/*
 * 참고 자료 : https://www.youtube.com/watch?v=WBJm4U86m5k

 * 의존 역전 원칙
 * 고수준 모듈은 저수준 모듈에 의존해서는 안되며, 양쪽 모듈 모두 추상화에 의존해야 한다.
 */
public class DI_Good {
    abstract static class Animal{
        abstract void speak();
    }

    static class Cat extends Animal{

        @Override
        void speak() {
            System.out.println("meow");
        }
    }

    static class Dog extends Animal{
        @Override
        void speak() {
            System.out.println("bark");
        }
    }

    static class Sheep extends Animal{
        @Override
        void speak() {
            System.out.println("meahhh");
        }
    }

    static class Cow extends Animal{
        @Override
        void speak() {
            System.out.println("muuuu");
        }
    }

    static class Zoo_Good{

        private List<Animal> animalList = new ArrayList<>();


        // 고수준 모듈 동물원은 동물 class에 의존성이 있다.
        void addAnimal(Animal animal){
            this.animalList.add(animal);
        }

        void speakAll(){
            for (Animal animal : animalList) {
                animal.speak();
            }
        }
    }

    public static void main(String[] args) {
        Zoo_Good zoo = new Zoo_Good();
        // 원래 동물원에는 고양이와 강아지가 있었다.
        zoo.addAnimal(new Cat());
        zoo.addAnimal(new Dog());
        zoo.speakAll();
        // 양과 소도 추가해야되는 상황이라면
        zoo.addAnimal(new Sheep());
        zoo.addAnimal(new Cow());
        zoo.speakAll();
    }

}
