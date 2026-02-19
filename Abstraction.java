// abstract class
abstract class Animal{
    // abstract method(which must be implemented in child class)
    // abstract method: only method signature, no body
    abstract void makeSound();
    // concrete (normal) method: has body
    void sleep(){
        System.out.println("Animal is sleeping.");
    }
}
// Concrete classes
class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Bark");
    }
}
class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("Meow");
    }
}
public class Abstraction {
    public static void main(String[] args){
        // Animal a1 = new Dog();
        // a1.makeSound();
        // a1.sleep();
        Animal[] zoo = {
            new Dog(),
            new Cat()
        };
        for (Animal animal:zoo){
            animal.makeSound();
        }
    }
}
