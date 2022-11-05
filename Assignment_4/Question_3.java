class Number{// creating the Number class
    private double num;// private double instance variable

    //constructor to initialize the value of the num variable
    Number(double n){
        num=n;
    }
    public double disp(){// function to display the number
        return num;
    }// function to display the number


    //functions with the boolean return type
    public boolean isZero(){
        return (num==0);
    }
    public boolean isPositive(){
        return (num>0);
    }
    public boolean isNegative(){
        return (num<0);
    }
    public boolean isOdd(){
        return (num%2==1);
    }
    public boolean isEven(){
        return (num%2==0);
    }
    public boolean isPrime(){
        for(int i=2;i<num;i++){
            if(num%i==0)return false; //if num is divisible by any number other than 1 and num then it is not prime
        }
        return true;
    }
    public boolean isArmstrong(){// Armstrong number is a number that is equal to the sum of cubes of its digits
        int n=(int)num,sum=0;
        while(n>0){
            int x=n%10;
            sum+=(x*x*x);// finding sum of cubes of its digits
            n=n/10;
        }
        return (sum==num);// returning if num is armstrong
    }


    // functions with the double return type
    public double getFactorial(){
        double ans=1;
        for(int i=1;i<=num;i++){
            ans=ans*i;// getting the factorial of num
        }
        return ans;
    }
    public double getSqrt(){
        double ans=1;
        int n=(int)num;
        while(ans*ans<=n){
            ans++;// finding the largest ans that is > the square root of num
        }
        return ans-1;// returning the square root of num which is ans-1
    }
    public double getSqr(){
        return (num*num);// return the square of num
    }
    public double sumDigits(){
        double ans=0;
        int n=(int)num;
        while(n>0){
            ans+=(n%10);// adding the last digit of n
            n/=10;// removing the last digit of n
        }
        return ans;// return sum of digits
    }
    public double getReverse(){
        int ans=0;
        int n=(int)num;
        while(n>0){
            ans=ans*10+(n%10);// this steps reverses the current digit of n
            n/=10;
        }
        return ans;// returns the reversed num
    }

    // methods with void return type
    public void listFactors(){// to print all the factors of num
        for(int i=1;i<=num;i++){
            if(num%i==0)// if i is a factor of num print it
                System.out.print(i+" ");
        }
        System.out.println();
    }
    public void dispBinary(){// to display the binary representation of num
        StringBuffer ans= new StringBuffer();// storing the binary representation in a StringBuffer as ans
        int n=(int)num;
        while(n>0){// iteratively calculating the binary representation
            if(n%2==1) ans.append("1");// if as bit is odd the add '1'
            else ans.append("0"); // else add '0'
            n/=2;
        }
        ans.reverse(); // reverse the ans StringBuffer
        System.out.println(ans);// printing the final ans
    }
}
public class Question_3 {
    public static void main(String[] args){
        Number n=new Number(9);// crating an instance(object) of the Number class with num as 9
        System.out.println("Num is "+n.disp());// displaying the number
        // calling all the methods
        System.out.println("Calling isZero() method "+n.isZero());
        System.out.println("Calling isPositive() method "+n.isPositive());
        System.out.println("Calling isNegative() method "+n.isNegative());
        System.out.println("Calling isOdd() method "+n.isOdd());
        System.out.println("Calling isEven() method "+n.isEven());
        System.out.println("Calling isPrime() method "+n.isPrime());
        System.out.println("Calling isArmstrong() method "+n.isArmstrong());
        System.out.println("Calling getFactorial() method "+n.getFactorial());
        System.out.println("Calling getSqrt() method "+n.getSqrt());
        System.out.println("Calling getSqr() method "+n.getSqr());
        System.out.println("Calling sumDigits() method "+n.sumDigits());
        System.out.println("Calling getReverse() method "+(int)(n.getReverse()));
        System.out.println("Calling listFactor() method ");
        n.listFactors();
        System.out.println("Calling dispBinary() method ");
        n.dispBinary();

    }
}
