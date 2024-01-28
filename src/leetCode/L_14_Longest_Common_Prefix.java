package leetCode;

import java.util.Arrays;

public class L_14_Longest_Common_Prefix {

	public static String longestCommonPrefix(String[] strs) {
		String ans="";
		Arrays.sort(strs);
		System.out.print(Arrays.toString(strs));
		for(int i=0; i<strs[0].length();i++)   //ab  0 1
        {
	          char ch=strs[0].charAt(i);  //a  b
	          
	          boolean match=true;
	          for(int j=1;j<strs.length;j++)  //j=1 ; 1<2;j++
	          {
	        	  //ch at i does not match with ch of remaining at ith pos
	        	  
//	        	  System.out.println(i +"__" + j);
	        	  if( (strs[j].length() < i) || (ch !=strs[j].charAt(i))) //1<0 || a !=a
	        	  {
	        		  
	        		  match=false;
	        		  break; 
	        	  }
	          }
	          if(match==false)
	          {
	        	  break;
	          }
	          else
	          {
	        	  ans=ans+ch;
	          }      
        }
		return ans;
	}
	
	public static String longestCommonPrefix_optimized(String[] strs) {
		String ans="";
		Arrays.sort(strs);
		
		String start_word=strs[0];
		String end_word=strs[strs.length-1];
		
		int index=0;
		
		while(index<start_word.length())
		{
			if(start_word.charAt(index) ==end_word.charAt(index))
			{
				ans=ans+start_word.charAt(index);
				index++;
			}
			else
			{
				break;
			}
			
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] str = {"flower","flow","flight"};
		
		String[] str = {"ab", "a"};	
//		System.out.print(longestCommonPrefix(str));
		
		
		System.out.print(longestCommonPrefix_optimized(str));

	}

}
