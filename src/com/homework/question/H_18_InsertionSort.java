package com.homework.question;

import java.util.Arrays;

public class H_18_InsertionSort {

	public static void mergeSort(int[] arr)
	{
		for(int round=1;round<arr.length;round++)
		{
			int val=arr[round];
			int j=round-1;
			for(;j>=0;j--)
			{
				if(arr[j]>val)
				{
					arr[j+1]=arr[j];
				}
			}
			arr[j+1]=val;
		
		}
	}
	
	public static void mergeSort_Bari(int[] arr)
	{
		for(int i=1;i<arr.length;i++)  //i >> round and i start from 1 as oth element (Omly one) 
			//assuemd as sorted
		{
			int value=arr[i];
			int j=i-1;
			while(j>-1 && arr[j]> value)  //if arr[j]> value then shift to next
			{
				arr[j+1]=arr[j];
				j--;
			}
			
			arr[j+1]=value;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 4, 3, 2, 1 };
		System.out.println(Arrays.toString(arr));

//		mergeSort(arr);
		mergeSort_Bari(arr);
		System.out.println(Arrays.toString(arr));
	}

}
