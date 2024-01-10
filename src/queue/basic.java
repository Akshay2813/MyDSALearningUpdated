package queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class basic {

	public static void main(String[] args) {
		
		Queue<Integer> q= new PriorityQueue<>();
		
		q.add(60);
		q.add(1000);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
	
//		System.out.println(q.peek());
		System.out.println("Size = "+q.size());
		
		System.out.println("Peek= "+ q.peek());

		while(!q.isEmpty())
		{
			System.out.print(q.peek()+ " ");
			q.remove();
		}
//		System.out.println();
//		q.offer(10);
//		q.offer(20);
//		q.offer(30);
//		System.out.println("Size = "+q.size());
//		while(!q.isEmpty())
//		{
//			System.out.print(q.element()+ " ");
//			q.poll();
//		}
//		System.out.println("Size = "+q.size());
//
//		 Queue<Integer> ll
//         = new LinkedList<Integer>();

     // Adding items to the ll
//     // using add()
//     ll.add(10);
//     ll.add(20);
//     ll.add(15);
//
//     // Printing the top element of
//     // the LinkedList
//     System.out.println(ll.peek());
//
//     // Printing the top element and removing it
//     // from the LinkedList container
//     System.out.println(ll.poll());
//
//     // Printing the top element again
//     System.out.println(ll.peek());

	}
	
	
	

}
