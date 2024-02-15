package com.homework.question;

import java.util.Arrays;

public class H_32_right_rotate_array_by_K_place {

	public static void right_Rotate_by_one(int arr[], int n) {
		int last_ele = arr[arr.length - 1];
		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = last_ele;
	}

	public static void right_Rotate_by_K_places_BruteForce_I(int arr[], int n, int k) {
		int times = k % arr.length;

		int i = 0;
		while (i < times) {
			right_Rotate_by_one(arr, arr.length);
			i++;
		}

	}

	public static void right_Rotate_by_K_places_BruteForce_II(int[] arr, int n, int k) {

		k = k % arr.length;

		int[] last_Arr = new int[k];

		for (int i = 0; i < k; i++) {
			// 7-k
			last_Arr[i] = arr[arr.length - k + i]; //
		}
//		System.out.print("temp= "+Arrays.toString(last_Arr));
		for (int i = arr.length - 1; i >= k; i--) // 4
		{
			arr[i] = arr[i - k]; // 4>>1 3>>0
		}
		for (int i = 0; i < k; i++) {
			arr[i] = last_Arr[i];
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

	public static void right_Rotate_by_K_places_Optimal(int[] arr, int n, int k) {
		// 1,2,3,4,5,6,7
		// 7 6 5 4 3 2 1
		// 5 6 7 1 2 3 4
		 if(arr.length==1)
	        {
	            return;
	        }

		reverseArr(arr, 0, n - 1);

		reverseArr(arr, 0, k - 1);

		reverseArr(arr, k, n - 1);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] arr = {1, 2, 3, 4, 5};  
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		// 5,6,7,1,2,3,4

		System.out.println(Arrays.toString(arr));

		int k = 3;
//		right_Rotate_by_K_places_BruteForce_I(arr,arr.length,k );
		right_Rotate_by_K_places_BruteForce_II(arr, arr.length, k);
//		right_Rotate_by_K_places_Optimal(arr,arr.length,k);
		System.out.println(Arrays.toString(arr));

	}

}
