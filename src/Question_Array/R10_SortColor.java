package Question_Array;

public class R10_SortColor {
	
	//0 Red 1 White 2 Red
	
	public static void sortColor_012(int[] arr)
	{
		
		//arr = {2,0,2,1,1,0}
		
		//arr = {1,0,2,1,1,0}
		int low = 0;
		int medium = 0;
		int high = arr.length-1;
		
		while(medium<high)
		{
			if(arr[medium]==0)
			{
				int temp = arr[low];
				arr[low]=arr[medium];
				arr[medium]=temp;
				medium++;
				low++;
			}
			else if(arr[medium]==1)
			{
				medium++;
			}
			else if(arr[medium]==2)
			{
				int temp = arr[high];
				arr[high]=arr[medium];
				arr[medium]=temp;
				high--;
			}
		}
		
		
		
	}

	public static void main(String[] args) {
		
		int[] arr = {2,2,2,1,1,1,0,0,0,0,2,2,2,2,2,0,2,1,1,0};
		
		sortColor_012(arr);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
		

	}

}
