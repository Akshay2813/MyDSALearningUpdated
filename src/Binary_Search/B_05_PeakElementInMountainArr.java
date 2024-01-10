package Binary_Search;

public class B_05_PeakElementInMountainArr {
	
	public static int PeakElementInMountainArr(int[] arr)
	{
		int start=0;
		int end=arr.length-1;
		int mid = start + (end-start)/2;
		while(start < end)
		{
			if(arr[mid]<arr[mid+1])
			{
				//means our element present on line A
				start=mid+1;
				
			}
			else
			{
				//our element on line B or we are on peak element
				end=mid;
			}
			mid=start+(end-start)/2;
		}
			
		return mid;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,10,5,2};  
		//int[] arr = {0,10,11,12,15,5,2};  
//		int[] arr = {10,11,12,20};  
	//	int[] arr = {25,20,15,10,9};
		int peakElementIndex= PeakElementInMountainArr(arr);
		System.out.println("peak elelemt in given mountain array occur at index = "+peakElementIndex);
		System.out.println("peak elelemt in given mountain array is = "+arr[peakElementIndex]);
		
		
	}

}
