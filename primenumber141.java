package August;
import java.util.Scanner;

public class primenumber141 
{
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number =sc.nextInt();
		int count=0;
		System.out.println("enter the number");
		for(int i=10; i<=number; i++)
		{
			if(number%2==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("it prime number");
		}
		else
		{
			System.out.println("it is not prinme number");
		}
	}
	}


