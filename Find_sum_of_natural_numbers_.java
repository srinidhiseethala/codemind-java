import java.util.Scanner;
public class S{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int s,n;
        n=sc.nextInt();
        s=(n*(n+1))/2;
        System.out.println(s);
    }
}