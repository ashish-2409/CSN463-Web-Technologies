import java.util.*;
public class Question_1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);// creating the scanner object
        System.out.println("Enter the size of vector ");
        int n=sc.nextInt();// taking the size of vector as input

        Vector vector = new Vector(n);// creating a vector of Objects of given capacity

        while(vector.size()< vector.capacity())// till vector is not full
        {
            System.out.println("Enter 1: To add an element\nEnter 2: To exit");// printing the options header
            int option =sc.nextInt();// reading the option chosen by the user
            if(option==1){
                Object obj=sc.next();// taking the element as input
                vector.addElement(obj);// adding the element to vector
            }
            else{// else exiting the loop
                break;
            }
        }
        for(Object obj : vector){// printing the vector
            System.out.print(obj+" ");
        }
    }
}
