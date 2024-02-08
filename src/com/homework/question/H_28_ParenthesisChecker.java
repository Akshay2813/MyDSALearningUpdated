package com.homework.question;

import java.util.Stack;

public class H_28_ParenthesisChecker {

	public static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> st = new Stack();
        
        for(int i=0; i<x.length();i++)
        {
            if( !st.empty() && st.peek() =='{' && x.charAt(i)=='}')
            {
                st.pop();
            }
            else if( !st.empty() && st.peek() =='[' && x.charAt(i)==']')
            {
                st.pop();
            }
            
            else if( !st.empty() && st.peek() =='(' && x.charAt(i)==')')
            {
                st.pop();
            }
            else
            {
                st.push(x.charAt(i));
            }
        }
        
        if(st.empty())
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "{([])}";
		
		System.out.println(ispar(s1));
		
		String s2 = "([]";

		System.out.println(ispar(s2));

				

	}

}
