package com.oop.concepts.entity;

import lombok.Data;

/**Reptile extends Animal class and overrides Parent class method an example of inheritance
as per its need
here super keyword is used to call parent class constructor**/
@Data
public class Reptile extends Animal {
    public String breed;

    public Reptile(String name, String type, String breed) {
        super(name, type);
        this.breed = breed;
    }

    @Override
    public void eat() {
        System.out.println("Reptile is eating");
    }
}
