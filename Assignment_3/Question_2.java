import java.util.Scanner;

public class Question_2 {
    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();// taking length of array as input
        int []arr=new int[n];
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();// taking array as input

        int[] count=new int[21];// creating a count array
        for(int i=0;i<=20;i++)count[i]=0;// initializing as 0
        for(int i=0;i<n;i++)count[arr[i]]++;
        for(int i=1;i<=20;i++)count[i]+=count[i-1];
        int[] ans=new int[n];// creating a answer array
        for(int i=n-1;i>=0;i--)
        {
            ans[count[arr[i]]-1]=arr[i];
            count[arr[i]]--;
        }
        // printing the answer array
        for(int i=0;i<n;i++)System.out.print(ans[i]+" ");
    }
}
