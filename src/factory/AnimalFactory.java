package factory;

import animals.Animal;
import animals.birds.Duck;
import animals.pets.Cat;
import animals.pets.Dog;
import data.AnimalData;

public class AnimalFactory {

    public Animal create (AnimalData animalData) {
        return switch (animalData) {
            case CAT -> new Cat();
            case DOG -> new Dog();
            case DUCK -> new Duck();

        };

    }
}
