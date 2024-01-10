package stack;

import java.util.Stack;

public class validParanthesis {
	
	  public boolean isValid(String s) {


	        Stack<Character> st= new Stack<>();

	        for(int i=0; i<s.length();i++)
	        {
	            char ch=s.charAt(i);

	            //ch is open bracket
	            if(ch=='(' || ch=='{' || ch=='[')
	            {
	                st.push(ch);
	            }
	            else
	            {
	                //ch is close bracket
	               
	                if(! st.empty())
	                {
	                    char topch= st.peek();
	                    if(ch==')' && topch=='(')
	                    {
	                        st.pop();
	                    }
	                    else if(ch=='}' && topch=='{')
	                    {
	                        st.pop();
	                    }
	                     else if(ch==']' && topch=='[')
	                    {
	                        st.pop();
	                    }
	                    else
	                    {
	                        return false;
	                    }
	                }
	                else
	                {
	                    return false;
	                }

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

	}

}
