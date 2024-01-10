package queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;


public class RevserseQueue {
	
	
	public static void reverseQueueUsingStack(Queue<Integer> q)
	{
		 Stack<Integer> stack = new Stack<>();
	        while (!q.isEmpty()) {
	            stack.add(q.peek());
	            q.remove();
	        }
	        while (!stack.isEmpty()) {
	            q.add(stack.peek());
	            stack.pop();
	        }
	}
	
	public static void Print(Queue<Integer> q)
    {
        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
	public static void reverseQueueRecursion(Queue<Integer> q)
	{
		
		if(q.isEmpty())
		{
			return;
		}
		int element=q.peek();
//		System.out.println(element);
		
		q.remove();
		
		reverseQueueRecursion(q);
		q.add(element);
	}

	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<Integer>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
       
        System.out.println("Main List is = ");
        Print(q);

       
        System.out.println();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
//        reverseQueueUsingStack(q);
//        System.out.println("Main List after reverseQueueUsingStack = ");

        reverseQueueRecursion(q);
        System.out.println("Main List after reverseQueueRecursion = ");
     	Print(q);
     	System.out.println();
	
     	
     	

	}

}
