public class Question_4 {
    public static void main(String[] args){
        //4. swapping 2 integers
        //a. using temporary variable
        int num1=5,num2=10;
        System.out.println("\nSwapping using temporary variable");
        System.out.println("Before Swapping num1= "+num1+" num2= "+num2);
        int temp;
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("After Swapping num1= "+num1+" num2= "+num2);

        //b. without using temporary variable
        //using xor property (i.e., x^x=0 and x^0=x)
        System.out.println("\nSwapping without using temporary variable");
        num1=5;num2=10;
        System.out.println("Before Swapping num1= "+num1+" num2= "+num2);
        num1=num1^num2;     //num1=num1^num2
        num2=num2^num1;     //num2=num2^(num1^num2) => num2=num1
        num1=num1^num2;     //num1=(num1^num2)^num1 => num1=num2
        System.out.println("After Swapping num1= "+num1+" num2= "+num2);
    }
}