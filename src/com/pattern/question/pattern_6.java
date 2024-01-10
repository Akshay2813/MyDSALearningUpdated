package com.pattern.question;

import java.util.Scanner;

public class pattern_6 {

	/*        	   * 		4 space n-row-1  1 star
				  * * 		3 space	 		 2 star
				 * * *      2 space 		 3 star	    
			    * * * * 	1 space	         4 star
			   * * * * * 	0 space	 		
			  			      
			* 
	 		
	*/
	public static void p6(int n)
	{
		for(int i=0; i<n;i++)
		{
		
			for(int space=0;space<n-i-1;space++)
			{
				System.out.print(" " );
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
		p6(n);
		
	}

}
