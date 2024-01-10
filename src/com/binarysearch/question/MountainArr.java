package com.binarysearch.question;

public class MountainArr {
	
	public static int peakElementinMountainArr(int[] arr)
	{
		int start=0;
		int end=arr.length-1;
		int mid=start + (end-start)/2;
		/*
		 	10 
		  		5
		  0			2
		 */ 
		while(start<end)
		{
			
			if(arr[mid]<arr[mid+1])
			{
				//means we are on line A and our peak is one right side so we have to move right
				start=mid+1;
				
			}
			else
			{
				//means we are on line B and our peak is one Left side so we have to move Left 
				//but we have to take care that we should not go back on line
				end=mid;

			}
			mid=start+(end-start)/2;
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
