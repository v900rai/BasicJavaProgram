package NumberProgram;
import java.util.Scanner;
public class revr 
{
	public static void main(String[] args )
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		String str=sc.nextLine();
		String rev=" ";
		for(int i=str.length()-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		
	}

}
