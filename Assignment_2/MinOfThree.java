public class MinOfThree {
    public static void main(String[] args){
        int num1=4,num2=5,num3=3;// defining 3 numbers

        if(num1<num2 && num1<num3){ //checking if num1 is the smaller than both num2 and num3
            System.out.println("Smallest number is num1 = "+num1);
        }
        else if(num2<num1 && num2<num3){//checking if num2 is the smaller than both num1 and num3
            System.out.println("Smallest number is num2 = "+num2);
        }
        else if(num3<num2 && num3<num1){//checking if num3 is the smaller than both num2 and num1
            System.out.println("Smallest number is num3 = "+num3);
        }
    }
}
