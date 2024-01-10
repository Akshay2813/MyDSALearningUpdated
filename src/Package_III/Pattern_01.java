package Package_III;

import java.util.Scanner;

public class Pattern_01 {
	
	
	/*

	***
	***
	***

	*/


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a new Scanner object
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.println("Enter the number of rows needed to print the pattern ");

        int n = scanner.nextInt();
        System.out.println("## Printing the pattern ##");
        System.out.println();
		for(int row=0;row<n;row++)
		{
			for(int col=0;col<n;col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
