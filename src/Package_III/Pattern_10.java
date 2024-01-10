package Package_III;

import java.util.Scanner;

public class Pattern_10 {

	/*
	 		0 1 2 3 4 5
		0	1             row= even col=even
		1	0 1 	      row=odd col = odd
		2	1 0 1         row= even col =even
		3	0 1 0 1 
		4	1 0 1 0 1 
		5	0 1 0 1 0 1 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows = ");
		int n = scanner.nextInt();
		System.out.println("## Printing the pattern ##");
		System.out.println();
		int count=0;
		for(int row=0;row<n;row++)
		{
			for(int col=0; col<row+1;col++)
			{
				if(row%2==0  && col%2==0)
				{
					System.out.print(1+" ");
				}
				else if (row%2==1  && col%2==1)
				{
					System.out.print(1+ " ");
				}
				else
				{
					System.out.print(0+ " ");
				}
				
			}
			System.out.println();
		}

	}

}
