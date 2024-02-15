package gfg;

public class UncommonCharacters {

	public static String UncommonChars(String A, String B)
    {
        // code here
	   String ans="";
       int length_A=A.length();
       int length_B=B.length();
       
       int min_len=Math.min(length_A, length_B);
       int i=0;
       
       while(i<min_len)
       {
    	   if(! A.contains(Character.toString(B.charAt(i))))
    	   {
    		   ans=ans+B.charAt(i);
    	   }
       }
       return ans;
      
        
      
        
        
        
        
        
       
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
