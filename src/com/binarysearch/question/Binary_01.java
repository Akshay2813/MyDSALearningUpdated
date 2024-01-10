package com.binarysearch.question;

public class Binary_01 {
 
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
			else if(arr[mid]> target)
			{
				end=mid-1;
			}
			else
			{
				start=mid+1;
			}
			mid=start+(end-start)/2;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int[] arr=  {10, 20, 30 , 40, 50};
		int target=50;
		System.out.print("Target element found at index= " + binarySearch(arr,target) );
		
		

	}

}
