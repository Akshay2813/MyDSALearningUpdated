package gfg;

public class RepeatedCharacter {

	/* Given a string consisting of lowercase english alphabets. 
	 * Find the repeated character present first in the string.*/
	 public static char firstRep(String S)
	    {
	        for(int i=0; i<S.length()-1;i++)
	        {
	            char temp=S.charAt(i);
	            for(int j=i+1;j<S.length(); j++)
	            {
	                if(S.charAt(j) == temp)
	                {
	                    return temp;
	                }
	            }
	        }
	        char ch = (char) -1;
	        return '#';
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch = firstRep("geeksforgeeks"); //g

		//char ch = firstRep("abcde"); //-1
		System.out.print(ch);

	}

}
