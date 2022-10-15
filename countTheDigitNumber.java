package August;

public class countTheDigitNumber 
{
	public static void main(String []args)
	{
		int num=456;
		int count=0;
		for(int i=1; i<num; i++)
		{
			int rem=num%10;
			count++;
			num=num/10;
		}
		System.out.println(count);
	}

}
