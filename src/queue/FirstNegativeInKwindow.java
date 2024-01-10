package queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FirstNegativeInKwindow {
	
	public static void FindFirstNegativeInEveryKWindow(int[] arr, int k)
	{
		 Queue<Integer> q= new LinkedList<>();
		 
		 //First process First K window
		 
		 for(int i=0; i<k;i++)
		 {
			 if(arr[i]<0)
			 {
				 q.add(i);
			 }
		 }
		 //Remaining window
		 for(int i=k;i<arr.length;i++)
		 {
			 if(q.isEmpty())
			 {
				 System.out.print(0+" ");
			 }
			 else
			 {
				 System.out.print(arr[q.peek()]+" ");
			 }
			 
			
			 //remove out of window index from Q
			while((!q.isEmpty())&& ((i-q.peek())>=k))
			 {
				 q.remove();
			 }
			
			//Insert current window element index if element <0
			if(arr[i]<0)
			{
				q.add(i);
			}
		 }
		 
		 if(q.isEmpty())
		 {
			 System.out.print(0+" ");
		 }
		 else
		 {
			 System.out.print(arr[q.peek()]+" ");
		 }
		 
	}

	public static void main(String[] args) {
		
		int[] arr = {12,-1,-7,8,-15,30,16,28};
		
		  FindFirstNegativeInEveryKWindow(arr,3);
		
		
		

	}

}
