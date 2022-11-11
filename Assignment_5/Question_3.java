import java.util.*;
class Marks{
    protected int rollNumber;// stores the roll number
    protected String name;// stores the name of each student
    protected int[] marks;// stores the marks of each student for each subject

    void addMarks(String name,int numOfTest,int rollNumber){
        marks=new int[numOfTest];// sets size of marks as the number of test/count of marks
        for(int i=0;i<numOfTest;i++){
            // this part can be used to manually enter the marks of each student
//            Scanner sc=new Scanner(System.in);
//            marks[i]=sc.nextInt();

            // this will randomly set the marks in each test for the student
            marks[i]=(int)(Math.random()*10);
        }
        this.name=name;
        this.rollNumber=rollNumber;
    }
    int getMarks(){// gets the sum of marks in the given subject
        int sum=0;
        for(int i:marks){
            sum+=i;
        }
        return sum;
    }
    void changeMarks(int newMarks,int test){// used to change the marks of a given student in a subject
        marks[test]=newMarks;// changing the marks in 'test' to newMarks
    }
    void printDetails(){// prints the details of the student
        System.out.println("Name= "+name+", Roll number= "+rollNumber+" "+", Total marks in "+this.getClass().getName()+" are= "+getMarks());
    }
}
// Physics,Chemistry and Mathematics classes inherit the Marks class and represent
// the marks of individual student in the respective subject
class Physics extends Marks{

}
class Chemistry extends Marks{

}
class Mathematics extends Marks{

}
public class Question_3 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of students:");
        // here 'numOfStudents' is the number of students
        int numOfStudents=sc.nextInt();// taking the number of students input from the user

        // creating 3 vectors to store details of individual student for each subject
        Vector<Chemistry> chem= new Vector<>(numOfStudents);
        Vector<Mathematics> math= new Vector<>(numOfStudents);
        Vector<Physics> phy= new Vector<>(numOfStudents);

        for(int i=0;i<numOfStudents;i++){
            System.out.println("Enter the name of the student "+(i+1)+":");
            String name=sc.next();
            // adding the marks
            chem.addElement(new Chemistry());
            phy.addElement(new Physics());
            math.addElement(new Mathematics());
            // assuming 5 tests and then initializing them
            chem.elementAt(i).addMarks(name,5,(i+1));
            math.elementAt(i).addMarks(name,5,(i+1));
            phy.elementAt(i).addMarks(name,5,(i+1));
        }
        //printing the total marks of each student in each subject
        System.out.println("------------Total marks of each student tn each subject------------\n");
        for(int i=0;i<numOfStudents;i++){
            chem.elementAt(i).printDetails();
            phy.elementAt(i).printDetails();
            math.elementAt(i).printDetails();
        }
        System.out.println("--------------------------------------------------------------------\n");

        //printing the average marks of the class in each student by calculating the total marks in each subject
        //and then dividing it by the number of students
        double totalMarksChem=0,totalMarksPhy=0,totalMarksMaths=0;
        for(int i=0;i<numOfStudents;i++){
            totalMarksPhy+=phy.elementAt(i).getMarks();
            totalMarksChem+=chem.elementAt(i).getMarks();
            totalMarksMaths+=math.elementAt(i).getMarks();
        }

        System.out.println("-------------Average marks of class in  each subject----------------\n");
        System.out.println("Average marks of the class in Chemistry = "+(totalMarksChem/numOfStudents));
        System.out.println("Average marks of the class in Mathematics = "+(totalMarksMaths/numOfStudents));
        System.out.println("Average marks of the class in Physics = "+(totalMarksPhy/numOfStudents));

        System.out.println("--------------------------------------------------------------------\n");


    }
}
