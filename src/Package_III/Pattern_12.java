package Package_III;

import java.util.Scanner;

public class Pattern_12 {
	
	/*
	 
	 * * * *
	  * * *
	   * *
	    * 
 
*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number n = ");
		int n = sc.nextInt();
		
		for(int row=0; row <n;row++)
		{
			
			//space
			for(int space=0;space <row ; space++)
			{
				System.out.print(" ");
			}
			
			//star
			for(int star=0; star < n-row;star++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}

	}

}
