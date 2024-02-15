package com.homework.question;

import java.util.Arrays;

public class H_34_Left_rotate_array_by_K_place {

	public static void left_Rotate_by_One_Place(int arr[], int n) {
		int first_ele = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[arr.length - 1] = first_ele;
	}

	public static void left_Rotate_by_K_Place_BruteForce_I(int arr[], int n, int k) {
		k = k % arr.length;
		
		int i = 0;
		while (i < k) {
			left_Rotate_by_One_Place(arr, arr.length);
			i++;
		}
	}

	public static void left_Rotate_by_K_Place_BruteForce_II(int arr[], int n, int k) {
		int[] first_Arr = new int[k];
		for (int i = 0; i < k; i++) {
			first_Arr[i] = arr[i];
		}
//		System.out.print("temp arr = " + Arrays.toString(first_Arr));
		for (int i = 0; i < arr.length - k; i++) // 0 1 2 3 //7-3=4
		{
			arr[i] = arr[i + k]; // 0>>3 1>>4 2>>5 3>>6
		}

		for (int i = arr.length-k , j = 0; i < arr.length; i++) {
			arr[i] = first_Arr[j];
			j++;
		}
	}

	public static void reverseArr(int[] arr, int start, int end) {
		while (start < end) {

			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void left_Rotate_by_K_Place_BruteForce_III(int arr[], int n, int k) {
		// 1,2,3,4,5,6,7
		// 3 2 1 7 6 5 4
		// 4 5 6 7 1 2 3

		 if(arr.length==1)
	        {
	            return;
	        }
		reverseArr(arr, 0, k - 1);
		reverseArr(arr, k, arr.length - 1);
		reverseArr(arr, 0, arr.length - 1);

	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

//		int[] arr = {-1,-2, -3, 4, 5, 6, 7};
		int k=2;
		System.out.println(Arrays.toString(arr));
		// o/p: 4 5 6 7 1 2 3

//		int k = 3;
		
		
//		left_Rotate_by_K_Place_BruteForce_I(arr,arr.length,k);
		left_Rotate_by_K_Place_BruteForce_II(arr,arr.length,k);
//		left_Rotate_by_K_Place_BruteForce_III(arr, arr.length, k);
		System.out.println(Arrays.toString(arr));
	}

}
