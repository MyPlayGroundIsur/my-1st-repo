public class Demo17 {
    public static void main(String[] args) {
        Animal pet = new Dog("Boola");
        pet.eat();
    }
}

class Animal{
    String name = "Animal";
    void eat(){
        System.out.printf("%s is eating \n", name);
    }
}

class Dog extends Animal{

    String name;
    public Dog(String name) {
        this.name = name;
        
    } 
    void eat(){
        System.out.printf ("%s is eating \n", name);

    }
}
