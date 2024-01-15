package com.homework.question;

import java.util.Arrays;

public class H_01_SortColors {

	
	//LeetCode 75
	public static void sortColors(int[] nums) {

        int low=0;
        int medium=0;
        int high=nums.length-1;
        while(medium<=high)
        {
            if(nums[medium]==0)
            {
                int temp=nums[medium];
                nums[medium]=nums[low];
                nums[low]=temp;
                low++;
                medium++;

            }
            else if(nums[medium]==1)
            {
                medium++;
            }
            else
            {
                int temp=nums[medium];
                nums[medium]=nums[high];
                nums[high]=temp;
                high--;
            }
        }
        
    }

	public static void sortColorUsingThreePointer(int[] arr)
	{
		int low=0;
		int mid=0;
		int high=arr.length-1;
		
		while(mid<=high)
		{
			if(arr[mid]==0)
			{
				int temp=arr[low];
				arr[low]=arr[mid];
				arr[mid]=temp;
				low++;
				mid++;
			}
			else if(arr[mid]==1)
			{
				mid++;
			}
			else if(arr[mid]==2)
			{
				int temp=arr[high];
				arr[high]=arr[mid];
				arr[mid]=temp;
				high--;
			}
		}
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,1,2,2,0,1,0,2,2,1,1,1,0,0,1,0};
		//sortColors(arr);
		sortColorUsingThreePointer(arr);
		
		System.out.print(Arrays.toString(arr));

	}

}
