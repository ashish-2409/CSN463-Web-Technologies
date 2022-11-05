class Employee{
    // declaring all the variables required for each employee
    String name;
    int yearOfJoining;
    int salary;
    String address;

    // constructor to initialize the object with the given values
    Employee(String name,int yearOfJoining,int salary,String address){
        this.name=name;
        this.yearOfJoining=yearOfJoining;
        this.salary=salary;
        this.address=address;
    }

    // function to print the details for the object
    public void printDetails(){
        System.out.println(name+"   "+yearOfJoining+"    "+salary+"    "+address);
    }
}
public class Question_2 {
    public static void main(String[] args){
        // crating 3 objects of the Employee class with the given values
        Employee employee1=new Employee("Robert",1994,100000,"64C-WallsStreet");
        Employee employee2=new Employee("Sam",2000,200000,"68D-WallsStreet");
        Employee employee3=new Employee("John",1999,300000,"26B-WallsStreet");

        System.out.println("Name     Year of joining    Salary    Address");// printing the header
        // calling the function to print details for each employee object
        employee1.printDetails();
        employee2.printDetails();
        employee3.printDetails();
    }
}
