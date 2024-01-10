package stack;

import java.util.Stack;

public class LeetCode_32 {

	
	public int longestValidParentheses(String s) {

		
		int length=0;
        Stack<Integer> stk = new Stack<>();
        stk.push(-1);

        for(int i=0; i< s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                stk.push(i);
            }
            else
            {
                stk.pop();
                if(! stk.empty())
                {
                    length=i-stk.peek();
                }
                else
                {
                     stk.push(i);   
                }
            }
        }
       return length;
//        int length=0;
//        Stack<Character> st= new Stack<>();
//        for(int i=0;i<s.length();i++)
//        {
//            char current=s.charAt(i);
//            if(current=='(' && st.empty()==true)
//            {
//                st.push(current);
//            }
//            else if (current=='(' && st.peek()=='(' && st.empty()==false)
//            {
//                st.pop();
//            }
//            else
//            {
//                if(!st.empty())
//                {
//                    if(st.peek()=='(' && current==')')
//                    {
//                        length=length+1;
//                        st.pop();
//                    }
//                
//                }
//
//                else
//                {
//                   // st.push();
//                }
//            }
//        }
//        return 2*length;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
