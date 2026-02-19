// Encapsulation means wrapping data (variables) and code (methods) together into a single unit (class), and restricting direct access to the data.
// How Encapsulation is Achieved?
// 1. Make variables private
// 2. Provide public getter and setter methods

class Human{
    private int age; // access only this class
    private String name;
    // acces above data only using methods(getter and setter)
    public void setAge(int age){
        this.age =age ;
    }
    
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(11);
        obj.setName("Vinay");
        // System.out.println(obj.age);
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}
