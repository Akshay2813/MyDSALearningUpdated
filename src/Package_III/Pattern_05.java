package Package_III;

import java.util.Scanner;

public class Pattern_05 {

/* n=6
	******    6 star
	*    *    2 star
	*    *    2 star
	*    *    2 star
	*    *    2 star
	******    6 star
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows = ");
		int n = scanner.nextInt();
		System.out.println("## Printing the pattern ##");
		System.out.println();
		
		for(int row=0; row < n ; row ++)
		{
			for(int col=0 ; col < n ; col++)
			{
				if(row==0 || row==n-1 || col==0 || col==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}	
			}
			System.out.println();
		}
	} 
}