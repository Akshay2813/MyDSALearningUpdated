package Binary_Search;

import java.util.Scanner;

public class B_03_LastOccurence {
	
	public static int findLastOccurence(int[] arr, int target)
	{
		int answer = -1;
		int start = 0;
		int end = arr.length-1;
		int mid = start + (end-start)/2;
		while(start<=end)
		{
			if(mid <arr.length && arr[mid]==target)
			{
				answer=mid;
				start=mid+1;
			}
			else if(target > arr[mid])
			{
				start=mid+1;
			}
			else
			{
				end=mid-1;
			}
			mid = start + (end-start)/2;
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] arr = {0,1,1,1,2,3,3,3,4,4,4,4};
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter target element= ");
		int target=scanner.nextInt();
		int index = findLastOccurence(arr,target);

		if (index == -1)
		{
			System.out.println("Target element not found");
		}
		else
		{
			System.out.println(" Target Element = " +target + " lastly found at index = "+index);
		}



	}

}
