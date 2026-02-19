// The interface in Java is a mechanism to achieve abstraction. 
// There can be only abstract methods in the Java interface, not method body.
// It is used to achieve abstraction and multiple inheritance in Java.
// An interface in Java is a blueprint of a class. It has static constants and abstract methods.
// Variables are public static final 
// methods are public
interface  Animal{
    int age = 50; // automatically public static final
    void sound(); // abstract method (no body)    
}
class Dog implements Animal{
    public void sound(){
        System.out.println("Dog barks");
    }
    void display_age(){
        System.out.println("Age: "+age);
    }
}
public class Interface {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.display_age();
    }
}
