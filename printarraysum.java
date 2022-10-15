package August;

public class printarraysum
{
	public static void main(String[] args)
	{
		int[] arr=new int[] {1,2,3,4,5,6,7};
		int sum=0;
		System.out.println("print the orizanal number");
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				sum=sum+arr[i];
			}
		}
		System.out.println(sum+"");
	}

}
