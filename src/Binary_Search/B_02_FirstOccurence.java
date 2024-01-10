package Binary_Search;

import java.util.Scanner;

public class B_02_FirstOccurence {
	
	public static int findFirstOccurence(int[] arr, int target)
	{
		int answer=-1;
		int start=0;
		int end=arr.length-1;
		int mid = start + (end-start)/2;
		while(start<=end)
		{
			if( mid >=0 && arr[mid]==target)
			{
				answer=mid;
				end=mid-1;
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
		return answer;
	}

	public static void main(String[] args) {
		int[] arr = {1,1,1,2,3,3,3,4,5};
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter target element= ");
		int target=scanner.nextInt();
		int index = findFirstOccurence(arr,target);

		if (index == -1)
		{
			System.out.println("Target element not found");
		}
		else
		{
			System.out.println(" Target Element = " +target + " firstly found at index = "+index);
		}
	}

}
