package queue;

import java.util.LinkedList;
import java.util.Queue;

public class InterLeaveOfFirstSecondHalfOfQ {

	public static void InterLeaveOfFirstSecondHalfOfQ(Queue<Integer> q)
	{
		
		if(q.isEmpty())
		{
			return;
		}
		int size=q.size();
		int mid=size/2;
		
		int count=0;
		
		Queue<Integer> tempQ= new LinkedList<>();
		
		while(!q.isEmpty())
		{
			int temp=q.peek();
			q.remove();
			tempQ.add(temp);
			
			count=count+1;
			if(count==mid)
			{
				break;
			}
			
		}
		
		
		while(!q.isEmpty() && !tempQ.isEmpty())
		{
			int first=tempQ.peek();
			
			tempQ.remove();
			
			q.add(first);
			
			int second=q.peek();
			q.peek();
			q.remove();
			
			q.add(second);
		}
		
		//if we have odd size then one half cpntains even elements and other half contains odd element
		
		//then tow even halves will be handle in above loppe and one element remaining
		if((size & 1) !=0)
		{
			
		}
		
		
		//size & 1 ==1 then odd 
		//size & 1 !=1 then even
		if ((size & 1) == 1)
		{
			int temp=q.peek();
			q.remove();
			
			q.add(temp);
		}
			
	
	    
	     
	     
	    
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<>();
		
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.add(6);
		q.add(7);
		q.add(8);
		q.add(9);
		
		InterLeaveOfFirstSecondHalfOfQ(q);
		
		while(! q.isEmpty())
		{
			System.out.print(q.peek()+" ");
			q.remove();
		}
	}

}
