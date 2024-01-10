package Question;

public class PrintDigit {

	public static void printEachDigitOfNum(int num)
	{
		int temp=num;
		while(temp>0)
		{
			int digit= temp%10;
			System.out.print(digit+" ") ;
			temp=temp/10;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=655;
		printEachDigitOfNum(num);
		
		System.out.println(num);

	}

}
