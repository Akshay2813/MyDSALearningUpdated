package com.homework.question;

public class H_25_Recursion_TailRecursion {
	
	/* Head Recursion
	  1. Base Condition
	  2.Process
	  3. Recursive Relation
	  
	 *  */
	
	public static void printNum_n_To_1(int n)
	{
		//Base Condition
		if(n==0)
		{
			return;
		}
		//process
		System.out.print(n +" ");
		
		//Recursive Relation
		printNum_n_To_1(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				printNum_n_To_1(5);

	}

}
