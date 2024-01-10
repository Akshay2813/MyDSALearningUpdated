package stack;

import java.util.Stack;

public class ReverseStack {
	public static void InsertAtBottom(Stack<Integer> s, int target)
	{
		if(s.empty())
		{
			s.push(target);
			return;
		}
		
		int temp=s.peek();
		s.pop();
		InsertAtBottom(s,target);
		s.push(temp);
		
	}
	public static void reverseStack(Stack<Integer> s)
	{
		if(s.empty())
		{
			return;
		}
		int target=s.peek();
		s.pop();
		reverseStack(s);
		InsertAtBottom(s,target);
	}
	public static void main(String[] args) {
		Stack<Integer> s= new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		
		System.out.println("Before Revserse at bottom");
		
		System.out.println(s);
		
		reverseStack(s);
		System.out.println("After Revserse at bottom");

		System.out.println(s);


	}

}
