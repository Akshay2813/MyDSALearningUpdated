package String;

public class S_03_Reversestring {

	public static String reveseString(String s)
	{
		String revString="";
		for(int i=0;i<s.length();i++)
		{
			
			revString=s.charAt(i)+revString;
		}
		return revString;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abcde";
		System.out.println(s);
		
		String revString=reveseString(s);
		System.out.println(revString);
	} 
}
