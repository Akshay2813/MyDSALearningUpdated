package com.gfg.sdebasicsheet;

public class Missing_number_in_array {
	/*
	 Given an array of size N-1 such that it
	  only contains distinct integers in the range of 1 to N. 
	  Find the missing element.
*/ 
	
	public static int missingNumber(int array[], int n) {
        // Your Code Here
        
        int totalSum=0;
        for(int i=1; i<=n;i++)
        {
            totalSum=totalSum+i;
        }
        // System.out.println("totalSum" + totalSum);
        int arrSum=0;
        for(int j=0; j<array.length;j++)
        {
            arrSum=arrSum+array[j];
        }
//         System.out.println("arrSum" + arrSum);
        return totalSum-arrSum;
    }

	public static void main(String[] args) {
		
		
		int[] arr= {1,2,3,5};
		int n=arr.length+1;		
		System.out.print("Missing element in Arr= " + missingNumber(arr,n));
		
		

	}

}
