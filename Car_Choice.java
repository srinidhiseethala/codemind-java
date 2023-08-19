import java.util.Scanner;
public class A{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int x1=sc.nextInt();
            int x2=sc.nextInt();
            int y1=sc.nextInt();
            int y2=sc.nextInt();
            if((float)y1/x1 < (float)y2/x2)
            {
                System.out.println("-1");
            }
            else if((float)y1/x1== (float)y2/x2)
            {
                System.out.println("0");
            }
            else
            {
                System.out.println("1");
            }
        }
    }
}