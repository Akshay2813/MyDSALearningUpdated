package com.homework.question;
import java.util.HashMap;

public class H_29_getPairCount {

	public static int getPairsCount(int[] arr, int n, int k) {
        // code here
        
        HashMap<Integer,Integer> m = new HashMap();
        
        int count=0;
        for(int i=0; i<arr.length;i++)
        {
            m.put(i,arr[i]);
        }
        System.out.print(m);
        
		 for(int i=0; i<arr.length;i++)
		 {
			 int complement=k-arr[i];  //7
			 if(m.containsKey(k) && m.get(complement) !=i )
			 {
				 count++;
			 }
		 }
        // System.out.print(m);
        return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 5, 7, 1};
		
		System.out.print(getPairsCount(nums,nums.length,6));


	}

}
