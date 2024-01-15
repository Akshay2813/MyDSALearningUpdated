package com.homework.question;

public class H_15_BSearch_NearlySortedArr {
	
	public static int bSearchInNearlySortedArr(int[] arr,int target)
	{
		int start=0;
		int end=arr.length-1;
		int mid= start+(end-start)/2;
		
		while(start<=end)
		{
			if(arr[mid]== target)
			{
				return mid;
			}
			if(arr[mid+1]==target)
			{
				return mid+1;
			}
			if(arr[mid-1]==target)
			{
				return mid-1;
			}
			if(arr[mid]<target)
			{
				start=mid+2;  //this Twist
			}
			else
			{
				end=mid-2;  //this Twist
			}
			mid=start+(end-start)/2;
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10,3,40,20,50,80,70};
		
		
		int i = bSearchInNearlySortedArr(arr,80);
		
		System.out.print(i);
		// 3 10 20 40 50 70 80  //target= 40 occure at index i then 
		//in nrealy soted sorted arr it should occutn at i-1 or i or i+1 index

	}

}
