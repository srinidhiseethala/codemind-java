import java.util.Scanner;
public class asc{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char ch;
        ch=sc.next().charAt(0);
        int v = ch;
        System.out.printf("%d",v);
    }
}