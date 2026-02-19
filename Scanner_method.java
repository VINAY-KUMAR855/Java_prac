// nextInt()	int
// nextFloat()	float
// nextDouble()	double
// next()	one word
// nextLine()	full line
// nextLong()	long
// nextBoolean()	boolean

// Problem: nextInt() + nextLine()
// nextInt() reads number
// ENTER key remains in buffer
// nextLine() reads that ENTER and skips input. so, we use extra sc.nextLine() in between.

import java.util.Scanner;
class Scanner_method
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter age: ");
        int age;
        age = sc.nextInt();
        System.out.print("Enter name: ");
        String name;
        sc.nextLine(); // clear buffer
        name = sc.nextLine();
        
        System.out.println("Hii! "+ name+". Your age is "+age);
        sc.close();
    }
}