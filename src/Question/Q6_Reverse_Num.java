package Question;

import java.util.Scanner;

public class Q6_Reverse_Num {
	
	public static int reverseNumber(int n)  //23
	{
		int temp=Math.abs(n);
		int ans=0;
		while(temp >0)
		{
			int digit = temp % 10;  //3
			ans = ans*10+digit;		//3	
			temp = temp/10;         //2
		}
		
		if (n >=0)
		{
			return ans;
		}
		else
		{
			return -ans;
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number n = ");
		int n = sc.nextInt();
		
		int ReverseNumber = Q6_Reverse_Num.reverseNumber(n);
		System.out.print("ReverseNumber is = "+ReverseNumber);
		

	}

}
