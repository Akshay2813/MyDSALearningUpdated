package demo;

import java.util.Scanner;

public class binarySearch {

	public static int binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		int mid = start + ((end - start) / 2);

		while (start <= end) {
			if (arr[mid] == target) {
				return mid;
			}

			if (target > arr[mid]) {
				start = mid + 1;
			} else {
				end=mid-1;
			}

			mid = start + ((end - start) / 2);

		}

		return -1;
	}

	public static void main(String[] args) {

		// Array should be sorted
		int[] arr = { 2, 4, 6, 8, 10, 12 };

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Target= ");
		int target = sc.nextInt();
		System.out.println(binarySearch(arr, target));
		for(int i=0;i<arr.length;i++)
		{
		System.out.println(binarySearch(arr, arr[i]));
		}

	}

}
