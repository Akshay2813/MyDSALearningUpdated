package gfg;

public class ReverseString {
	
	 public static String reverseWord(String str)
	    {
	        String ans="";
	        for(int i=0;i<str.length();i++)
	        {
	        	ans=str.charAt(i)+ans;
	        }
	        return ans;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
