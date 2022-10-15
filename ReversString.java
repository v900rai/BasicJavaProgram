package August;

public class ReversString 
{
	public static void main(String []args)
	{
		String str="vishal";
		String rev="";
		System.out.println("Enter the number");
		for(int i=str.length()-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);
			
		}
		System.out.println(rev);
	}

}
