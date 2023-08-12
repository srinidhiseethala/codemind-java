import java.util.Scanner;
public class Avg{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double a,b;
        double c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=(a+b)/2;
        System.out.printf("%.4f",c);
    }
}