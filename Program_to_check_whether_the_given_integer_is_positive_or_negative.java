import java.util.Scanner;
public class c{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>0)
        {
            System.out.println("Positive Number");
        }
        else if(a<0)
        {
            System.out.println("Negative Number");
        }
    }
} 