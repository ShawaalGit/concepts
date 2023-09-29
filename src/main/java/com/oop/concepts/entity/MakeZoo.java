package com.oop.concepts.entity;

import lombok.Data;

import java.util.Arrays;

/**The Animal[] array is an example of encapsulation here
and makeZoo provides a method to print animal details.**/
@Data
public class MakeZoo {
    private Animal[] animals;

    public MakeZoo(int capacity) {
        animals = new Animal[capacity];
    }

    public void printAnimalDetails(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                System.out.println(animal.getName() + " " + animal.getType());
                return;
            }
        }
    }

    /**Birds Reptiles and Mammals Overrides methods of parents class shows the example of polymorphism
    * If the child class did not override a parents class method
    * Parent class method is called.**/
    public void animalActivity() {
        Arrays.stream(animals).forEach(Animal::eat);
        Arrays.stream(animals).forEach(Animal::running);
        Arrays.stream(animals).forEach(Animal::flying);
    }
}
