// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.ArrayList;
import animals.Animal;
import data.AnimalData;
import factory.AnimalFactory;
import validation.Validator;


import java.util.List;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner scanner = null;
        List<Animal> animalsList = new ArrayList<>();
        AnimalFactory animalFactory = new AnimalFactory();
        String word;


        while (true){
            System.out.println("-----------------------------------------" );
            System.out.print("Выберите одну из команд: \n 1) ADD\n 2) EXIT\n 3) LIST \n и введите ее: " );
            scanner = new Scanner(System.in);
            String commandStr = scanner.nextLine();
            commandStr = commandStr.toUpperCase().trim();
            boolean check;
            boolean bordercheck;

            switch (commandStr) {
                case "ADD" -> {System.out.println("Сейчас вы будете добавлять существо в список");
                    String animalTypeStr;
                    while (true){
                        System.out.println("Введите тип животного:");
                        animalTypeStr = scanner.next();
                        animalTypeStr = animalTypeStr.toUpperCase().trim();
                        if (!animalTypeStr.equals("CAT") && !animalTypeStr.equals("DOG") && !animalTypeStr.equals("DUCK")){
                            System.out.println("Я не знаю такого животного");
                            continue;
                        }
                        break;
                    }

                    Animal animal = animalFactory.create(AnimalData.valueOf(animalTypeStr));
                    while (true){
                        System.out.println("Введите имя животного:");
                        String name = scanner.next();
                        name = name.trim();
                        check = Validator.isContainsDigits(name);
                        if (check){
                            System.out.println("В имени не может быть цифр, попробуйте еще раз");
                            continue;
                        }
                        animal.setName(name);
                        break;
                    }
                    while (true){
                        System.out.println("Введите возраст животного:");
                        String ageStr = scanner.next();
                        String mess = Validator.numberValidation(ageStr,20);
                        if (mess != "Значение корректно"){
                            System.out.println(mess);
                            continue;
                        }
                        ageStr = ageStr.trim();
                        int age = Integer.parseInt(ageStr);
                        animal.setAge(age);
                        break;

                    }

                    while (true){
                        System.out.println("Введите вес животного");
                        String massStr = scanner.next();
                        String mess = Validator.numberValidation(massStr, 35);
                        if (mess != "Значение корректно"){
                            System.out.println(mess);
                            continue;
                        }
                        massStr = massStr.trim();
                        float mass = Float.parseFloat(massStr);
                        animal.setMass(mass);
                        break;
                    }

                    System.out.println("Введите цвет животного");
                    String color = scanner.next();
                    animal.setColor(color);

                    //System.out.println(animal);
                    animalsList.add(animal);
                    animal.say();

                }
                case "LIST" -> {System.out.println("отработал LIST");
                    for (Animal animal: animalsList) {
                        System.out.println(animal.toString());

                    }}
                case "EXIT" -> {
                    System.out.println("отработал EXIT");
                    System.exit(0);
                }
                default -> System.out.println("Введите корректную команду");
            }
       }
    }
}