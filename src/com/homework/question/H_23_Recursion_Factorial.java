package com.homework.question;

public class H_23_Recursion_Factorial {
	
	//Base Condition
	//Recursive Relation
	//Processing
	public static int factorial(int num)
	{
		//Base Condition
		if(num==1)
		{
			return 1;
		}
	
		
		int smallProblem = factorial(num-1);
		
		//Recursive relation
		int bigProblemAns=num*smallProblem;
		return bigProblemAns;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print(factorial(5));

	}

}
