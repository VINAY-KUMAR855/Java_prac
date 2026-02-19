
// class Main{
//     static int age;
//     public static void main(String[] arguments){
//         int age=20;
//         System.out.println("My age "+ age + " years old.");
//     }
// }
class Animal{
    void dog(){
        System.out.println("Dog is Barking");
    }
}
class Main{
    public static void main(String[] args){
        Animal dog1 = new Animal();
        //Animal dog2 = new Animal();
        dog1.dog();
    }
}