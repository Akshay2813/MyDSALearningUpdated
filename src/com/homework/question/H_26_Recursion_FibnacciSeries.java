package com.homework.question;

import java.util.Scanner;

public class H_26_Recursion_FibnacciSeries {
	
	// 1 1 2 3 5 8 13 21
	
	public static int fib(int n)
	{
		//Base Condition
		if(n==1)   // 1st term and 2nd term is 1
		{
			
			return 1;
		}
		if(n==2)   // 1st term and 2nd term is 1
		{
			
			return 1;
		}
		int ans= fib(n-1)+fib(n-2);
		return ans;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		fib(5);
		
//		System.out.print(fib(6) +" " );
		
		//Printing upto nth
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.print("Enter value of n = ");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.print(fib(i) +" " );
		}
		

	}

}
