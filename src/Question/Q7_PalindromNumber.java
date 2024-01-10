package Question;

public class Q7_PalindromNumber {

	public static boolean checkNumberisPalindrome(int num)
	{
		int temp=num;
		int sum=0;
		while(temp>0)  //101
		{
			int digit=temp%10;  //1 0 1
			sum=sum*10+digit;   //1 10 101
			temp=temp/10;       //10 1 0
		}
		System.out.println(sum);
		if(sum==num)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=101;
		System.out.print(checkNumberisPalindrome(num));

	}

}
