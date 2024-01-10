package Question_Array;

import java.util.ArrayList;
import java.util.HashMap;

public class Q6_Union_of_Arr {
	
	public static ArrayList<Integer> FindUnion(int arr1[], int arr2[], int n, int m) {
		  HashMap <Integer,Integer > freq=new HashMap<>();
		  ArrayList<Integer> Union=new ArrayList<>();
		  for (int i = 0; i < n; i++)
		    freq.put(arr1[i],freq.getOrDefault(arr1[i],0)+1);
		    
		  for (int i = 0; i < m; i++)
		    freq.put(arr2[i],freq.getOrDefault(arr2[i],0)+1);
		  for (int it: freq.keySet())
		    Union.add(it);
		  return Union;
		}
	
	public static ArrayList<Integer> UnionofTwoArr(int[] arr1, int[] arr2)
	{
		//int[] arr1 = {1,2,2,2,3};   int[] arr2 = {2,3,4,5};
		ArrayList<Integer> AnswerArr = new ArrayList<> ();
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					arr2[j]=Integer.MIN_VALUE;
				}
			}
			AnswerArr.add(arr1[i]);
		}
		
		for(int i=0;i<arr2.length;i++)
		{
			if(arr2[i] != Integer.MIN_VALUE)
			{
				AnswerArr.add(arr2[i]);
				
			}
		}
		
		return AnswerArr;
	}

	public static void main(String[] args) {
		
//		int[] arr1 = {1,2,3,4,5};
//		int[] arr2 = {5,6,7,8,9,10};
		
		//1 2 3 4 5 6 7 8 9 10
		
		int[] arr1 = {1,2,2,2,3}; 
		int[] arr2 = {2,3,4,5};
		
		
//		int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
//		int [] arr2 = {2,3,4,4,5,11,12};
		
		//1 2 3 4 5 6 7 8 9 10 11 12
		 
		//ArrayList<Integer> arr = UnionofTwoArr(arr1,arr2);
		ArrayList<Integer> arr = FindUnion(arr1, arr2, arr1.length,arr2.length);
		for(int i=0;i<arr.size();i++)	
		{
			System.out.print(arr.get(i) + " ");
		}
	}

}
    