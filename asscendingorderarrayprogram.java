package August;

public class asscendingorderarrayprogram 
{
	public static void main(String[] args)
	{
		int[] arr=new int[] {76,88,90,55,22,11};
		int temp=0;
		System.out.println("element the orijanal array");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]+" ");
		}
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}		
			}
		}
		System.out.println();
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]+" ");
		}
	}

}
