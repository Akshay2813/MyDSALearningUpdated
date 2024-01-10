package Question_Array;

import java.util.ArrayList;
import java.util.List;

public class R12_MegerTwoSortArr {
	
	//Two arrat must be sorted
	public static void mergeTwoSortArr(int[] arr1, int[] arr2,List<Integer> ans)
	{
		
		int i=0;
		int j=0;
		int k=0;
		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i]<=arr2[j])
			{
				ans.add(arr1[i]);
				i=i+1;
				k=k+1;
			}
			else
			{
				ans.add(arr2[j]);
				j=j+1;
				k=k+1;
			}
		}
		
		while(i<arr1.length)
		{
			ans.add(arr1[i]);
			i=i+1;
			k=k+1;
		}
		while(j<arr2.length)
		{
			ans.add(arr2[j]);
			j=j+1;
			k=k+1;
		}
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1= {5,5,6,7,8,9,10,11,12,13};
		int[] arr2= {1,2,3,4,99,100};
		
		List<Integer> ans= new ArrayList<Integer>();
		
		mergeTwoSortArr(arr1,arr2,ans);
		for(int i=0;i<ans.size();i++)
		{
			System.out.print(ans.get(i)+ " ");
		}
			
		
	}

}
