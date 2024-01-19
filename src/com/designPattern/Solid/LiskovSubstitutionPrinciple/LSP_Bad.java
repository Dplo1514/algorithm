package com.designPattern.Solid.LiskovSubstitutionPrinciple;

/*
 * 참고 자료 : https://www.youtube.com/watch?v=_G50Joyys_E

 * 리스코프 치환 원칙
 * 모든 하위 클래스는 상위 클래스로의 치환이 가능하여야 한다.
 */
public class LSP_Bad {

    interface Animal {
        void speak();
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

    static class Fish implements Animal {
        // 생선은 울지 못한다.
        public void speak() {
            throw new RuntimeException("Fish Can Not Speak");
        }
    }

    public static void main(String[] args) {
        // Animal 인터페이스가 검은 고양이나, 초록 고양이로 치환되면 각 고양이의 울음 소리를 출력할 수 있다.
        Animal blackCat = new BlackCat();
        blackCat.speak();
        Animal greenCat = new GreenCat();
        greenCat.speak();

        // 허나 생선은 울지 못하기 때문에 생선을 Animal로 치환하려하면 문제가 발생한다.
        Animal fish = new Fish();
        fish.speak();
    }

}
