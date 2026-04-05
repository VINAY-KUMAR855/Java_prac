
class A extends Thread{
    // it should contains run() method
    public void run(){
        for (int i=0;i<3;i++){
            System.out.println("hii");
            // after prininting we can ask our thred to stop some time
            try{
                Thread.sleep(10);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
class B extends Thread{
    public void run(){
        for (int i=0;i<3;i++){
            System.out.println("hello");
        }
        try{
                Thread.sleep(10);
            }
            catch (Exception e){
                System.out.println(e);
            }
    }
}
// using Runnable iterface
class C implements Runnable {
    public void run(){
        for (int i=0;i<3;i++){
            System.out.println("hello");
        }
        try{
                Thread.sleep(10);
            }
            catch (Exception e){
                System.out.println(e);
            }
    }
}
public class MultiThread {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start(); // start() creates new thread
        obj2.start();

        // using runnable to cread object Thread
        Runnable obj3 = new C();
        Thread t1 = new Thread(obj3);
        t1.start();
    }
}
