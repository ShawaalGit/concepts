package com.oop.concepts.entity;

import lombok.Data;
/**Mammal extends Animal class and overrides Parent class method an example of inheritance
as per its need
here super keyword is used to call parent class constructor**/
@Data
public class Mammal extends Animal {
    private String color;

    public Mammal(String name, String type, String color) {
        super(name, type);
        this.color = color;

    }

    @Override
    public void running() {
        System.out.println("Mammal is running");
    }

    @Override
    public void eat() {
        System.out.println("Mammal is eating");
    }

}
