package Package_III;

import java.util.Scanner;

public class Pattern_13 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number n = ");
		int n = sc.nextInt();
		for(int row=0; row <n;row++)
		{
				for(int space=0;space < n-1-row; space++)
				{
					System.out.print(" ");
				}
				for(int star=0;star < row+1; star++)
				{
					System.out.print("* ");
				}
				System.out.println();
		}
		
		//space
		for(int row=0; row <n;row++)
		{
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
