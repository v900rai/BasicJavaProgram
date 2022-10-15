package August;

public class Factors 
{
	public static void main(String []args)
	{
		/// factor 6=1,2,3,6
		int number=6;
		
		for(int i=1; i<=number; i++)
		{
			if(number%i==0)
			{
				System.out.print(i+" ");
			}
		}
	}

}
