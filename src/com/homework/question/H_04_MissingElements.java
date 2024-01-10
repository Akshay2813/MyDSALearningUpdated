package com.homework.question;

import java.util.Arrays;

public class H_04_MissingElements {
	
	
	public static int MissingElementInArr(int[] nums) {

       for(int i=0;i<nums.length;i++)
       {
    	   int index=Math.abs(nums[i]);
//    	   System.out.print(index +"  ");
          

    	   if(nums[index-1]>0)
    	   {
//    		   System.out.print(index-1 +"  ");
    		   nums[index-1]=nums[index-1]*-1;
//    	       System.out.println(Arrays.toString(nums));

    	   }
       }       
//       System.out.println(Arrays.toString(nums));
       
       for(int i=0; i<nums.length;i++)
       {
    	   if(nums[i]>0)
    	   {
    		   return i+1;
    	   }
       }
       return -1;
	}
	
	public static int MissingElementInArrSortSwap(int[] nums)
	{
		Arrays.sort(nums);
		for(int i=0; i<nums.length;i++)
		{
			if(nums[i] != i+1)
			{
				return i+1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,5,3,4};
		
		//int duplicate = findDuplicate(arr);
		
		
//		int missingElt = MissingElementInArr(arr);
		int missingElt = MissingElementInArrSortSwap(arr);

		
		
		System.out.print(missingElt);

	}

}
