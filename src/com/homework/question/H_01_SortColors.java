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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,2,1,1,0,1};
		sortColors(arr);
		
		System.out.print(Arrays.toString(arr));

	}

}
