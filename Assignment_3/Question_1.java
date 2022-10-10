public class Question_1 {
    public  static void main(String[] args)
    {
        String str1="ab";
        String str2="ab";
        int ans=0;
        for(int i=0;i<Math.min(str2.length(),str1.length());i++)// iterating over length of smaller string
        {
            if(str1.charAt(i)>str2.charAt(i))// if str1 is smaller
            {
                ans=(str1.charAt(i)-str2.charAt(i));
                break;
            }
            if(str1.charAt(i)<str2.charAt(i))// if str2 is smaller
            {
                ans=str1.charAt(i)-str2.charAt(i);
                break;
            }
        }
        // this part checks whether length of strings is unequal
        if(ans==0)
        {
            if(str1.length()>str2.length())ans=str1.length()-str2.length();
            else if(str1.length()<str2.length())ans=str1.length()-str2.length();
        }
        System.out.println("answer when str1 is compared with str2 is: "+ans);
    }
}
