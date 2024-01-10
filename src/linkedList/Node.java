package linkedList;

public class Node {

	public int data;
	Node next;
	
	Node()
	{
		System.out.println("Node Constructor");
		this.data=(Integer) null;
		this.next=null;
	}
	
	Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}

