package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NextSmaller {
	
	public static List<Integer> FindNextSmallerElementforEachElement(List<Integer> li)
	{
		List<Integer> AnsList= new ArrayList<>();
		
		int  next;
		
		
		for(int i=0;i<li.size();i++)
		{	
			next=-1;
			for(int j=i+1;j<li.size();j++)
			{
				if(li.get(j)<=li.get(i))
				{
					next=li.get(j);
				}
			}
			AnsList.add(next);
		}
		return AnsList;
	}

	
	
	public static List<Integer>
	FindNextSmallerElementforEachElementEffectively(List<Integer> li)
	{
		List<Integer> AnsList= new ArrayList<>(li.size());
		
		//int[] arr = new int[li.size()];
		
		
		Stack<Integer> s= new Stack<>();
		s.push(-1);
		
		for(int i=li.size()-1; i>=0;i--)
		{
			int current=li.get(i);
			while(s.peek()>=current)
			{
				s.pop();
			}
			//we get smaller element < current element in stack
			//AnsList.add(s.peek());
			AnsList.add(i, s.peek());
			//arr[i]=s.peek();
			s.push(current);
		}
		//return arr;
		return AnsList;
		
	}

	
	public static int[] nextSmallerElements(int[] arr)
	{
		int[] ansArr=new int[arr.length];
		
		Stack<Integer> s=new Stack<>();
		s.push(-1);
		
		for(int i=arr.length-1;i>=0;i--)
		{
			int current=arr[i];
			
			while(s.peek()>=current)   
			{
				s.pop();
			}
			ansArr[i]=s.peek();
			s.push(current);
		}
		
		return ansArr;
	}
	
	
	
	public static int[] prevSmallerElement(int[] arr)
	{
		{
			int[] ansArr=new int[arr.length];
			
			Stack<Integer> s=new Stack<>();
			s.push(-1);
			
			for(int i=0;i<arr.length;i++)
			{
				int current=arr[i];
				
				while(s.peek()>=current)   
				{
					s.pop();
				}
				ansArr[i]=s.peek();
				s.push(current);
			}
			
			return ansArr;
		}
	}
	public static void main(String[] args) {

		List<Integer> li= new ArrayList<>();
		
		li.add(2);
		li.add(1);
		li.add(4);
		li.add(3);
		
		System.out.println(li);
		
		//List<Integer> AnsList =FindNextSmallerElementforEachElement(li);
		
		int[] arr = {2,1,4,3};
		

//		int[] AnsList1=nextSmallerElements(arr);
//				
//		System.out.println("printAnsListing anslist1: ");
//		
//		System.out.println();
//		
//		for(int i=0; i<AnsList1.length;i++ )
//		{
//			System.out.print(AnsList1[i]+" ");
//		}

		
		
		
		int[] AnsList2=prevSmallerElement(arr);
		
		System.out.println("printAnsListing anslist2: ");
		
		System.out.println();
		
		for(int i=0; i<AnsList2.length;i++ )
		{
			System.out.print(AnsList2[i]+" ");
		}

	}}
	
