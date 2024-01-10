package com.homework.question;

public class H_03_DuplicateNumber {
	
	
	//LeetCode 287
	
	//Given an array of integers nums containing n + 1 integers 
	//where each integer is in the range [1, n] inclusive.
	//There is only one repeated number in nums, return this repeated number.
	//You must solve the problem without modifying the array nums and uses only constant extra space
	public static int findDuplicate(int[] nums) {

        for(int i=0; i<nums.length;i++)
        {
            //as array always contain 1 to n we can say arr's element is index
            int index=Math.abs(nums[i]);

            if(nums[index]<0)
            {
               // element is already visited
               return index;
            }
            else
            {
                //we have to mark element as visited
                nums[index]=nums[index]*-1;
            }
        }
        return -1;
	}
	
	public static int findDuplicate_PositioningMethod(int[] nums) {
		
//		while(nums[0] != nums[nums[0]])
//		{
//			//swap nums[0] and nums[nums[0]
//			int temp=nums[0];
//			nums[0]=nums[nums[0]];
//			nums[nums[0]]=temp;	
//			System.out.println("repating");
//		}
//		return nums[0];
		
		while (nums[0] != nums[nums[0]]) 
		{
            int temp = nums[nums[0]];
            nums[nums[0]] = nums[0];
            nums[0] = temp;
		}
		return nums[0];
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,4,2,2};
		
		//int duplicate = findDuplicate(arr);
		
		
		int duplicate = findDuplicate_PositioningMethod(arr);
		
		System.out.print(duplicate);

	}

}
