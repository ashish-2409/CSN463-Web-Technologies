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
    public boolean isPrime(){// checking if integral part of num is prime or not
        for(int i=2;i<(int)num;i++){
            if((int)num%i==0)return false; //if num is divisible by any number other than 1 and num then it is not prime
        }
        return true;
    }
    public boolean isArmstrong(){// Armstrong number is a number that is equal to the sum of cubes of its digits
        // checking if integral part of num is armstrong or not
        int n=(int)num,sum=0;
        while(n>0){
            int x=n%10;
            sum+=(x*x*x);// finding sum of cubes of its digits
            n=n/10;
        }
        return (sum==(int)num);// returning if num is armstrong
    }


    // functions with the double return type
    public double getFactorial(){
        double ans=1;
        for(int i=1;i<=(int)num;i++){
            ans=ans*i;// getting the factorial of integral part of num
        }
        return ans;
    }
    public double getSqrt(){
        int start = 0, end = (int)num;
        double ans=0;// to store the answer
        // now computing the integral part of the square root using binary search
        while (start <= end) {
            int mid = (start + end) / 2;
            if (mid * mid == num) {
                ans = mid;
                break;
            }
            if (mid * mid < num) {// if it is on right end
                start = mid + 1;
                ans = mid;
            }
            else {// if it is on left end
                end = mid - 1;
            }
        }
        // For computing the fractional part of square root upto given precision
        float inc = 0.1f;
        for (int i = 0; i < 2; i++) {
            while (ans * ans <= num) {
                ans += inc;
            }
            // loop runs til ans * ans <= number
            ans = ans - inc;
            inc= inc / 10;// adding the next fractional part
        }
        return ans;

    }
    public double getSqr(){
        return (num*num);// return the square of num
    }
    public double sumDigits(){// getting sum of num
        double ans=0;
        String s=String.valueOf(num);// converting to string
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='.')continue;// getting the sum except of the . in num
            ans+=(s.charAt(i)-'0');// getting the integer value of the character
        }
        return ans;
    }
    public double getReverse(){// using strings to reverse the double num
        String s = String.valueOf(num);// converting double to string
        String reversed = new StringBuffer(s).reverse().toString();// reversing string
        return Double.parseDouble(reversed);// converting reversed string back to double
    }

    // methods with void return type
    public void listFactors(){// to print all the factors of integral part of num
        for(int i=1;i<=((int)num);i++){
            if((int)num%i==0)// if i is a factor of num print it
            {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public void dispBinary(){// to display the binary representation of num
        StringBuffer ans = new StringBuffer();
        // taking the integral part of decimal number
        int Integral = (int)num;
        // taking the fractional part decimal number
        double fractional = num - Integral;
        // converting the integral part to binary
        while (Integral>0)
        {
            if(Integral%2==0)
            ans.append('0');
            else
              ans.append('1');
            Integral /= 2;
        }
        // Reverse string to get original binary
        ans.reverse();
        // Append point before conversion of fractional part
        ans.append('.');
        // Conversion of fractional part to binary equivalent
        // for fractional part we keep multiplying the fraction part and the depending upon the integral part of it
        //we append either 0 or 1 to it
        for(int i=0;i<5;i++)// upto 5 decimal places
        {
            // Find next bit in fraction
            fractional *= 2;
            int fract_bit = (int)fractional;
            if (fract_bit == 1)
            {
                fractional -= fract_bit;
                ans.append('1');
            }
            else
                ans.append('0');
        }
        System.out.println(ans);
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
        System.out.println("Calling getReverse() method "+n.getReverse());
        System.out.println("Calling listFactor() method ");
        n.listFactors();
        System.out.println("Calling dispBinary() method ");
        n.dispBinary();

    }
}
