package com.oop.concepts;

import com.oop.concepts.entity.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConceptsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConceptsApplication.class, args);
        MakeZoo makeZoo = new MakeZoo(3);
        Animal snake = new Reptile("Snake", "Python", "Venomous");
        Animal eagle = new Birds("Eagle", "Golden Eagle");
        Animal lion = new Mammal("Lion", "Carnivora", "Yellow");

        makeZoo.printAnimalDetails(lion);
        makeZoo.printAnimalDetails(eagle);
        makeZoo.printAnimalDetails(snake);
        makeZoo.animalActivity();
    }
}
