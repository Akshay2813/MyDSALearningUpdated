package com.homework.question;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class H_36_UnionOf_TwoSortedArr {
	
	public static ArrayList<Integer> findUnion_brutForce_I(int arr1[], int arr2[], int n, int m)
    {
		
		Set<Integer> tempSet= new TreeSet();
		for(int i=0 ; i<arr1.length;i++)
		{
			tempSet.add(arr1[i]);
		}
		
		for(int i=0 ; i<arr2.length;i++)
		{
			tempSet.add(arr2[i]);
		}
		ArrayList<Integer> ansList = new ArrayList(tempSet);
		return ansList;
    }

	public static ArrayList<Integer> findUnion_Optimal(int arr1[], int arr2[], int n, int m)
    {
		ArrayList<Integer> ansList = new ArrayList();
		
		int i=0; int j=0;
		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i]<=arr2[j])
			{
				if(ansList.size()==0 || ansList.get(ansList.size()-1) != arr1[i])
				{
					ansList.add(arr1[i]);
				}
				i++;
			}
			else
			{
				if(ansList.size()==0 || ansList.get(ansList.size()-1) != arr2[j])
				{
					ansList.add(arr2[j]);
				}
				j++;
			}
		}
		
		while (i < n) // IF any element left in arr1
		  {
		    if (ansList.get(ansList.size()-1) != arr1[i])
		    	{
		    	ansList.add(arr1[i]);
		    	}
		    i++;
		  }
		  while (j < m) // If any elements left in arr2
		  {
		    if (ansList.get(ansList.size()-1) != arr2[j])
		      {
		    	ansList.add(arr2[j]);
		      }
		    
		      j++;
		  }

		  

		return ansList;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,1,2,2,3,3,4,5};
		int[] arr2= {2,3,3,4,5,6,7,7};
		//O/P : 1 2 3 4 5 6 7
		
//		ArrayList<Integer> ansList = findUnion_brutForce_I(arr1,arr2,arr1.length,arr2.length);
		ArrayList<Integer> ansList = findUnion_Optimal(arr1,arr2,arr1.length,arr2.length);
				
		System.out.print(ansList);
	}

}
