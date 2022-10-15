package August;

public class largestNumberCheckInArray
{
	public static void main(String []args)
	{
		int[] arr=new int[] {1,5,8,9,4,8,944,55};
		int max=arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println("Largest element present in given array: "+max);
	}

}
