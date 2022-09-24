import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);// creating the scanner object
        int n=sc.nextInt();// taking n as input from user

        System.out.println("n n^2 n^3 n^4");// printing the header

        for(int i=1;i<=n;i++){// iterating over all numbers from 1 to n
            int pow=i;
            for(int j=0;j<4;j++){// iterating over to get all powers (till power of 4)
                System.out.print(pow+"  ");
                pow=pow*i;// getting next power
            }
            System.out.println();
        }
    }
}
