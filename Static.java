class Student{
    int roll;
    String name;
    static String col = "Rgukt";
    // static method to update college 
    static void update(){
        col = "Rgukt-ONG";
    }

    // constructor
    Student(int roll, String name){
        this.roll = roll;
        this.name = name;
    }
    // static block; it execut first, then only main method executed
    static{System.out.println("varun");}
    // to display the information
    void display(){
        System.out.println(roll+ " "+ name+" "+col);
    }
}
class Static{
    int a = 10;
    static int b = 20;
    public static void main(String args[]){
        Student s1 = new Student(1,"vinay");
        Student s2 = new Student(2,"Varun");
        s1.display();
        s2.display();
        // s1.update();
        // s2.update();
        Student.update();
        s1.display();
        s2.display();
        Static p = new Static();
        System.out.println(p.a);
        System.out.println(b);
    }
}
