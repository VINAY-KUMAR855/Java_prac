class Student{
    int id;
    String name;
    int age;
    // 1.constructor no parameter
    Student(){
        name = "Not defined";
        id = 0;
        age =0;
    }
    // 2.constructor two parameter
    Student(int id, String name){
        this.name = name;
        this.id = id;
        age = 18; // default age
    }
     // 3. Constructor (Three parameters)
    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    // // using this keyword
    // // 1.
    // Student(){
    //     this(0,"not defined",0);
    // }
    // //2.
    // Student(int id,String name){
    //     this(id,name,10);
    // }
    // // 3.
    // Student (int id, String name, int age){
    //     this.age = age;
    //     this.name = name;
    //     this.id = id;
    //        //One constructor must NOT call this()
    //       // That final constructor must assign values
    // }
    void display(){
        System.out.println(id+" " + name+" "+age);
    }
}
public class Constructor1{
    public static void main(String args[]){
        // with constructor
        Student s1 = new Student();
        Student s2 = new Student(101,"Ravi");
        Student s3 = new Student(102, "Anu", 20);

        s1.display();
        s2.display();
        s3.display();

    }
}

