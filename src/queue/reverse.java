package queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class reverse {

	
	public static Queue<Integer>  reverseQueueUsingStack(Queue<Integer> queue)
	{
		 Stack<Integer> stack = new Stack<>();
	        while (!queue.isEmpty()) {
	            stack.add(queue.peek());
	            queue.remove();
	        }
	        while (!stack.isEmpty()) {
		        
	            queue.add(stack.peek());
	            stack.pop();
	        }
	        
	        System.out.println(queue.peek()+"  ");
	        return queue;
	}
	
	public static void Print(Queue<Integer> queue)
    {
        while (!queue.isEmpty()) {
            System.out.print(queue.peek() + ", ");
            queue.remove();
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> queue=new LinkedList<>();
		
		
		queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        queue.add(70);
        queue.add(80);
        queue.add(90);
        queue.add(100);
 
        
        Print(queue);

       
        System.out.println();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        queue.add(70);
        queue.add(80);
        queue.add(90);
        queue.add(100);
        Queue<Integer> q= reverseQueueUsingStack(queue);
        Print(q);
		
		
		
	}

}
