package com.pattern.question;

import java.util.Scanner;

public class pattern_4 {

	/*        n=5          star         
	 		* * * * *       5      n-row    
	 		* * * *         4
	 		* * *           3
	 		* *             2
	 		*               1
	*/
	public static void p4(int n)
	{
		for(int i=0; i<n;i++)
		{
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
		p4(n);
		
	}

}
