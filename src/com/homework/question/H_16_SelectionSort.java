package com.homework.question;

import java.util.Arrays;

public class H_16_SelectionSort {

	public static void selectionSort(int[] arr) {
		// In selection sort after each round we have to keep min element to its right
		// index
		for (int i = 0; i < arr.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			// after comleting inner for loope we will get minIndex of min Element
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] arr = {5,6,7,1,2,3};

//		int[] arr = {1};
//		int[] arr = {1,2,3,4,5};
		int[] arr = { 5, 4, 3, 2, 1 };
		System.out.println(Arrays.toString(arr));

		selectionSort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
