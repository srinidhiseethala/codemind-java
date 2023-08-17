import java.util.Scanner;
public class avg{
	public static void main(String[] args)
        {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int c=0;
		if(a%3==0)
		{
		    System.out.printf("Pling");
		    c++;
		}
		if(a%5==0)
		{
		    System.out.printf("Plang");
		    c++;
		}
		if(a%7==0)
		{
		    System.out.printf("Plong");
		    c++;
		}
		if(c==0)
		{
		    System.out.println(a);
		}
	}
}