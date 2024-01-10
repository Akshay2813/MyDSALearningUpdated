package com.pattern.question;

import java.util.Scanner;

public class pattern_3 {

	/*        n=5            Space(n-row-1)      Star
					* 			4 time		1 time i+1
				  * * 			3 time		2 time
				* * *      		2 time	    3 time
			  * * * * 			1 time      4 time
			* * * * *           0 time 		5 time
	*/
	public static void p3(int n)
	{
		for(int i=0; i<n;i++)
		{
			for(int space=0;space<n-i-1;space++)
			{
				System.out.print(" " + " ");
			}
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
		p3(n);
		

	}

}
