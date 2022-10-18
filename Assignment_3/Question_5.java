public class Question_5 {
    public static int MinWays(String str1,int n,String str2,int m)
    {
        if(n==0)return m;// if str1 is empty then answer is length of str2
        if(m==0)return n;// if str2 is empty then answer is length of str1
        if(str1.charAt(n-1)!=str2.charAt(m-1)){
            return 1+Math.min(Math.min(MinWays(str1,n-1,str2,m),//inserting in str1
                    MinWays(str1,n,str2,m-1)),// removing from str1
                    MinWays(str1,n-1,str2,m-1));// changing the element
        }
        else{
            return MinWays(str1,n-1,str2,m-1);
        }
    }
    public static void main(String[] args){
        String s1="abcdef",s2="axcdfdh";
        System.out.println("Min number of ways = "+MinWays(s1,s1.length(),s2,s2.length()));// finding the minimum number of ways
    }
}
