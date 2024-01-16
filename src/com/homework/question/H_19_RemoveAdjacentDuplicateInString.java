package com.homework.question;

import java.util.Stack;

public class H_19_RemoveAdjacentDuplicateInString {

	public static void removeAllAdjacentDuplicatesInString(String s)
	{
		Stack<Character> st = new Stack();
		
		for(int i=0; i<s.length();i++)
		{
			if(st.empty()==false && st.peek()==s.charAt(i))
			{
				st.pop();
			}
			else
			{
				st.push(s.charAt(i));
			}
		}
		
	
//		System.out.println(st);
		String ans="";
		while(st.empty()==false)
		{
			ans=st.peek()+ans;
			st.pop();
		}
		System.out.print(ans);
	}
	public static void main(String[] args) {
		
		String s = "abbaca";
		removeAllAdjacentDuplicatesInString(s);
	

	}

}
