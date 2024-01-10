package String;

public class S_02_Palindrome {

	public static boolean isValidPalindrome(String s)
	{
		int start=0;
		int end=s.length()-1;
		while(start<=end)
		{
			if(s.charAt(start)!=s.charAt(end))
			{
				return false;
			}
			start=start+1;
			end=end-1;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String s= "abaaba";
		String s= "abdaba";
		boolean ans= isValidPalindrome(s);
		if(ans==true)
		{
			System.out.println("Valid palindrome");
		}
		else
		{
			System.out.println("Not a Valid palindrome");
		}

	}

}
