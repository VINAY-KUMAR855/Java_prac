// this() means: “call another constructor of the SAME class”
// this.variable	refers to current object variable
// this()	calls another constructor

// Imagine filling a form 
// Short form
// Name
// Course

// Long form
// Name
// Course
// Fee
// Instead of writing name & course again, you say:
// “Use the short form first, then I’ll add fee”
// That “use short form first” is  this()

// this() must be First line in constructor
class A{
    A(){
        System.out.println("hello a");
    }
    A(int a){
        this();  // call A()
        System.out.println(a);
    }
}
class Student{
    int roll;
    String name, course;
    float fee;
    // Constructor 1
    Student(int roll, String name, String course){
        this.roll = roll;
        this.name = name;
        this.course = course;
    }
    // Constructor 2
    Student (int roll, String name, String course, float fee){
        this(roll,name, course); // call Constructor 1
        this.fee = fee;
    }
    void display(){
        System.out.println(roll+" "+name+" "+course+" "+fee);
    }
}
class thisKeyw{
    public static void main(String args[]){
        A a = new A(10);
        Student s1 = new Student(21,"Vinay","AI",45000f);
        s1.display();
    }
}