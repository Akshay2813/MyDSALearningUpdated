package stack;

import java.util.Arrays;

public class custom_stack {
	
	static int top;
	static int size;
	static int[] arr;
	

	custom_stack(int size)
	{
		arr=new int[size];
		this.size=size;
		top=-1;
	}
	
	public static void pushStack(int data)
	{
		if((size-top) >1)
		{
			//space avaliable
			top=top+1;
			arr[top]=data;
		}
		else
		{
			
			System.out.println("Stack is Overflow");
		}
	}
	public static void popStack()
	{
		if(top==-1)
		{
			System.out.println("Stack is UnderFlow");
		}
		else
		{
			top=top-1;
		}
	}
	
	public static int getTopofStack()
	{
		if(top==-1)
		{
			System.out.println("Stack is empty");
			return -1;
		}
		else
		{
			return arr[top];
		}
	}
	
	public static int getSizeOfStack()
	{
		return top+1;
	}
	
	public static boolean isStackEmpty()
	{
		if(top==-1)
		{
			return true;
		}
		else
		{
		return false;
		}
	}
	
	public static void main (String[] args)
	{
		custom_stack s=new custom_stack(5);
		s.pushStack(10);
		s.pushStack(20);
		s.pushStack(30);
		s.pushStack(40);
		s.pushStack(50);
		//s.pushStack(60);
		System.out.println(s.getTopofStack());
		
		while(s.isStackEmpty()==false)
		{
			System.out.print(s.getTopofStack()+" ");
			s.popStack();
		}
		System.out.println();
		s.popStack();
	}
}
