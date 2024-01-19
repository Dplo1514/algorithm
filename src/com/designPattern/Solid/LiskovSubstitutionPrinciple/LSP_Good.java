package com.designPattern.Solid.LiskovSubstitutionPrinciple;

/*
 * 참고 자료 : https://www.youtube.com/watch?v=_G50Joyys_E

 * 리스코프 치환 원칙
 * 모든 하위 클래스는 상위 클래스로의 치환이 가능하여야 한다.
 */
public class LSP_Good {

    interface Animal {
        void speak();
    }

    interface Fish{
        void swim();
    }

    static class BlackCat implements Animal {
        public void speak() {
            System.out.println("black meow");
        }
    }

    static class GreenCat implements Animal {
        public void speak() {
            System.out.println("green meow");
        }
    }

    static class BlackFish implements Fish{

        @Override
        public void swim() {
            System.out.println("Black Fish Swimming");
        }
    }

    static class GreenFish implements Fish{

        @Override
        public void swim() {
            System.out.println("Green Fish Swimming");
        }
    }

    public static void main(String[] args) {
        // Animal 인터페이스가 검은 고양이나, 초록 고양이로 치환되면 각 고양이의 울음 소리를 출력할 수 있다.
        Animal blackCat = new BlackCat();
        blackCat.speak();
        Animal greenCat = new GreenCat();
        greenCat.speak();

        // Fish 인터페이스를 분리하고 적합한 하위 클래스로 치환하여 사용해야 치환에 문제가 없다.
        // 부적절한 인터페이스를 구현하여 하위 클래스로 치환하려하면 안된다.
        Fish blackFish = new BlackFish();
        blackFish.swim();
        Fish greenFish = new GreenFish();
        greenFish.swim();

    }

}
