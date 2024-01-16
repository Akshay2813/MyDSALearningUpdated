package com.homework.question;

public class H_24_Recursion_HeadRecursion {
	
	/* Head Recursion
	  1. Base Condition
	  2. Recursive Relation
	  3. Process
	 *  */
	
	public static void printNum_1_To_n(int n)
	{
		//Base Condition
		if(n==0)
		{
			return;
		}
		//Recursive Relation
		printNum_1_To_n(n-1);
		
		//process
		System.out.print(n +" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printNum_1_To_n(5);

	}

}
