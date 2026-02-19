// import java.lang.String;
import java.util.Scanner;
class String_create {
    public static void main(String[] args) {
        // Using String Literal
        String s1 = "java";
        System.out.println(s1);
        // Using new Keyword
        String s2 = new String("programming language");
        System.out.println(s2);
        //
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Your name: "+name);
    }
}
