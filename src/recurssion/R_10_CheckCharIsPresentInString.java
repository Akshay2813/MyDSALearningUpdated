package recurssion;

public class R_10_CheckCharIsPresentInString {

	public static boolean checkCharIsPresentInStringRecursively(String s, char ch,int startIndex)
	{
		if(startIndex>=s.length())
		{
			return false;
		}
		if(s.charAt(startIndex)==ch)
		{
			return true;
		}
		return checkCharIsPresentInStringRecursively(s,ch,startIndex+1);
		
	}
	public static void main(String[] args) {


		String s="Love Babbar";
		
		System.out.print(checkCharIsPresentInStringRecursively(s,'Z',0));		

	}

}
