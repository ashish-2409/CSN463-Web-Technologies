import java.util.Scanner;

// the Customer class contains information about each customer
class Customer{
    protected String firstName;
    protected String lastName;
    protected String address;
    protected int age;
    protected char gender;
    Customer(String firstName,String lastName,String address,int age,char gender){// constructor to initialize the customer object
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.address=address;
        this.gender=gender;
    }
}
// the Account class extends the Customer class and contains information about each account
class Account extends  Customer {
    protected int accountNumber;
    protected String bank;
    protected double balance;

    // the Account constructor creates a new account for a customer
    Account(String firstName, String lastName, String address, int age, char gender, String bank) {
        super(firstName, lastName, address, age, gender);// calls the parent(Customer's) constructor to initialize it
        // depending on the bank, the account number, balance and other details are set
        switch (bank) {
            case "SBI": {
                accountNumber=(++SBI.activeAccounts);
                balance=SBI.minBalanceAllowed;
                break;
            }
            case "ICIC": {
                accountNumber=(++ICICI.activeAccounts);
                balance=ICICI.minBalanceAllowed;
                break;
            }
            case "PNB": {
                accountNumber=(++PNB.activeAccounts);
                balance=PNB.minBalanceAllowed;
                break;
            }
        }
        this.bank = bank;
    }

    // function to print details of an account of a customer
    public void printDetails(){
        System.out.println("------------------------------------");
        System.out.println("Name= "+firstName+" "+lastName);
        System.out.println("Age= "+age);
        System.out.println("Gender= "+ gender);
        System.out.println("Address= "+address);
        System.out.println("Bank= "+bank);
        System.out.println("Account number= "+accountNumber);
        System.out.println("Balance= "+balance);
        System.out.println("------------------------------------\n");

    }

    // function to deposit amount to the account
    public void deposit(double amount) {
        balance += amount;
    }

    // function to withdraw amount from the account
    public void withdraw(double amount, double minbalanceallowed) {
        if (balance - amount >= minbalanceallowed)// if after withdrawing the amount balance is more than min balance which is needed then perform the withdraw
            balance -= amount;
        else {// else print and error
            System.out.println("invalid operation as minimum balance of the account has to be maintained which is "+minbalanceallowed);
        }

    }
}


// base class RBI
class RBI{
    protected static double minInterestRate;
    protected static double minBalanceAllowed;
    protected static double maxWithdrawalLimit;
    RBI(){
        // assuming standard values set by RBI
        minInterestRate=4;
        minBalanceAllowed=2000;
        maxWithdrawalLimit=100000;
    }

}
class SBI extends RBI{
    public static double sbiInterestRate=3.5+minInterestRate;// interest rate set by SBI
    public static int activeAccounts=0;// to store the number of active accounts which is used to get next free account number
    public static void deposit(Account account, double amount){
        account.deposit(amount);
    }

    // withdraw amount has to be less than the maximum allowed amount
    public static void withdraw(Account account, double amount){
        if(amount < maxWithdrawalLimit)
            account.withdraw(amount, SBI.minBalanceAllowed);
        else
        {
            System.out.println("invalid operation as maximum amount which can be withdrawn is "+maxWithdrawalLimit );
        }
    }

}
class ICICI extends RBI{
    public static double iciciInterestRate=3.0+minInterestRate;// interest rate set by ICICI
    public static int activeAccounts=0;// to store the number of active accounts which is used to get next free account number
    public  static void deposit(Account account, double amount){
        account.deposit(amount);
    }
    // withdraw amount has to be less than the maximum allowed amount
    public static void withdraw(Account account, double amount){
        if(amount < maxWithdrawalLimit)
            account.withdraw(amount, ICICI.minBalanceAllowed);
        else
        {
            System.out.println("invalid operation as maximum amount which can be withdrawn is "+maxWithdrawalLimit );
        }
    }

}
class PNB extends  RBI{
    public static double pnbInterestRate=2.5+minInterestRate;// interest rate set by PNB
    public static int activeAccounts=0;// to store the number of active accounts which is used to get next free account number
    public static  void deposit(Account account, double amount){
        account.deposit(amount);
    }
    // withdraw amount has to be less than the maximum allowed amount
    public static void withdraw(Account account, double amount){
        if(amount < maxWithdrawalLimit)
            account.withdraw(amount, PNB.minBalanceAllowed);
        else
        {
            System.out.println("invalid operation as maximum amount which can be withdrawn is "+maxWithdrawalLimit );
        }
    }

}
public class Question_2 {
    public static void main(String[] args){
        RBI rbi=new RBI();// creating object of RBI base class to initialize the variables such as interest, balance etc.
        // creating a demo account
        Account account = new Account("John", "Doe", "Delhi", 25, 'M', "SBI");

        // the below commented code be used to create an account by taking information manually form the user

        /*

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first name of the user: ");
        String firstName=sc.next();

        System.out.println("Enter the last name of the user: ");
        String lastName=sc.next();

        System.out.println("Enter the address of the user: ");
        String address=sc.next();

        System.out.println("Enter the age of the user: ");
        int age=sc.nextInt();

        System.out.println("Enter the gender of the user such as M/F: ");
        char gender=(sc.next().charAt(0));

        System.out.println("Enter the desired bank for the account: ");
        String bank=sc.next();

        Account acc=new Account(firstName,lastName,address,age,gender,bank);
        acc.printDetails();

        */


        // printing the account
        account.printDetails();

        // depositing some amount in it
        account.deposit(10000);
        account.printDetails();

        // trying to withdraw some amount from it
        SBI.withdraw(account,100);
        account.printDetails();
    }
}
