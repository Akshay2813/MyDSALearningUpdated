package leetCode;

import java.util.ArrayList;
import java.util.List;

public class L_658_FindKClosestElements {
	
	public static List<Integer> findClosestElements(int[] arr, int k, int x) {
		List<Integer> li = new ArrayList();
		
		int low=0;
		int high=arr.length-1;
		//0 1 2 3 4
		while(high-low >= k)
		{
			if(x - arr[low] > arr[high]-x)
			{
				low++;
			}
			else
			{
				high--;
			}
		}
		
		for(int i=low;i<=high;i++)
		{
			li.add(arr[i]);
		}
		return li;
        
    }

	public static int LowerNearestBoundUsingBS(int[] arr, int x)
	{
		int start=0;
		int end= arr.length-1;
		int mid= start+ (end-start)/2;
		
		int ans=end;
		while(start<=end)
		{
			if(arr[mid]>=x)
			{
				ans=mid;
				end=mid-1;
			}
			if(arr[mid]>x)
			{
				end=mid-1;
			}
			else
			{
				start=mid+1;
			}
			mid= start+ (end-start)/2;
		}
		return ans;
	}
	public static List<Integer> findClosestElements_UsingBinarySearch(int[] arr, int k, int x) {
List<Integer> li = new ArrayList();
		
		int high=LowerNearestBoundUsingBS(arr,x);
		int low=high-1;
		
		while(k>0)
		{
			if(low<0)
			{
				high++;
			}
			else if(high>= arr.length)
			{
				low--;
			}
			else if(x-arr[low]>arr[high]-x)
			{
				high++;
			}
			else
			{
				low--;
			}
			k--;
		}
		
		for(int i=low+1;i<high;i++)
		{
			li.add(arr[i]);
		}
		return li;
		
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		          //{2,1,0,1,2}
		
	//	List<Integer> li = findClosestElements(arr,4,3);
		List<Integer> li = findClosestElements_UsingBinarySearch(arr,4,3);
		
		System.out.print(li);

	}

}
