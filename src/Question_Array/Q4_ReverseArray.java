package Question_Array;

import java.util.Collections;

public class Q4_ReverseArray {
	
	public static void ReverseAnArr(int[] arr, int length)
	{
		int start = 0 ;
		int end = length-1;
		
		while(start <= end)
		{
			//Collections.swap(arr,start,end);  this need Collection instead of int[] arr it needs array list
			
			int temp = arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			
			start=start+1;
			end=end-1;
		}
	}

	public static void main(String[] args) {
		int[] arr = {30,10,100,20,40,50};
		
		ReverseAnArr(arr, arr.length);
		
		for(int i=0; i < arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}

	}

}
