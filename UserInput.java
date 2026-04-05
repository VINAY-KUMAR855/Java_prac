import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) throws IOException{
        System.out.print("Enter number: ");
        // // int n = System.in.read(); // it returns ASCII values and it only take one character
        // // System.out.println(n);

        // BufferedReader
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int num = Integer.parseInt(br.readLine());
        // br.readLine() give string 
        // Integer.parseInt converts into int
        System.out.println(num);

        // Scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        num = sc.nextInt();
        System.out.println(num);

        sc.close();
        br.close();
    }
}
