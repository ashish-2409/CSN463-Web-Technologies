import java.util.Scanner;
public class Question_2 {
    public static void Add() throws ArithmeticException {
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter 2 numbers");
        num1=sc.nextInt();
        num2=sc.nextInt();
        try {
            if (num1 < 0 || num2 < 0) {// checking if any number is negative, if yes then throwing an ArithmeticException
                throw new ArithmeticException();
            }
            System.out.println("The sum of 2 numbers is: "+(num1+num2));// printing the sum
        }
        catch(ArithmeticException e){// Handling the exception
            System.out.println("One/both of the numbers is/are negative: "+e);
        }
    }

    public static void Subtract() throws ArithmeticException {
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter 2 numbers");
        num1=sc.nextInt();
        num2=sc.nextInt();
        try {
            if (num1 < 0 || num2 < 0) {// checking if any number is negative, if yes then throwing an ArithmeticException
                throw new ArithmeticException();
            }
            System.out.println("The difference of 2 numbers is: "+(num1-num2));// printing the difference
        }
        catch(ArithmeticException e){// handling the exception
            System.out.println("One/both of the numbers is/are negative: "+e);
        }
    }

    public static void main(String[] args){
        //calling the Add and Subtract methods
        Add();
        Subtract();
    }
}
