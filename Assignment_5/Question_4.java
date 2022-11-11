public class Question_4 {
    static int a = 20;
    Question_4() {
        a++;
    }
    void m1() {
        a++;
        System.out.println(a);
    }
    public static void main(String[] args)
    {
        Question_4 obj = new Question_4();
        Question_4 obj2 = new Question_4();
        Question_4 obj3 = new Question_4();
        obj3.m1();
    }
}
// the code will compile fine
// Output : 24
// here as 'a' is static variable, only one copy of it will be shared by all the objects of that class
// now, when the class loads 'a' will get initialized to 20
// now as 3 objects are created, 'a' will get incremented 3 times due to the constructor
// 'a' variable will finally be updated once more due to the call to m1 method
// hence 'a' finally becomes 24