package com.homework.question;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class H_37_InterSectionOf_TwoSortedArr {
	
	public static ArrayList<Integer> findIntersection_brutForce_I(int arr1[], int arr2[], int n, int m)
    {
		ArrayList<Integer> ansList = new ArrayList();
		int[] visited_Arr= new int[arr2.length];
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j] && visited_Arr[j]==0)
				{
					ansList.add(arr1[i]);
					visited_Arr[j]=1;
					break;
				}
				if(arr2[j]>arr1[i])
				{
					break;
				}
			}
		}
		return ansList;
    }

	public static ArrayList<Integer> findIntersection_Optimal(int arr1[], int arr2[], int n, int m)
    {
		ArrayList<Integer> ansList = new ArrayList();
		int i=0;
		int j=0;
		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i]<arr2[j])
			{
				i++;
			}
			else if(arr2[j]<arr1[i])
			{
				j++;
			}
			else
			{
				ansList.add(arr1[i]);
				i++;
				j++;
			}
		}
		return ansList;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1, 2, 3, 3, 4, 5, 6};
;
		int[] arr2= {2,3,3,4,5,6,7,7};
		//O/P : 2 3 3 4 5 6
		
//		int[] arr1= {1, 2, 3, 3, 4, 5, 6};
//		int[] arr2= {3,3,5};
		//O/P : 3 3 5
		
//		ArrayList<Integer> ansList = findIntersection_brutForce_I(arr1,arr2,arr1.length,arr2.length);
		ArrayList<Integer> ansList = findIntersection_Optimal(arr1,arr2,arr1.length,arr2.length);
				
		System.out.print(ansList);
	}

}
