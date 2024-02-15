package com.homework.question;

import java.util.Arrays;

public class H_33_Left_rotate_array_by_one_place {

	public static void left_Rotate_by_onePlace(int arr[], int n) {
		int first_ele = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[arr.length - 1] = first_ele;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(arr));
		// o/p: 2 3 4 5 1

		left_Rotate_by_onePlace(arr, arr.length);
		System.out.println(Arrays.toString(arr));

	}

}
