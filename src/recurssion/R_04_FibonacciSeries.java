package recurssion;

import java.util.Scanner;

public class R_04_FibonacciSeries {

	public static int fibonaccisSeries(int n)
	{
		
		//nth term =5 >> 0 1 1 2 3 ans = 3
		
		//first term
		if(n==1)
		{
			return 0;
		}
		//second term
		if(n==2)
		{
			return 1;
		}
		//ans  = f(3-1) + f(3-2) >> f(2)+f(1) = 1+0=1  
		int ans =  fibonaccisSeries(n-1) + fibonaccisSeries(n-2);
		return ans;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter number = ");
		int n= sc.nextInt();
		int nthTerm = fibonaccisSeries(n);
		System.out.println(nthTerm);
	}

}
