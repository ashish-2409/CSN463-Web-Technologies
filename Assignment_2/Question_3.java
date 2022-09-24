import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);// Scanner object to take input from the user
        int month=sc.nextInt(); // index of the month as input

        switch(month){// adding cases for all months
            case 1:{
                System.out.println("Month: January, number of days: 31");
                break;
            }
            case 2:{
                System.out.println("Month: February, number of days: 28");
                break;
            }
            case 3:{
                System.out.println("Month: March, number of days: 31");
                break;
            }
            case 4:{
                System.out.println("Month: April, number of days: 30");
                break;
            }
            case 5:{
                System.out.println("Month: May, number of days: 31");
                break;
            }
            case 6:{
                System.out.println("Month: June, number of days: 30");
                break;
            }
            case 7:{
                System.out.println("Month: July, number of days: 31");
                break;
            }
            case 8:{
                System.out.println("Month: August, number of days: 31");
                break;
            }
            case 9:{
                System.out.println("Month: September, number of days: 30");
                break;
            }
            case 10:{
                System.out.println("Month: October, number of days: 31");
                break;
            }
            case 11:{
                System.out.println("Month: November, number of days: 30");
                break;
            }
            case 12:{
                System.out.println("Month: December, number of days: 31");
                break;
            }
            default:{// handling invalid input
                System.out.println("Invalid month number");
                break;
            }
        }
    }
}