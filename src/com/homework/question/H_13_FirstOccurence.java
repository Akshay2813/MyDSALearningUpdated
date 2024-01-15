package com.homework.question;

public class H_13_FirstOccurence {
	
	public static int firstOccur(int[] arr, int target)
	{
		int ans=-1;
		int start=0;
		int end=arr.length-1;
		int mid = start+(end-start)/2;
		
		
		while(start<=end)
		{
			if(arr[mid]==target)
			{
				ans=mid;
				end=mid-1;
			}
			else if(arr[mid]<target)
			{
				start=mid+1;
			}
			else
			{
				end=mid-1;
			}
			mid = start+(end-start)/2;
				
		}		
		return ans;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,2,2,2,3,3,4,5,5,5};
		int i =firstOccur(arr,1);
		System.out.print(i);
	} 

}
