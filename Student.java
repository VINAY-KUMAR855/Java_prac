
class Student{
    String name;
    int age;
    void study(){
        System.out.println(name+" is studying!");
    }
    // assign variables through method
    void assign(String n, int a){
        age = a;
        name = n;
    }
    public static void main(String args[]){
        // create objects
        Student s1 = new Student();
        s1.name = "Vinay";
        s1.age = 18;
        s1.study();

        Student s2 = new Student();
        s2.name = "Varun";
        s2.age = 16;
        s2.study();

        Student s3 = new Student();
        s3.assign("Yaswitha",5);
        s3.study();
    }
}