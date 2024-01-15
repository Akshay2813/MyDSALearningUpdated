package com.binarysearch.question;

public class PivotElement {
	
	//Arr is roated and Sorted and no duplicates
	/*      	10 		 8
			   *       6
			 *	 	4
			9	2
	 */
	
	public static int pivotElement(int[] arr)
	{
		int start=0;
		int end=arr.length;
		int mid=start+ (end-start)/2;
		while(start<end)
		{
			if(start==end)
			{
				//sinlge elemnt
				return start;
			}
			if(mid+1< arr.length && arr[mid]>arr[mid+1])
			{
				return mid;
			}
			if(mid-1 >=0 && arr[mid-1]> arr[mid])
			{
				return mid-1;
			}
			if(arr[start]>arr[mid])
			{
				//assume we are in Line B
				//then we can say with guarantee all element on line B always less than arr[start]
				//and here mid exist on line B and hence we have move toward line A
				end=mid-1;
				
			}
			else
			{
				start=mid;
			}
			mid=start+(end-start)/2;
			
		}
		return start;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {9,10,2,4,6,8};
				
		System.out.print("Pivote Element in Arr is = " + arr[pivotElement(arr)]);
		

	}

}
