package Binary_Search;

import java.util.Scanner;

public class B_01 {
	//Condition : Array should be sorted either in increasing order / decreasing order
	public static int binarySearch(int[] arr, int target)
	{
		int start=0;
		int end= arr.length-1;
		int mid = start + (end-start)/2;
		while(start <= end)
		{
			if(arr[mid]==target)
			{
				return mid;
			}
			if(target>arr[mid])
			{
				start=mid+1;
			}
			else
			{
				end=mid-1;
			}
			mid=start + (end-start)/2;
		}
		return -1;
	}
	public static void main(String[] args) {
		
//		int[] arr = {11,12,15,18,30};
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter target element= ");
//		int target=scanner.nextInt();
		
		int[] arr = {1,3};
		int target=1;
		
		int index = binarySearch(arr,target);
		
		if (index == -1)
		{
			System.out.println("Target element not found");
		}
		else
		{
			System.out.println(" Target Element = " +target + " found at index = "+index);
		}
		

	}

}
