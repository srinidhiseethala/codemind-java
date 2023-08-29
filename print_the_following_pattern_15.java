import java.util.Scanner;
public class CharPat
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<n;i++)
    {
        for(int j=1;j<=n-i;j++)
        {
            System.out.print((char)(64+n-i)+" ");
        }
        System.out.println();
    }
    }
}