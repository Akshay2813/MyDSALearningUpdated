package leetCode;

import java.util.HashMap;

public class L_169_Majority_Element {
	
	public static int majorityElement_BruteForce(int[] arr)
	{
		int ans=0;
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count>arr.length/2)
			{
				ans =arr[i];
			}
		}
		return ans;
	}
	public static int majorityElement(int[] nums) {
        
        HashMap<Integer,Integer> m = new HashMap();
        int ans=0;
        for(int i=0; i<nums.length;i++)
        {
            int val=m.getOrDefault(nums[i],0);
            m.put(nums[i],val+1);
        }

        for(int i=0;i<nums.length;i++)
        {
            if(m.get(nums[i])>nums.length/2)
            {
                ans= nums[i];
            }
        }
        return ans;
    }
	
	//Moore Voting Algorithm
	public int majorityElement_Moore_Voting_Algorithm(int[] nums) {
        int count = 0;
        int candidate = 0;
        
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        
        return candidate;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {2,2,1,1,1,2,2};
		
		int majorityElement = majorityElement_BruteForce(arr);
//		int majorityElement = majorityElement(arr);
		System.out.print(majorityElement);
	}

}
