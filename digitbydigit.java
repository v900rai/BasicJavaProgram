package August;

public class digitbydigit 
{
	public static void main(String []args)
	{
		int num=425;
		while(num>0)
		{
			int rem=num%10;
			System.out.println(rem);
			num=num/10;
		}
	}

}
