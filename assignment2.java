import java.util.Scanner;
class assignment2 {
    // simple calculator using while loop + switch
    // reverse of 4 or 5 digit only (for loop)
    // using do while to print n numbers using continue, beak
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 1.simple calculator
        char c,condition;
        int num1,num2;
        while(true){
            System.out.print("Enter operator(+ - * /):");
            c = sc.next().charAt(0);
            System.out.print("Enter num1:");
            num1 = sc.nextInt();
            System.out.print("Enter num2:");
            num2 = sc.nextInt();
            switch(c){
                case '+':
                    System.out.println(num1+"+"+num2+"="+(num1+num2));
                    break;
                case '-':
                    System.out.println(num1+"-"+num2+"="+(num1-num2));
                    break;
                case '*':
                    System.out.println(num1+"*"+num2+"="+(num1*num2));
                    break;
                case '/':
                    System.out.println(num1+"/"+num2+"="+(num1/num2));
                    break;
                case '%':
                    System.out.println(num1+"%"+num2+"="+(num1%num2));
                    break;
                default:
                    System.out.println("Enter valid inputs.");
            }
            System.out.print("e to exit and any other key to continue: ");
            condition = sc.next().charAt(0);
            if (condition=='e'){
                break;
            }
            
    }
    // 2. reverse a number
    int num,b,rev=0;
    System.out.print("Enter 4 digit number:");
    num = sc.nextInt();
    for(int i =0;i<4;i++){
        b = num % 10;
        rev = rev*10 +b;
        num = num/ 10;
        if (num==0){
            break;
        }
    }
    System.out.println("Reverse number is: "+rev);
    // 3. using do while to print n numbers using continue, beak
    int n;
    System.out.print("Enter n to print n numbers:");
    n = sc.nextInt();
    int i = 0;
    while(true){
        i++;    
        if (i==5){
            continue;
        }
        System.err.println(i);
        if(i==n){
            break;
        }
        
    }

    sc.close();
    }
}
