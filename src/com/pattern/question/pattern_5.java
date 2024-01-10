package com.pattern.question;

import java.util.Scanner;

public class pattern_5 {

	/*        n=5          star           space
	 		* * * * *       5      n-row   0 
	 		  * * * *       4              1
	 		  	* * *       3
	 		  	  * *       2
	 		  	  	*       1
	*/
	public static void p5(int n)
	{
		for(int i=0; i<n;i++)
		{
		
			for(int space=0;space<i;space++)
			{
				System.out.print(" " + " ");
			}
			for(int j=0;j<n-i; j++)
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
		p5(n);
		
	}

}
