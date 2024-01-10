package Question;

import java.util.Scanner;

public class Q2_Print_1_to_N {
	
	public static void PrintNumUptoN(int n)
	{
		for(int i=1;i<=n;i++)
		{
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter number n = ");
		int n = sc.nextInt();
		PrintNumUptoN(n);

	}

}
