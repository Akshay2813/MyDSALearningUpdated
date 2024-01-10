package recurssion;

import java.util.Scanner;

public class R_03_Factorial {

	public static int findFactorialRecursively(int n)
	{
		//base condtion
		if (n==1)
		{
			return 1;
		}
		
		int small=findFactorialRecursively(n-1);
		int ans= n*small;
		return ans;			
	}
	
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.print("Enter number = ");
		int n= sc.nextInt();
		int factorial = findFactorialRecursively(n);
		System.out.println(factorial);

	}

}
