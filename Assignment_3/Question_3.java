import java.util.Arrays;
import java.util.Scanner;

public class Question_3 {
    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();// taking string as input

        // as string class does not have any sort method, we convert string to array of characters , then sort it and then convert it back to a string
        char []ch=str.toCharArray();// converting string to array of characters

        Arrays.sort(ch);// sorting character array

        str=new String(ch);// converting array back to string

        System.out.println("String after sorting is "+str);
    }
}
