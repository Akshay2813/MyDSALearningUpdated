package com.pattern.question;

import java.util.Scanner;

public class pattern_1 {

	/*
			* * * * * 
			* * * * * 
			* * * * * 
			* * * * * 
			* * * * * 
	*/
	public static void p1(int n)
	{
		for(int i=0; i<n;i++)
		{
			for(int j=0;j<n; j++)
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
		p1(n);
		

	}

}
