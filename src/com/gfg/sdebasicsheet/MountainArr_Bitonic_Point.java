package com.gfg.sdebasicsheet;

public class MountainArr_Bitonic_Point {

	
    
    /*
          45
        25  42
     15      21
    1         17
               12
                11
    
    */
	public static int findMaximum(int[] arr, int n) {
		
		int start=0;
		int end=arr.length-1;
		int mid=start+(end-start)/2;
		
		while(start<end)
		{
			if(arr[mid]<arr[mid+1])
			{
                //we are in line A and we have to move towards right as peak exist in right
				start=mid+1;
			}
			else
			{
                //we are line B and out ans is left side 
				end=mid;
			}
			mid=start+(end-start)/2;
		}
		return mid;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,15,25,45,42,21,17,12,11};
		int n=arr.length;
		System.out.print("Peak element= " + arr [findMaximum(arr,n)]);

	}

}
