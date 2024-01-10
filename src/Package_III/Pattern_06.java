package Package_III;

import java.util.Scanner;

public class Pattern_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 		 1 
			    2 2 
			   3 3 3 
			  4 4 4 4 
			 5 5 5 5 5 
			6 6 6 6 6 6
		*/
			

		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter number of rows = ");
		int n = scanner.nextInt();
		System.out.println("## Printing the pattern ##");
		System.out.println();
		
		for(int row=0; row <n;row++ )
		{
			for(int space=0; space <n-1-row;space++)
			{
				System.out.print(" ");
			}
			for(int star=0; star <row+1;star++)
			{
//				System.out.print("* ");
				System.out.print(row+1+" ");
			}
			System.out.println();
		}
	}

}
