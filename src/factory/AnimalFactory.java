package factory;

import animals.Animal;
import animals.birds.Duck;
import animals.pets.Cat;
import animals.pets.Dog;
import data.AnimalData;

public class AnimalFactory {
//
//    private String name = "";
//    private int age = -1;
//    private  float mass = -1;
//    private  String color = "";
//    public AnimalFactory(int age, String name, float mass, String color){
//        this.name = name;
//        this.age = age;
//        this.mass = mass;
//        this.color = color;
//    }



    public Animal create (AnimalData animalData) {
        return switch (animalData) {
            case CAT -> new Cat();
            case DOG -> new Dog();
            case DUCK -> new Duck();

        };

    }
}
