public class Question_5
{
    final static int x;

    static {
        x = 10;
    }
    public static void main(String[] args) {
        System.out.println(x);
    }
}
// output: 10
// x is declared as final and static which means that it can be initialized only once
// now when the class loads the static block initializes the x variable to 10
// the main method then prints the x variable which has value 10