package com.workintech.OOP;

public class Main {
    public static void main(String[] args) {
       Person person1 = new Person("Emre", "Akyuz", 26);
        System.out.println(person1);
        Wall wall = new Wall(8,4);
        wall.setWidth(-4);
        wall.setHeight(1.5);
        System.out.println("area= " + wall.getArea());
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());

    }
}
