package com.homework.question;

import java.util.Arrays;

public class H_02_MoveNegNumToLeft {

	public static void MoveNegativeToLeft(int[] nums) {
		
		int low=0;
		int high=nums.length-1;
		
		while(low<high)
		{
			if(nums[low]<0)
			{
				low++;
			}
			else if(nums[high]>=0)
			{
				high--;
			}
			else
			{
				int temp=nums[low];
				nums[low]=nums[high];
				nums[high]=temp;
				
//				low++;
//				high--;
			}
		}
		
	}

       
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,-3,-4,5,6,0};
		MoveNegativeToLeft(arr);
		
		System.out.print(Arrays.toString(arr));
		
		

	}

}
