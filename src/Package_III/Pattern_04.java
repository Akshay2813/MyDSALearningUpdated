package Package_III;

import java.util.Scanner;

/*
											 n - 1 - row       row+1
					*      3 space 1 star    4-1-0=3     		0+1=1
				  * *      2 space 2 star    4-1-1=2            1+1=2
			    * * *      1 space 3 star    4-1-2=1            2+1=3
			  * * * *      0 space 4 star    4-1-3=0            3+1=4
*/
public class Pattern_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows = ");
		int n =scanner.nextInt();
		
		System.out.println("## Printing the pattern ##");
		System.out.println();
	   
	   
	   for(int row=0; row < n ; row++)
	   {
		   //space
		   for(int space=0;space < n-1-row; space++)
		   {
			   System.out.print(" ");
		   }
		   
		   //star
		   
		   for(int star=0; star < row +1 ; star++)
		   {
			   System.out.print("*");
		   }
		   System.out.println();
	   }
	   

	}

}
