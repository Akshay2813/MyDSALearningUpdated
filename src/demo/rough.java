package demo;

import java.util.HashMap;
import java.util.Map;

public class rough {
	

	
		
		public static int findDuplicate(int[] nums) 
		{
//				int ans=-1;
//				Map<Integer,Integer> m= new HashMap<>();
//				for(int i=0; i<nums.length;i++)
//				{
//					int value=m.getOrDefault(nums[i], 0);
//					m.put(nums[i],value+1);
//				}
//
//				System.out.println(m);
//				for(Map.Entry<Integer,Integer> i :  m.entrySet())
//				{
//					if(i.getValue()>1)
//					{
//						ans=i.getKey();
//					}
//				}
			
				int ans=-1;
				for(int i=0; i<nums.length-1;i++)
				{
					int index=Math.abs(nums[i]);

					//Already visited
					if(nums[index]<0)
					{
						ans=nums[i];
						break;
					}
					nums[i]=-index;

				}
				return ans;
		}  
	     



	public static void main(String[] args) {


		int[] nums = {1,3,4,2,2};
		
		System.out.println(findDuplicate(nums));

	}

}
