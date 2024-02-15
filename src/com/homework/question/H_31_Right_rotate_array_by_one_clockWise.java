package com.homework.question;

import java.util.Arrays;

public class H_31_Right_rotate_array_by_one_clockWise {

	public static void rotate(int arr[], int n)
    {
		int last_ele=arr[arr.length-1];
		for(int i=arr.length-1; i>0;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[0]=last_ele;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(arr));	
		// o/p: 5 1 2 3 4
		
		rotate(arr,arr.length);
		System.out.println(Arrays.toString(arr));

	}

}

