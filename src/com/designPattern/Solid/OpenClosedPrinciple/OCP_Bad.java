package com.designPattern.Solid.OpenClosedPrinciple;

/*
 * 참고 자료 : https://www.youtube.com/watch?v=EmnIdUvTRfk

 * 확장 폐쇄 원칙
 * 모든 method, class , module은 확장에는 열려있고 수정에는 닫혀있어야한다.
 */
public class OCP_Bad {

    static class Animal_Bad {

        // 동물의 종류
        private String type;

        public Animal_Bad(String type) {
            this.type = type;
        }

        public void hey(Animal_Bad animalBad) {
            if (this.type.equals("Dog")) {
                System.out.println("bark");
            } else if (this.type.equals("Cat")) {
                System.out.print("meow");
            } else {
                throw new RuntimeException("valid Animal Type");
            }
        }

    }


    public static void main(String[] args) {
        Animal_Bad dog = new Animal_Bad("Dog");
        Animal_Bad cat = new Animal_Bad("Cat");
        dog.hey(dog);
        cat.hey(cat);

        /*
            Animal class의 범주에는 개와 고양이밖에 정의되어 있지 않으므로
            소와 양이 추가되게 되면 Animal class의 hey 함수가 변경되어야함
            이는 client의 사용에 따라 Animal class가 변경되어야함으로 open-closed 원칙을 위반한다.
        */

        Animal_Bad cow = new Animal_Bad("Cow");
        Animal_Bad sheep = new Animal_Bad("Sheep");
        cow.hey(cow);
        sheep.hey(sheep);
    }

}
