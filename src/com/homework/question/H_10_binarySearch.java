package com.homework.question;

public class H_10_binarySearch {
	
	//Condition : Arr is Sorted 
	
	public static int binarySearch(int[] arr, int target) 
	{
		int start=0;
		int end=arr.length-1;
		int mid= start+(end-start)/2;
		
		while(start<=end)
		{
			if(arr[mid]==target)
			{
				return mid;
			}
			
			if(arr[mid]<target)
			{
				start=mid+1;
			}
			else 
			{
				end=mid-1;
			}
			mid=start+(end-start)/2;
		}	
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {22,44,66,88,110};
		System.out.print(binarySearch(arr,88));
		
		
	}

}
