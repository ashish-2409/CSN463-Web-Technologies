import java.util.Scanner;
class Calculator{// Calculator class
    private int num1,num2;// declaring private variables num1 and num2


    // in all the below methods, the integers are taken in input as string
    // then they are converted into integers using the parseInt method, if the strings contain any non integer character then it throws a NumberFormatException
    // the exception is then handled
    //else the result of the operation is printed
    public void addition(){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter two integers");
            num1=Integer.parseInt(sc.next());
            num2=Integer.parseInt(sc.next());
            System.out.println("The sum of integers is "+(num1+num2));
        } catch (NumberFormatException e) {
            System.out.println("The inputs given are not integers.");
        }
    }
    public void subtraction(){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter two integers");
            num1=Integer.parseInt(sc.next());
            num2=Integer.parseInt(sc.next());
            System.out.println("The difference os integers is "+(num1-num2));
        } catch (NumberFormatException e) {
            System.out.println("The inputs given are not integers.");
        }
    }
    public void multiply(){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter two integers");
            num1=Integer.parseInt(sc.next());
            num2=Integer.parseInt(sc.next());
            System.out.println("The product of the integers is "+(num1*num2));
        } catch (NumberFormatException e) {
            System.out.println("The inputs given are not integers.");
        }
    }
    public void division(){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter two integers");
            num1=Integer.parseInt(sc.next());
            num2=Integer.parseInt(sc.next());
            System.out.println("The quotient of the division of integers is "+(num1/num2));
        } catch (NumberFormatException e) {
            System.out.println("The inputs given are not integers.");
        }
    }
}
public class Question_3 {// main class
    public static void main(String[] args){
        //creating and calling methods for each operation
        Calculator obj1=new Calculator();
        obj1.addition();

        Calculator obj2=new Calculator();
        obj2.subtraction();

        Calculator obj3=new Calculator();
        obj3.multiply();

        Calculator obj4=new Calculator();
        obj4.division();
    }
}
