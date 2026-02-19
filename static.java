class Test{
    void show(){
        System.out.println("show");
    }
}
class Test1{
    static void show(){
        System.out.println("show");
    }
}
class Res{
    static int age =20;
    static void age(){
        System.out.println(age);
    }
    public static void main(String[] arg){
        Test t1 = new Test();
        t1.show(); // need of object
        Test1.show(); // no need of object we can directly cll using class
        age();// same use Res.age();
    }
}
