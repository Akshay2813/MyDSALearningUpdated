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
		
		for(int i=low;i<high;i++)
		{
			li.add(arr[i]);
		}
		return li;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		          //{2,1,0,1,2}
		
		List<Integer> li = findClosestElements(arr,4,3);
		System.out.print(li);

	}

}
