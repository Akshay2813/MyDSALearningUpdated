package Binary_Search;

public class MountainArr {
	
	public static int peakElementinMountainArr(int[] arr)
	{
		
		/*
		 	10 
		  		5
		  0			2
		 */ 
		int start=0;
		int end=arr.length-1;
		int mid=start+(end-start)/2;
		while(start<end)
		{
			if(arr[mid]<arr[mid+1])
			{
				start=mid+1;
			}
			else
			{
				end=mid;
			}
		}
		return arr[mid];
		
	}

	public static void main(String[] args)
	{
		//Mountain array
		int[] arr = {0,10,15,5,2};
		
		System.out.print("Peak Element in Arr is = " + peakElementinMountainArr(arr));
		
	}
}
