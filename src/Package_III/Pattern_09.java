package Package_III;

import java.util.Scanner;

public class Pattern_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 
		1 
		2 3 
		4 5 6 
		7 8 9 10 
		11 12 13 14 15 
		16 17 18 19 20 21 
		
		*/
		
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
//				System.out.print("* ");
				count = count +1;
				System.out.print(count+" ");
				
			}
			System.out.println();
		}
		
	}

}
