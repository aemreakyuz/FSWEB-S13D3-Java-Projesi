package com.workintech.OOP;

import java.util.Arrays;

public class Person {

    String firstName;
    String lastName;
    int age;
    boolean isMarried;
    String[] hobbies;


    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, String[] hobbies) {
        this.firstName = firstName;
        this.hobbies = hobbies;
        this.lastName = lastName;
    }

    public String getFirstName() {
        System.out.println(firstName);
        return this.firstName;
    }


    public String toString() {
        return "House{" +
                "firstName= " + firstName +
                ", lastName=" + lastName +
                ", age=" + age +
                ", isMarried=" + isMarried +
                ", hobbies=" + Arrays.toString(hobbies) +
                '}';
    }
}
