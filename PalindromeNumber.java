package August;

public class PalindromeNumber 
{
	public static void main(String []args)
	{
		int num=454;
		int temp=num;
		int rev=0;
		while(num>0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;	
		}
		if(temp==rev)
		{
			System.out.println(temp+" is a palindrome number");
		}
		else
		{
			System.out.println(temp+"is a not palindrome number");
		}
	}

}
