package animals;

public abstract class Animal {

    private int age = -1;
    private String name = "";
    private float mass = -1;
    private String color = "";


//    public Animal (int age, String name, float mass, String color){
//        this.name = name;
//        this.age = age;
//        this.mass = mass;
//        this.color = color;
//
//    }

    public void  setName(String name) {
        this.name = name;
    }

    public void  setAge(int age) {
        this.age = age;

    }

    public void setMass(float mass){
        this.mass = mass;
    }

    public void  setColor(String color) {
        this.color = color;
    }

    public int getAge(){
        return age;
    }

    public float getMass(){
        return mass;
    }
    public String getName(){
        return name;
    }

    public String getColor(){
        return color;
    }






    public  void say() {
        System.out.println("Я издаю звук");
    };

    public  void go() {
        System.out.println("Я иду");
    }

    public  void drink() {
        System.out.println("Я пью");
    }

    public void eat(){
        System.out.println("Я ем");
    };



    String ageDeclination = ageDeclination();

    public String toString(){
        return String.format("Привет! Меня зовут %s, мне %d %s, я вешу - %s кг, мой цвет - %s",
                this.name,
                this.age ,
                ageDeclination,
                this.mass,
                this.color
        );
    }

    private String ageDeclination(){
     if(this.age >= 11 && this.age <=19){
        return "лет";
      }
    int lastNumber = this.age % 10;
      if(lastNumber == 0 || lastNumber >= 5){
        return "лет";
    }

      if(lastNumber == 1){
        return "год";
    }

    return "года";
    }

}

