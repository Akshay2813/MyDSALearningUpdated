package com.homework.question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class H_06_CommonElementInThreeSortedArr {
	
	public static void commonElementInThreeSortArr(int[] a,int[] b, int[] c)
	{
		List<Integer> li=new ArrayList();
		
		int i,j,k;
		i=j=k=0;
		while(i<a.length && j<b.length && k<c.length)
		{
			if(a[i]==b[j]  && b[j]==c[k])
			{
					li.add(a[i]);
					i++;
					j++;
					k++;				
			}
			else if (a[i]<b[j])
			{ 
				i++;
			}
			else if (b[j]<c[k])
			{
				j++;
			}
			else
			{
				k++;
			}
	
		}
	Set<Integer> s= new HashSet(li);
	System.out.println(li);
	System.out.print(s);	

	}
   
	public static void main(String[] args) {
		
//		int[] a = {1,5,10,20,40,80};
//		int[] b = {6,7,20,80,100};
//		int[] c = {3,4,15,20,30,70,80,120};

		
		int[] a = {2,2,2,2};
		int[] b = {2,2,2,2};
		int[] c = {2,2,2,2};
		
		commonElementInThreeSortArr(a,b,c);
		
	}

}
