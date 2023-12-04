package animals.birds;

import animals.Animal;

public class Duck extends Animal implements IFLy {

//    public Duck (int age, String name, float mass, String color) {
//        super (age, name, mass, color);
//    }

    public void say(){
        System.out.println("Кря");
    }


    public void fly(){
        System.out.println("Я летаю");
   }
}
