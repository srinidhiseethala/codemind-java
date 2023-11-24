import java.util.*;
public class MissingNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n-1;i++)
        {
            arr[i]=sc.nextInt();
        }
        int a=(n*(n+1))/2;
        int b=0;
        for(int j:arr)
        {
            b+=j;
        }
        System.out.println(a-b);
    }
}