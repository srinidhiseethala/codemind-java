import java.util.Scanner;
public class A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        System.out.print(N+" ");
        while(N!=1)
        {
            if(N%2==0)
            {
                N/=2;
            }
            else
            {
                N=3*N+1;
            }
            System.out.print(N+" ");
        }
    }
}