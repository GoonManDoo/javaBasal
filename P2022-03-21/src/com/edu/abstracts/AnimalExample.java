package com.edu.abstracts;

public class AnimalExample {
    public static void main(String[] args) {
//		Animal animal = new Animal(); //인스턴스 생성불가
        Animal animal = null;
        animal = new Dog();
        animal.eat();
        animal.speak();
        animal.setName("고기만두");
        
        
        animal = new Cat();
        animal.setName("김치만두");
        animal.eat();
        animal.speak();
    }
}
