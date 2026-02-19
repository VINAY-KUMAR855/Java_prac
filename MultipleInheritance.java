interface A{
    void show();
}
interface B{
    void show();
    void display();
}
class C implements A, B{
    public void display(){
        System.out.println("Display method");
    }
    public void show(){
        System.out.println("Show method");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        C c = new C();
        c.display();
        c.show();
    }
}
