package August;

public class FactorToCount 
{
	public static void main(String []args)
	{
		int num=4;
		int count =0;
		for(int i=1; i<=num; i++)
		{
			if(num%i==0)
			{
				count++;
			}
	
		}
		System.out.println(count);
	}

}
