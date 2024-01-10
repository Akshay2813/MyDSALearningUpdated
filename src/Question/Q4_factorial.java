package Question;

import java.util.Scanner;

public class Q4_factorial {

	
	public static int  FactorialofNum(int n)
	{
		int i=1;
		int ans=1;
		while(i <= n)
		{
			ans=ans*i;
			i=i+1;
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter number n = ");
		int n = sc.nextInt();
		int factorialofN = FactorialofNum(n);
		System.out.print("Factorial of " + n +" = ");
		System.out.println(factorialofN);

	}

}
