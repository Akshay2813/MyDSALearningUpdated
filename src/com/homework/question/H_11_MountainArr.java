package com.homework.question;

public class H_11_MountainArr {
	
	/*         14
	        12    9 
	      11        8 
		10           7
	 */
	
	public static int mountainArrElement(int[] arr)
	{
		int start=0;
		int end=arr.length-1;
		int mid= start+(end-start)/2;
		
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
			mid=start+(end-start)/2;
		}
		return start;
	}
	public static void main(String[] args)
	{
//		int[] arr = {0,10,5,2};
		int[] arr= {10,11,12,13,14,9,8,7};
		int i = mountainArrElement(arr);
		
		System.out.print(arr[i]);
	}

}
