import java.util.Scanner;

public class Question_4 {
    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();// taking n as input from the user
        while(n!=1)// while n is not 1
        {
            System.out.print(n+" "); //printing n
            if(n%2==0)n=n/2; // if n is even the divide by 2
            else n=n*3+1; // if n is odd multiply by 3 and then adding 1
        }
        System.out.println(n);
    }
}
