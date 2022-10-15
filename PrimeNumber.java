package August;

public class PrimeNumber 
{
	public static void main(String []args)
	{
		int num=6;
		int count =0;
		for(int i=1; i<num; i++)
		{
			if(num%1==0)
			{
				count++;
				
			}
			
		}
		if(count==2)
		{
			System.out.println(num+"it is prime number");
			
		}
		else
		{
			System.out.println(num+"it is not prinm number");
		}
	}

}
