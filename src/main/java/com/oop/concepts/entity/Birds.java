package com.oop.concepts.entity;

import lombok.Data;

/**Birds extends Animal class and overrides Parent class method an example of inheritance
as per its need
here super keyword is used to call parent class constructor**/
@Data
public class Birds extends Animal {
    public Birds(String name, String type) {
        super(name, type);
    }

    @Override
    public void eat() {
        System.out.println("Bird is eating");
    }

    @Override
    public void flying() {
        System.out.println("Bird is flying");
    }

}
