package August;

public class duplicatefindarray 
{
	public static void main(String []args)
	{
		int[] arr=new int [] {1,1,2,4,4,4,5,5,6,7,8};
		System.out.println("Print the array ");
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]+" ");
				}
			}
		}
	}

}
