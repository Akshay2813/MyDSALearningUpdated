package leetCode;

import java.util.Stack;

public class L_20_ValidParentheses {

	public static boolean isValid(String s) {

        Stack<Character> st = new Stack();

        for(int i=0; i<s.length();i++)
        {
            if(st.empty()==false && s.charAt(i)=='}' && st.peek()=='{')
            {
                st.pop();
            }
            else if(st.empty()==false && s.charAt(i)==')' && st.peek()=='(')
            {
                st.pop();
            }
            else if(st.empty()==false && s.charAt(i)==']' && st.peek()=='[')
            {
                    st.pop();
            }
            else
            {
                st.push(s.charAt(i));
            }

        }

        if(st.empty()==true)
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
		String s1="({})";
		String s2=")(";
		System.out.println(isValid(s1));
		System.out.println(isValid(s2));

		

	}

}
