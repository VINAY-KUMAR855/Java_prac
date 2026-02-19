import java.util.Scanner;
class Ass{
    public static void main(String[] args){
        // 1.eligible for vote or not
        Scanner sc = new Scanner(System.in);     
        int age;
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        if (age>18){
            System.out.println("You are eligible for vote");
        }
        else{
            System.out.println("You are not eligible for vote");
        }
        
        // 2. grade
        int marks;
        System.out.print("Enter marks:");
        marks = sc.nextInt();
        if (marks>90){
            System.out.println("Grage: Ex");
        }
        else if (marks>80){
            System.out.println("Grade: A");

        }
        else if (marks>70){
            System.out.println("Grade: B");
        }
        else if (marks>60){
            System.out.println("Grade: C");
        }
        else{
            System.out.println("Grade: F");
        }

        // 3.week days 
        int day;
        System.out.print("Enter day number: ");
        day = sc.nextInt();
        switch(day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("ENter between 1 and 7");
        }
        // greatest of 3 numbers
        int a,b,c;
        System.out.print("Enter a:");
        a = sc.nextInt();
        System.out.print("Enter b:");
        b = sc.nextInt();
        System.out.print("Enter c:");
        c = sc.nextInt();
        if(a>=b){
            if (a>=c){
            System.out.println(a+"is grater.");
            }
            else{
                System.out.println(c+"is greater.");
            }
        }
        else if (b>=c){
            if (b>=a){
            System.out.println(b+"is greater.");
            }
            else{
                System.out.println(a+"is grater");
            }
        }
        else{
            if(c>=b){
            System.out.println(c+"is greater.");
            }
            else{
                System.out.println(b+"is greater.");
            }
        }
        // calculator
        int ope,num1,num2;
        System.out.print("Enter operator1)+ 2)- 3)* 4) / :"); // try to read character
        ope = sc.nextInt();
        System.out.print("Enter num1:");
        num1 = sc.nextInt();
        System.out.print("Enter num2:");
        num2 = sc.nextInt();
        switch (ope){
            case 1:
                System.out.println(num1+"+"+num2+"="+(num1+num2));
                break;
            case 2:
                System.out.println(num1+"-"+num2+"="+(num1-num2));
                break;
            case 3:
                System.out.println(num1+"*"+num2+"="+(num1*num2));
                break;
            case 4:
                System.out.println(num1+"/"+num2+"="+(num1/num2));
                break;
            case 5:
                System.out.println(num1+"%"+num2+"="+(num1%num2));
                break;
            default:
                System.out.println("Enter valid inputs.");

        }
    // login
    int pass,key = 12345;
    System.out.print("Enter password:");
    pass = sc.nextInt();
    if (pass==key){
        System.out.print("Successfully login.");
    }
    else if(pass < key){
        System.out.print("Password is small. Enter correct password.");
    }
    else{
        System.out.print("password if big. Enter correct password.");
    }


        sc.close();
    }
}