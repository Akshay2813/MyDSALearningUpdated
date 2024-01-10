package stack;

import java.util.Stack;

public class MiddleOfStack {
	
	public static void getMiddleElementofStack(Stack<Integer> s, int totalSize)
	{
		int orignalSize=s.size();  //7
		int mid=(orignalSize/2)+1;  //4
		//BaseCondition
		
		if(s.size()==0)
		{
			System.out.println("Empty stack");
			return;
		}
		if(s.size()==(totalSize/2)+1)
		{
			   System.out.println("Middle element of stack is "+ s.peek());
			   return;
			   
		}
		int temp=s.peek();
		s.pop();
		getMiddleElementofStack(s,totalSize);
		s.push(temp);
	}

	public static void main(String[] args) {

		Stack<Integer> s = new Stack<>();
		s.push(50);
		s.push(40);		
		//s.push(30);

		s.push(10);

		s.push(60);
		s.push(70);
		s.push(80);
		
		int totalSize = s.size();
		System.out.println(s.size()+ " "+ s.peek());
		getMiddleElementofStack(s,totalSize);


	}

}
