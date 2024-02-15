package leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class L_01_TwoSum {
	
	 public static int[] twoSum(int[] nums, int target) {
		 
		 Map<Integer, Integer> m = new HashMap();
		 
		 for(int i=0; i<nums.length;i++)
		 {
			 m.put(nums[i], i);
		 }
//		 System.out.println(m);
		 
		 
		 for(int i=0; i<nums.length;i++)
		 {
			 int complement=target-nums[i];  //7
			 if(m.containsKey(complement) && m.get(complement) !=i )
			 {
				 return new int[] {i,m.get(complement)};
			 }
		 }
		 return new int[] {};
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int [] nums = {2,7,11,15};
		int[] nums = {1, 5, 7, 1};
		
		int target = 6;
		
		int[] ans = twoSum(nums,target);
		
		System.out.println(Arrays.toString(ans));

	}

}
