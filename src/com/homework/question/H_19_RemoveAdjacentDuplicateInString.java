package com.homework.question;

public class H_19_RemoveAdjacentDuplicateInString {

	public static void removeAllAdjacentDuplicatesInString(String s)
	{
		StringBuilder answerstring=new StringBuilder("");
	        int i=0;
	        while(i<s.length())
	        {
	        	System.out.println("Entered while");
	            if(answerstring.length()>0)
	            {
		        	System.out.println("length > 0");

	                if(answerstring.charAt(answerstring.length()-1)==s.charAt(i))
	                {
	                    answerstring.deleteCharAt(i);
	                }
	                else
	                {
	                	
	                    answerstring.append(s.charAt(i));
	                }

	            }
	            else
	            {
		        	System.out.println("length ==0");

	                answerstring.append(s.charAt(i));
	            }
	            i++;
	        }
		System.out.print(answerstring);
	}
	public static void main(String[] args) {
		
		String s = "abbaca";
		removeAllAdjacentDuplicatesInString(s);
	

	}

}
