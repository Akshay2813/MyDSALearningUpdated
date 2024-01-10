package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReveserFirstKElement {
	
	public static void ReveserFirstKElementInQueue(Queue<Integer> q, int k)
	{
		int size=q.size();
		int count=0;
		Stack<Integer> s = new Stack<>();
		if(k<=0 || k>size)
		{
			return;
		}
		//step 1 add K elemenet in stack
		while(! q.isEmpty())
		{
			int temp=q.peek();
			q.remove();
			s.push(temp);
			count = count + 1;
			if(count==k)
			{
				break;
			}
		}
		
		//step 2 pop eleement from stack and add in queue
		
		while(! s.isEmpty())
		{
			int temp=s.peek();
			
			s.pop();
			q.add(temp);
		}
		
		// step 3 add remaining element to the q 
		count=0;
		while( ! q.isEmpty() && size-k !=0)   //if size-k ==0 then no need add element as already reversed in above loop
		{
			int temp= q.peek();
			q.remove();
			q.add(temp);
			count=count+1;
//			System.out.println(size-k +" "+ count);
			if(count==size-k)
			{
				break;
			}
		}
		
	}
	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<>();
		
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		
		
		
		while(! q.isEmpty())
		{
			System.out.print(q.peek()+" ");
			q.remove();
		}

		System.out.println();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		
//		ReveserFirstKElementInQueue(q, 3);
		ReveserFirstKElementInQueue(q, 5);

		
		while(! q.isEmpty())
		{
			System.out.print(q.peek()+" ");
			q.remove();
		}
	}

}
