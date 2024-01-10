package stack;

import java.util.Stack;

public class SortedStack {
	
	public static void insertSortedElement(Stack<Integer> s, int target)
	{
		if(s.empty())
		{
			s.push(target);
			return;
		}
		if(s.peek()>=target)
		{
			s.push(target);
			return;
		}
		int topElement=s.peek();
		s.pop();
		insertSortedElement(s,target);
		s.push(topElement);
		
	}
	
	public static void SortedStack(Stack<Integer> s)
	{
		if(s.empty())
		{
			return;
		}
		int target=s.peek();
		s.pop();
		SortedStack(s);
		insertSortedElement(s,target);

		
	}
	public static void main(String[] args) {
		
		Stack<Integer> s =new Stack<>();
		s.push(7);
		s.push(11);
		s.push(3);
		s.push(5);
		s.push(9);
		
		System.out.println(s);
		SortedStack(s);
		System.out.println(s);
		
	}

}
