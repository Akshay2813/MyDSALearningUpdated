package com.homework.question;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class H_05_FirstRepeatingElement {
	
	
	public static int firstRepeatingElement(int[] nums) {
		for(int i=0; i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[i]==nums[j])
				{
					return nums[i];
				}
			}
		}
      
       return -1;
	}
	

	public static int firstRepeatingElementMapMethod(int[] nums) {
		
		Map<Integer, Integer> m = new HashMap();
		
		for(int i=0; i<nums.length;i++)
		{
			int val= m.getOrDefault(nums[i], 0);
			m.put(nums[i], val+1);
		}
		
//		System.out.print(m);
		
		for(int i=0; i<nums.length;i++)
		{
			if(m.get(nums[i])>1)
			{
				return nums[i];
			}
		}
	
       return -1;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {1,5,3,4,3,5,6};
		int[] arr = {1,2,3};

		
		//int duplicate = findDuplicate(arr);
		
		
//		int missingElt = MissingElementInArr(arr);
//		int repeatingElt = firstRepeatingElement(arr);
		
		int repeatingElt = firstRepeatingElementMapMethod(arr);


		System.out.print(repeatingElt);

	}

}
