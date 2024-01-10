package demo;

public class sortZeroOne {
	
	public static void sort012(int[] arr)
	{
		int start=0;
		int medium=0;
		int end=arr.length-1;
		
		while(medium<=end)
		{
			if(arr[medium]==0)
			{
				//swap start and medium
				int temp=arr[start];
				arr[start]=arr[medium];
				arr[medium]=temp;
				start++;
				medium++;
			}
			
			else if( arr[medium]==1)
			{
				medium++;
			}
			
			else if( arr[medium]==2)
			{
				//swap medium and end
				int temp=arr[end];
				arr[end]=arr[medium];
				arr[medium]=temp;
				end--;
			}
		}
	
	}

	public static void main(String[] args) {
		int[] arr = {2,2,2,1,1,1,0,0,0,0,2,2,2,2,2,0,2,1,1,0};
		
		sort012(arr);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		

	}

}
