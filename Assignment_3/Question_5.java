import java.util.ArrayList;
import static java.lang.Math.*;

public class Question_5 {
    static int dp[][];// global dp matrix
    static int count=1;// counter to know number of ways of converting s1 to s2
    static void printAllChanges(String s1,String s2, ArrayList<String> changes)
    {
        int i = s1.length(), j = s2.length();
        // Iterate till end of strings
        while (true) {
            if (i == 0 || j == 0) {// end of one or both strings
                // print the current way
                printChange(changes);
                break;
            }
            // If both characters are same
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                i--;j--;
            }
            else {// do all the three operations
                boolean f1 = false, f2 = false;
                // 1. Replace
                if (dp[i][j] == dp[i - 1][j - 1] + 1) {
                    // Add this step to out current list
                    changes.add("Change " + s1.charAt(i - 1)+ " to " + s2.charAt(j - 1));
                    i--;j--;
                    // note whether this 'if' was true.
                    f1 = true;
                }
                // 2. Delete
                if (dp[i][j] == dp[i - 1][j] + 1) {
                    if (f1 == false) {
                        changes.add("Delete " + s1.charAt(i - 1));
                        i--;
                    }
                    else {
                        // If the previous method was true, create a new list as a copy of previous.
                        ArrayList<String> changes2 = new ArrayList<String>();
                        changes2.addAll(changes);
                        // Remove last operation
                        changes2.remove(changes.size() - 1);
                        // Add this new operation
                        changes2.add("Delete " + s1.charAt(i));
                        // initiate new instance of this
                        // function with remaining substrings
                        printAllChanges(s1.substring(0, i),s2.substring(0, j + 1), changes2);
                    }
                    f2 = true;
                }
                //3. insert
                if (dp[i][j] == dp[i][j - 1] + 1) {
                    if (f1 == false && f2 == false) {
                        changes.add("Add " + s2.charAt(j - 1));
                        j--;
                    }
                    else {
                        // Add steps
                        ArrayList<String> changes2 = new ArrayList<String>();
                        changes2.addAll(changes);
                        changes2.remove(changes.size() - 1);
                        changes2.add("Add " + s2.charAt(j));
                        // Recursively call for the next steps
                        printAllChanges(s1.substring(0, i + 1),s2.substring(0, j), changes2);
                    }
                }
            }
        }
    }

    private static void printChange(ArrayList<String> changes) {// printing a change
        System.out.println("\nMethod " + count + " : \n");
        for (String s : changes) {
            System.out.println(s);
        }
        count++;
    }

    // function to get minimum number of ways to convert s1 to s2
    public static void getMinWays(String a,int n,String b,int m)
    {
        int[][] temp=new int[n+1][m+1];// creating a dp matrix
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=m;j++)
            {
                if(i==0){
                    temp[i][j]=j; // base case if length of a=0
                }
                else if(j==0)temp[i][j]=i;// base case if length of b=0
                else if(a.charAt(i-1)==b.charAt(j-1)) // if both characters are same
                {
                    temp[i][j]=temp[i-1][j-1];
                }
                else{
                    temp[i][j]= min(temp[i-1][j], min(temp[i][j-1],temp[i-1][j-1]))+1;// else find minimum of all 3 operations i.e., replace,insert and remove
                }
            }
        }
        dp=temp;// initialize global dp matrix with the local none
    }
    public static void main(String[] args){
        String s1="abcdef",s2="axcdfdh";
        getMinWays(s1,s1.length(),s2,s2.length());// calling function to get the minimum number of moves required to convert s1 to s2 using dynamic programming
        printAllChanges(s1, s2, new ArrayList<String>());// function to print all changes, here arraylist is a data structure to store all changes in the form of a list
    }
}
