package com.homework.question;

public class H_12_pivotElement {
	
	public static int pivotElementInArr(int[] arr)
	{
		int start=0;
		int end=arr.length-1;
		int mid=start+(end-start)/2;
		
		while(start<end)
		{
			if(arr[mid]>arr[mid+1])
			{
				return mid;
				
			}
			if(arr[mid-1]>arr[mid])
			{
				return mid-1;
			}
			
			if(arr[start]>arr[mid])
			{
				end=mid-1;
			}
			else
			{
				start=mid;
			}
			mid=start+(end-start)/2;
		}

		return start;
	}

	public static void main(String[] args) {
		int[] arr = {9,10,2,4,6,8};
		
		int i = pivotElementInArr(arr);
		System.out.print(arr[i]);
	}

}
