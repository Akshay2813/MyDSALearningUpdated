package stack;

import java.util.Stack;

public class InsertAtBottom {
	
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

	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack<>();
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		
		System.out.println("Before Inserting at bottom");
		while(!s.empty())
		{
			System.out.println(s.peek());
			s.pop();
		}
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		if(s.empty())
		{
			System.out.println("Empty Stack");
			return;
		}
		
		int target= s.peek();
		s.pop();
		InsertAtBottom(s,target);
		
		System.out.println("After InsertAtBottom");
		while(!s.empty())
		{
			System.out.println(s.peek());
			s.pop();
		}
		
		
		

	}

}
