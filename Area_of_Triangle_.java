import java.util.Scanner;
public class Area{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double a,b,c,s,A;
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        s=(a+b+c)/2;
        A=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",A);
    }
}