public class Question_3 {
    public static void main(String[] args){
        //3. to compute quotient and remainder and print it.
        //remainder is calculated using modulo operator
        int dividend=102, divisor=5;
        System.out.println("dividend is: "+dividend+" divisor is: "+divisor);
        int quotient=dividend/divisor;
        int remainder=dividend%divisor;// using modulo operator
        System.out.println("quotient is: "+quotient);
        System.out.println("remainder is: "+remainder);
    }
}
