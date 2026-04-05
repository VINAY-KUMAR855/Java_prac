// every constructor wii have super() by default. First super() is executed and then only remaining.
// super() method means call the constructor of a super class(parent class)

class A{
    public A(){
        super();
        // every class in java extends object class. so, above super() calls constructor of object.
        System.out.println("In A");
    }
    public A(int n){
        super();
        System.out.println("In A int");
    }
}
class B extends A{
    public B(){
        super();
        System.out.println("In B");
    }

    public B (int n){
        super(n);
        System.out.println("In B int");
    }
    // public B(){
    //     super(5);
    //     System.out.println("In B");
    // }
}
// Using this we can exectue both the constructor
// This will execute constructor of same class
class T{
    T(){
        System.out.println("In T");
    }
    T(int n){
        this(); // it call constructor T(){}
        System.out.println("In T int");
    }
    T(int a, int b){
        this(a); // it call constructor T(int n){}
        System.out.println("In T int int ");
    }
}
public class ThisSuper {
    public static void main(String[] args) {
        B obj1 = new B();
        System.out.println("-------");
        B obj2 = new B(2);
        System.out.println("-------");
        T obj3 = new T(3,3);
    }
}
