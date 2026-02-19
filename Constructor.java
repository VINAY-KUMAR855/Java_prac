// Key Rules of Constructor

// Constructor name must be the same as class name

// Constructor has no return type (not even void)

// It is called automatically when you create an object using new

// Used to initialize variables
class Student{
    String name;
    int id;
    // assign variables through method
    // void assign(String n, int i){
    //     name = n;
    //     id = i;
    // }
    // Constructor
    Student(String n, int i){
        name = n;
        id = i;
    }
    // using this keyword for same varable names
    // Student(String name, int id){
    //     this.name = name;
    //     // this.name is instance variable, id is constructor parameter
    //     this.id = id;
    // }
    void display(){
        System.out.println(id+" " + name);
    }
}
public class Constructor{
    public static void main(String args[]){
        // assign variables through method without constructor
        // Student s1 = new Student();
        // s1.assign("Vinay",861);
        // s1.display();
        
        // with constructor
        Student s2 = new Student("Vinay",861); // Student("Vinay",861); is a constructor
        s2.display();

    }
}
