package stack;
import java.util.*;


public class s_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	
		Stack s1= new Stack();
		
		Stack<Integer> s2 = new Stack<>();
		
		s1.push(11);
		s1.push(12);
		s1.push(13);
		s1.push(14);
		s1.push(15);
		
		System.out.print(s1);
		System.out.println();
		Iterator it= s1.iterator();
		
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		System.out.println();
		
		for (Object item: s1) {
            System.out.print(item + " ");
        }
		System.out.println();
		
		ListIterator<Integer> li = s1.listIterator(s1.size());  
	
		while (li.hasPrevious())   
		{  
		 
		System.out.print(li.previous()+"  ");  
		}  
		System.out.println();
		System.out.println(s1.peek());

	}

}
