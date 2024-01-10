package Package_III;

import java.util.Scanner;
/*
	1 
	1 2 
	1 2 3 
	1 2 3 4 
	1 2 3 4 5 
	1 2 3 4 5 6 
*/
public class Pattern_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows = ");
		int n = scanner.nextInt();
		System.out.println("## Printing the pattern ##");
		System.out.println();
		
		for(int row=0; row < n ; row++)
		{
			for(int col=0; col < row+1; col++)
			{
				System.out.print(col+1+" ");
			}
			System.out.println();
		}
		
		
		

	}

}
