package recurssion;

public class R_11_SubSequenceString {

	public static void printSubSequenceString(String s,int start,String output)
	{
		
		
		if(start>=s.length())
		{
			System.out.print(output + " ");
			return;
		}
		
		//exclude
		printSubSequenceString(s,start+1,output);
	
		//include
		output=output+s.charAt(start);
		printSubSequenceString(s,start+1,output);
	}
	
	public static void main(String[] args) {
		String s = "abc";
		String output="";
		printSubSequenceString(s,0,output);
	}
}
