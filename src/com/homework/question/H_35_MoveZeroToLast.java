package com.homework.question;

import java.util.Arrays;

public class H_35_MoveZeroToLast {
	
	public static void moveZeroToLast_BruteForce_I(int[] arr)
	{
		//IUsing extra arr
		int[] temp = new int[arr.length];
	
		for(int i=0, j=0; i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				temp[j]=arr[i];
				j++;
			}
		}
		System.out.print(Arrays.toString(temp));
	}
	
	public static void moveZeroToLast_BruteForce_II(int[] arr)
	{
		int start=0;
		int end=arr.length-1;
		while(start<=end)
		{
			if(arr[start]==0)
			{
				int temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
				end--;
			}
			else
			{
				start++;
			}
		}
		System.out.print(Arrays.toString(arr));
	}
	
	public static void moveZeroToLast_Optimal(int[] arr)
	{
		int j=-1;
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				j=i;
				break;
			}
		}
		
		for(int i=j+1; i<arr.length;i++)
		{
			if(arr[i] !=0)
			{
				//swap
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
			}
		}
		System.out.print(Arrays.toString(arr));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr  = {1,2,0,3,0,5};
//		moveZeroToLast_BruteForce_I(arr);
//		moveZeroToLast_BruteForce_II(arr); //index not maintaing
		
		moveZeroToLast_Optimal(arr);// index maintained

	}

}
