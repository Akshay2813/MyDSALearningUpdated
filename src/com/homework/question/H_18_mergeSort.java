package com.homework.question;

import java.util.Arrays;

public class H_18_mergeSort {

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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 4, 3, 2, 1 };
		System.out.println(Arrays.toString(arr));

		mergeSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
