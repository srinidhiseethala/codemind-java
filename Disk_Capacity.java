import java.util.Scanner;
public class disk{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t,s,b,D;
        t=sc.nextInt();
        s=sc.nextInt();
        b=sc.nextInt();
        D=t*s*b*512*2;
        System.out.println(D);
    }
}