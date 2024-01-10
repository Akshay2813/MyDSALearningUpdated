package recurssion;

public class R_09_PrintDigit {

	public static void printEachDigitofNumRecursively(int num)
	{
		if(num==0)
		{
			return;
		}
		System.out.print(num%10 + " ");
		num=num/10;
		printEachDigitofNumRecursively(num);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=201;
		printEachDigitofNumRecursively(num);
	}
}
