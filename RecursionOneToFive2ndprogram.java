
public class RecursionOneToFive2ndprogram 
{
	public static void printNumbrOneToFive(int n) {
		if(n==6) {
			return;// base case
		}
		System.out.println(n);// print
		printNumbrOneToFive(n+1);// recursive or recursion both are same
	}
	public static void main(String [] args)
	{
		int n=1;
		printNumbrOneToFive(n);
	}

}
