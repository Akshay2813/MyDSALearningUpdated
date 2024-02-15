package com.homework.question;

import java.util.Arrays;

public class H_17_BubbleSort {
	
	public static void bubbleSort(int[] arr)   // {9,10,5}
	{
		for(int round=1;round<arr.length;round++)  // 1 2
		{
			boolean swapped=false;
			for(int j=0;j<arr.length-round;j++) //round=1 j=0,1  round=2 j=0
			{
				
				if(arr[j]>arr[j+1])
				{
					swapped=true;
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
				System.out.println(Arrays.toString(arr));
			}
			if(swapped==false)
			{
				break;
			}
			
			
		}
	}
	
	public static void bubbleSort_Bari(int[] arr)
	{
		boolean flagSwapped; // this will false if no sewapping happens that list is already sorted
		for(int round=0; round<arr.length-1;round++)
		{
			flagSwapped=false;
			for(int j=0;j<arr.length-1-round;j++) //j >>comparsion
			{
				if(arr[j]>arr[j+1])
				{
					//swap
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flagSwapped=true;
				}
			}
			if(flagSwapped=false)
			{
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] arr = { 5, 4, 3, 2, 1 };
		int[]arr = {9,10,5};
//		System.out.println(Arrays.toString(arr));

		bubbleSort(arr);
		bubbleSort_Bari(arr);
//		System.out.println(Arrays.toString(arr));


	}

}
