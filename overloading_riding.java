class overloading_riding {
    // Method overloading : 
    // only method name is same but parameter list is different.
    static int sum1(int a, int b){
        return a+b;
    }
    static int sum1(int a, int b, int c){
        return a+b+c;
    }
    // Method overriding: 
    // method heading is same but body is different.
    /* 
    static void hello(){
        System.out.println("Hello ubuntu");
    }
    static void hello(){
        System.out.println("Hello ubuntu laptop.");
    }
    */
    public static void main(String[] args){
        int a=10,b=20,c=30;
        System.out.println(sum1(a,b));
        System.out.println(sum1(a,b,c));

    }   
}
