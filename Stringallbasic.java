package August;
import java.util.Scanner;
public class Stringallbasic 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int x=sc.nextInt();
		System.out.println("x="+x);
		System.out.println();
		System.out.println("Enter the double value");
		double y=sc.nextDouble();
		System.out.println(y);
		System.out.println();
		System.out.println("Enter the boolean");
		boolean f=sc.nextBoolean();
		System.out.println(f);
		System.out.println();
		System.out.println("enter the char value");
		char ch=sc.next().charAt(0);
		System.out.println("char="+ch);
		
	}

}
