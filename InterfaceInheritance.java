// interface->class use implements
// interface->interface or class->class use extends
interface Printable{
    void print();
}
interface Showable extends Printable{
    void show();
}
class Test implements Showable{
    public void show(){
        System.out.println("Show mwthod");
    }
    public void print(){
        System.out.println("Print method");
    }
}
public class InterfaceInheritance {
    public static void main(String[] args) {
        Test t = new Test();
        t.print();
        t.show();
    }
}
