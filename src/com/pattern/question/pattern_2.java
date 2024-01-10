package com.pattern.question;

import java.util.Scanner;

public class pattern_2 {

	/*
			* 							1 time
			* * 						2 time
			* * *      					3 time
			* * * * 					4 time
			* * * * *                   5 time
	*/
	public static void p2(int n)
	{
		for(int i=0; i<n;i++)
		{
			for(int j=0;j<i+1; j++)
			{
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number =  ");
		int n=sc.nextInt();
		p2(n);
		

	}

}
