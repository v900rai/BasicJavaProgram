package August;

public class Stringcountcommancharter 
{
	public static void main(String []args)
	{
		String str="ramram";
		int count =0;
		for(int i=0; i<str.length(); i++)
		{
			if(str.length() !='a')
			{
				continue;
			}
			count++;		
		}
		System.out.print(count);
	}

}
 