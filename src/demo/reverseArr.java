package demo;

import java.util.Collections;

public class reverseArr {
	
	public static void reverseArr(int[] arr)
	{
		int start=0;
		int end=arr.length-1;
		
		while(start<=end)
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		
		int[] arr = { 2, 4, 6, 8, 10, 12 };
		reverseArr(arr);
		
		for(int i: arr) {
			System.out.print(i +" ");
		}
		


	}

}
