package DSA;
import java.util.Random;
import java.util.Scanner;
public class randomnumber 
{
	public static void main(String [] args)
	{
		
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt(8);
		Random r= new Random();
		System.out.println("Change the number  "+r.nextInt(x));
		
	}

}
