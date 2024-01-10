package Package_III;

import java.util.Scanner;

/*
 
		*
		* *
		* * *
		* * * *

*/

public class Pattern_03 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows needed to print the pattern ");
		int n = scanner.nextInt();
		System.out.println("## Printing the pattern ##");
	    System.out.println();
	    
	    for(int row=0 ; row < n ; row++)
	    {
	    	for(int col= 0; col < row+1; col++)
	    	{
	    		System.out.print("* ");
	    	}
	    	System.out.println();
	    }

	}

}
