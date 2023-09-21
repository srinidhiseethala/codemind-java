import java.util.*;
public class StringDigit
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        while(n!=0)
        {
            String s=sc.nextLine();
            // String d="0123456789";
            int flag=0;
            for(int i=0;i<s.length();i++)
            {
               
                if(s.charAt(i)>=47 && s.charAt(i)<=58)
                {
                    System.out.println("Yes");
                    flag=1;
                    break;
                }
                
            }
            if(flag==0)
            {
                System.out.println("No");
            }
            n--;
        }
    }
}