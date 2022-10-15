package August;
import java.util.Scanner;
public class printThe 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0; i<size; i++)
		{
			System.out.println("enter the element");
			arr[i]=sc.nextInt();
		}
		System.out.println();
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]+" ,");
		}
		
		
	}

}
