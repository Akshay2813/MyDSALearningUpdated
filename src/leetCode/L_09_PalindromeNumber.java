package leetCode;

public class L_09_PalindromeNumber {

	public static int reverseNum(int x)
    {
		int ans=0;
		int temp=x;
		while(temp > 0)
		{
			int digit= temp%10;
			ans = ans *10 + digit;
			temp=temp/10;
		}
		return ans;
		
	
    }
	public static  boolean isPalindrome(int x)
	{
		if(x<0)
		{
			return false;
		}
		int reverse= reverseNum(x);
		if(x==reverse)
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
		
		System.out.println(isPalindrome(121));
		System.out.println(isPalindrome(-121));
		System.out.println(isPalindrome(10));



	}

}
