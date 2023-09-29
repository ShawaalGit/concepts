package com.oop.concepts.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
/**Animal class is going to be our base with 2 methods
that are going to be implemented by the child class**/
@Data
@NoArgsConstructor
public class Animal {
    private String name;
    private String type;

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void eat() {
        System.out.println("Animal is eating");
    }

    public void running() {
        System.out.println("Animal is running");
    }

    public void flying() {
        System.out.println("Animal is flying");
    }
}
