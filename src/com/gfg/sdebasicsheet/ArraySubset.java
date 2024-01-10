package com.gfg.sdebasicsheet;

import java.util.Arrays;

public class ArraySubset {

	
	public static int binarySearch(long[] arr, long target)
    {
        int start=0;
        int end=arr.length-1;
        int mid = start + (end-start)/2;
        while(start<=end)
        {
            if(arr[mid]==target)
            {
              return mid;  
            }
            else if (arr[mid] < target)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
            mid = start + (end-start)/2;
        }
        return -1;
    }
    public String isSubset( long a1[], long a2[], long n, long m) {
        
    	for(int i=0; i<a2.length; i++)
        {
            Arrays.sort(a1);
            int b = binarySearch(a1,a2[i]);
            if(b==-1)
            {
              // System.out.println(Arrays.toString(a1) + " __  " + a2[i]);
                return "No";
            }
            else
            {
                a1[b]=0;
            }
        }
        return "Yes";
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
