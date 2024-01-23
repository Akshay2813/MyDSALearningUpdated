package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class L_532_KdiffPairsinArray {

	//BruteForce
	 public static int findPairs_BruteForce(int[] nums, int k) {

	        int count=0;
	        for(int i=0; i<nums.length-1;i++)
	        {
	            for(int j=i+1;j<nums.length;j++)
	            {
	               int sum=Math.abs(nums[i]-nums[j]);
	               if(sum==k)
	               {
	                   count++;
	               }
	            }
	        }
	        return count;
	        
	    }
	 //Two pointer apprroach
	 public static int findPairs_TwoPointer(int[] nums, int k)
	 {
		 Arrays.sort(nums);
		 Set<String> s= new HashSet();
		 int count=0;
		 int i=0; 
		 int j=1;
		 while(j<nums.length)
		 {
			 int diff= nums[j]-nums[i];
			 if(diff==k )
			 {
				
				s.add(nums[i]+","+nums[j]);
				count++;
				
				 i++;
				 j++;
			 }
			 else if(diff >k)
			 {
				 i++;
			 }
			 else
			 {
				 j++;
			 }
			 if(i==j)
			 {
				 j++;
			 }
			
		 }
		 
//		 System.out.print(s);
		 return s.size();
	 }
	 public static int binarySearch(int[] arr,int start,int target)
	 {
		 int end= arr.length-1;
		 int mid=start+(end-start)/2;
		 while(start<=end)
		 {
			 if(arr[mid]==target)
			 {
				 return mid;
			 }
			 if(arr[mid]>target)
			 {
				 end=mid-1;
			 }
			 else
			 {
				 start=mid+1;
			 }
			 mid=start+(end-start)/2;
		 }
		 return -1;
	 }
	 public static int findPairs_usingBinarySearch(int[] nums, int k)
	 {
		 Arrays.sort(nums);
		 Set<String> s = new HashSet();
		 for(int i=0;i<nums.length;i++)
		 {
			 int target = nums[i]+k;
			 int index = binarySearch(nums,i+1,target);
			 if(index != -1)
			 {
				 s.add(nums[i]+" "+ target);
			 }
		 }
		 return s.size() ;
	 }
	public static void main(String[] args) {
	
//		int[] arr1 = {1,2,3,4,5};
//		int count = findPairs_BruteForce(arr1,1);
//		System.out.print(count);


//		int[] arr2= {3,1,4,1,5};
//		int[] arr2= {1,1,1,1,1};
//		int count = findPairs_BruteForce(arr2,2); //duplicate also counted here
//		System.out.println(count); 
		
//		int count = findPairs_TwoPointer(arr2,0); 
//		System.out.println(count); 
//		/1,3,1,5,4
		int[] arr3= {3,1,4,1,5};
//		int c = findPairs_TwoPointer(arr3,2);
		
		int c = findPairs_usingBinarySearch(arr3,2);
		
		System.out.println(c); 
		
		int[] arr = {1,1,3,4,5};
		int  i = binarySearch(arr,0,6);
		System.out.print("index "+ i);


	}

}
