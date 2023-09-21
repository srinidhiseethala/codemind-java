import java.util.*;
public class Concatenate
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        String c=a+b;
        char[] arr=c.toCharArray();
        Arrays.sort(arr);
        String p=new String(arr);
        System.out.println(p);
    }
    
}