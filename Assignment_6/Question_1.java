import java.util.Scanner;
public class Question_1 {
    public static void multiply() throws ArithmeticException {
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter 2 numbers");
        num1=sc.nextInt();
        num2=sc.nextInt();
        try {
            if (num1 == 0 || num2 == 0) {// checking if any of the numbers is zero or not
                throw new ArithmeticException();// if above is yes, then throwing an arithmetic exception
            }
            System.out.println("The product of 2 numbers is: "+(num1*num2));// else printing the product of them
        }
        catch(ArithmeticException e){// catching the exception
            System.out.println("One/both of the numbers is/are zero: "+e);
        }
    }

    public static void division() throws ArithmeticException {
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter 2 numbers");
        num1=sc.nextInt();
        num2=sc.nextInt();
        try {
            if (num1 == 0 || num2 == 0) {// checking if any of the numbers is zero or not
                throw new ArithmeticException();// if above is yes, then throwing an arithmetic exception
            }
            System.out.println("The quotient of division of 2 numbers is: "+(num1/num2));// else printing the quotient of them
        }
        catch(ArithmeticException e){// catching the exception
            System.out.println("One/both of the numbers is/are zero: "+e);
        }
    }

    public static void main(String[] args){
        // tester code for calling the multiply and division methods
            multiply();
            division();
    }
}
