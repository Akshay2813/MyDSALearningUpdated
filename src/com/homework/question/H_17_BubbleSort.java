package com.homework.question;

import java.util.Arrays;

public class H_17_BubbleSort {
	
	public static void bubbleSort(int[] arr)
	{
		for(int round=1;round<arr.length;round++)
		{
		
			for(int j=0;j<arr.length-round;j++)
			{
				boolean swapped=false;
				if(arr[j]>arr[j+1])
				{
					swapped=true;
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				if(swapped==false)
					{
						break;
					}
			}
			
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = { 5, 4, 3, 2, 1 };
		System.out.println(Arrays.toString(arr));

		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));


	}

}