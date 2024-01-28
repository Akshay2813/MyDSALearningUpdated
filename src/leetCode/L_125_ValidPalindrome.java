package leetCode;

public class L_125_ValidPalindrome {
	
	
	public static boolean check_If_palindrome(String s)
	{
		String ans="";
		
		for(int i=0; i<s.length();i++)
		{
			ans=s.charAt(i)+ans;
		}
		
		if(s.equals(ans))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	 public static boolean isPalindrome(String s) {
		 
		 	String temp="";
		 	for(int i=0; i<s.length();i++)
		 	{
		 		boolean isalpha=Character.isAlphabetic(s.charAt(i));
		 		boolean isNum=Character.isDigit(s.charAt(i));
		 		if(isalpha==true || isNum==true)
		 		{
		 			temp=temp+s.charAt(i);
		 		}
		 	}
		 	
	        return check_If_palindrome(temp.toLowerCase());
	    }
	 
	 public static boolean isPalindrome_optimized(String s)
	 {
		 int start=0;
		 int end=s.length()-1;
		 while(start<=end)
		 {
			 char start_ch = s.charAt(start);
			 char end_ch=s.charAt(end);
			 
			 if(! Character.isLetterOrDigit(start_ch))
			 {
				 start++;
			 }
			 else if(! Character.isLetterOrDigit(end_ch))
			 {
				 end--;
			 }
			 else
			 {
				 if(Character.toLowerCase(start_ch) != Character.toLowerCase(end_ch))
				 {
					 return false;
				 }
				 start++;
				 end--;
			 }
			 
			 
		 }
		 
		 return true;
	 }

	public static void main(String[] args) {
		
		String s= "A man, a plan, a canal: Panama";
		
//		String s ="0P";
//		System.out.print(isPalindrome(s));
		
		
		
		System.out.print(isPalindrome_optimized(s));
		
		System.out.println(0^0);
		System.out.println(0^1);

	}

}
