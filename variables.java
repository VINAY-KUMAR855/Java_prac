class Access {
    int a = 10;
    static String name="vinay";
    void age(){
        int age=18;
        System.out.println("My age: "+age);
        System.out.println("a="+a);
        System.out.println("string"+name);
    }
}

class variables{
    public static void main(String[] arg){
        Access ob1 = new Access();
        System.out.println(Access.name);
        System.out.println(ob1.a);
        ob1.age();
    }
}