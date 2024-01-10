package Question;

import java.util.Scanner;

public class Q3_PrintPrime {
	
	public static boolean CheckPrime(int n)
	{
		for(int j=2;j<n;j++)
		{
			if(n%j==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void PrintPrimeNumberUptoN(int n)
	{
		for(int i=1; i<=n; i++)
		{
			if(CheckPrime(i))
			{
			System.out.print(i + " ");
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter number n = ");
		int n = sc.nextInt();
		PrintPrimeNumberUptoN(n);

	}

}
