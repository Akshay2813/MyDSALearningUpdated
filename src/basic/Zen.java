package basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Zen {

	public static void m1(int[] arr)
	{
		Map<Integer,Integer> m = new HashMap();
		for(int i=0; i<arr.length;i++)
		{
			int val=m.getOrDefault(arr[i], 0);
			
			m.put(arr[i], val+1);
		}
		System.out.print(m);
	}
	public static void m2(int[] arr)
	{
		int start=0;
		int end=arr.length-1;
		
		while(start<=end)
		{
			if(arr[start]==0)
			{
				int temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
				end--;
			}
			else
			{
				start++;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
//		int[] arr = {0,0,1,2,0,-1,-1,5,5,5};
		int[] arr = {4,0, 3, 2, 5};
		m1(arr);
		System.out.println();
		m2(arr);
		System.out.print(Arrays.toString(arr));
	}
}