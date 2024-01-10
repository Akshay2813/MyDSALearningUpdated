package com.gfg.sdebasicsheet;

import java.util.ArrayList;
import java.util.List;

public class UncommonCharacters {
	
	public static String UncommonChars(String A, String B)
    {
        // code here
		//abcd  
		//def
        String ans="";
        
        for(int i=0; i<A.length();i++)
        {
        	for(int j=0; j<B.length();j++)
        	{
        		if(A.charAt(i) == B.charAt(j))
        		{
        			
        		}
        	}
    		System.out.print(A.charAt(i));

        }
      
        return ans;   	
    }

	public static ArrayList<Character> UnionofTwoArr(String arr1, String arr2)
	{
		//int[] arr1 = {1,2,2,2,3};   int[] arr2 = {2,3,4,5};
		ArrayList<Character> AnswerArr = new ArrayList<> ();
		for(int i=0;i<arr1.length();i++)
		{
			for(int j=0;j<arr2.length();j++)
			{
				if(arr1.charAt(i)==arr2.charAt(j))
				{
//					arr2[j]=Integer.MIN_VALUE;
				}
			}
			AnswerArr.add(arr1.charAt(i));
		}
		
//		for(int i=0;i<arr2.length;i++)
//		{
//			if(arr2[i] != Integer.MIN_VALUE)
//			{
//				AnswerArr.add(arr2[i]);
//				
//			}
//		}
		
		System.out.print(AnswerArr);
		return AnswerArr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="geeksforgeeks";
		String s2="geeksquiz";
//		System.out.print(UncommonChars(s1,s2));
		
		UnionofTwoArr(s1,s2);
//fioqruz
	}

}
