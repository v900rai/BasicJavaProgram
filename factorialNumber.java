package August;
import java.util.Scanner;
public class factorialNumber 
{
	public static int  factorial(int number)
	{
		int res=1;
		while(number!=1)
		{
			res=number*res;
			number--;
			
		}
		return res;
	}
	public static void main(String []args)
	{
		System.out.println("print the number");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int r=factorial(number);
		System.out.println(r);
	}

}
