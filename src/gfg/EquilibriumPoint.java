package gfg;

import java.util.Arrays;

public class EquilibriumPoint {
//Equilibrium point in an array is an index (or position) such that the 
//sum of all elements before that index is same as sum of elements after it.
//1-based indexing
	
	public static int equilibriumPoint_BrutForce(long arr[], int n) {

        // Your code here
		if(arr.length==1)
		{
			return 1; 
		}
		if(arr.length==2)
		{
			return -1;
		}
		for(int i=1;i<arr.length;i++)
		{
			long leftSum=0;
			long rightSum=0;
			//left sum
			for(int j=0;j<i;j++)
			{
				leftSum=leftSum+arr[i];
			}
			//right Sum 
			for(int k=i+1;k<arr.length;k++)
			{
				rightSum=rightSum+arr[i];
			}
			
			if(leftSum==rightSum)
			{
				return i+1;
			}
			
			
		}
		
		return -1;
    }
	
	public static int equilibriumPoint_Optimized(long arr[], int n) //1,3,5,2,2  //13
	{

		if(arr.length==1)
		{
			return 1;
		}
		
		if(arr.length==2)
		{
			return -1;
		}
		long[] sum = new long[arr.length];
		sum[0]=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			sum[i]=sum[i-1]+arr[i];  //1 4 9 11 13
		}
		
//		System.out.print(Arrays.toString(sum));
		
		//total sum
		long totalSum=0;
		for(int i=0; i<arr.length;i++)
		{
			totalSum=totalSum+arr[i];
		}
		for(int i=1;i<arr.length;i++)
		{
			long leftSum=sum[i]-arr[i];
			long rightSum=totalSum-sum[i];
			if(leftSum==rightSum)
			{
				return i+1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long[] arr = {1,3,5,2,2};
//		long[] arr = {5};
//		long[] arr = {5,6};
//		int ans=equilibriumPoint_BrutForce(arr,arr.length);
		int ans =equilibriumPoint_Optimized(arr,arr.length);
		System.out.print(ans);

	}

}
