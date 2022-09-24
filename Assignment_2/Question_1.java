import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);// creating scanner object to take input from the user

        double score=sc.nextDouble();// taking input from the user

        System.out.println("Initial score : "+score);

        if(score>=80.0 && score<=90.0){ //checking if 80<=score<=90
            score+=5;// increasing score by 5
        }

        System.out.println("Final score : "+score);
    }
}
