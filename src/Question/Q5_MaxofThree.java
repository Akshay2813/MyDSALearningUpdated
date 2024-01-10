package Question;

import java.util.Scanner;


public class Q5_MaxofThree {
	
	public static int FindMaxofThree(int num1, int num2, int num3)
	{
		if(num1 > num2 && num1 > num3)
		{
			return num1;
		}
		else if(num2 > num3)
		{
			return num2;
		}
		else
		{
			return num3;
		}
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter number num1 = ");
		int num1 = sc.nextInt();
		System.out.print("Enter number num2 = ");
		int num2 = sc.nextInt();
		System.out.print("Enter number num3 = ");
		int num3 = sc.nextInt();
		System.out.println("Largest number ois = " + FindMaxofThree(num1,num2,num3));

	}

}
