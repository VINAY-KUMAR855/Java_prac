import java.util.Scanner;
class sum {
    static int sum1(int a, int b){
        return a+b;
    }
    int sum2 (int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int a,b;
           System.out.print("Enter a:");
           a = sc.nextInt();
           System.out.print("Enter b:");
           b = sc.nextInt();
           int c;
           c = sum1(a,b);
           System.out.println(c);
            sum obj = new sum();
            c = obj.sum2(300,400);
            System.out.println(c);
        sc.close();
    }
}
    
