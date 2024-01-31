package com.homework.question;

public class H_14_SqaureRootBinarySearch {

	
	public static int squareRoot_usingForLoope(int n)
	{
		int ans=0;
		
		for(int i=0; i<=n; i++)
		{
			if(i*i==n)
			{
				return i;
			}
			
		}
		return ans;
	}
	public static int squareRoot(int n)
	{
		int start=0;
		int end=n;
		int mid=start+(end-start)/2;
		
		int ans=0;
		while(start<=end)
		{
			if(mid*mid==n)
			{
				return mid;
				
			}
			else if(mid*mid < n)
			{
				ans=mid;
				start=mid+1;
			}
			else
			{
				end=mid-1;
			}
			mid=start+(end-start)/2;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print(squareRoot(19));

	}

}
