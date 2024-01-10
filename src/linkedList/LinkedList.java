package linkedList;

public class LinkedList extends Node{
	public Node head;
	public Node tail;
	LinkedList()
	{
		
		super();
		System.out.println("LinkedList Constructor");
		
	}
	
	LinkedList(int data)
	{
		super(data);
	}
	
	
	//print LL if head is given
	public void printLLIfHeadIsGiven(Node head)
	{
		Node temp=head;
		while(temp != null)
		{
			System.out.print(temp.data + " --> ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	//print LL if head is NOT given
	public void printLLIfHeadIsNotGiven()
	{
		Node temp=this.head;
		while(temp != null)
		{
			System.out.print(temp.data + " --> ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	
	//If head is given
	public void insertNodeAtHeadIfHeadIsGiven(Node head, Node tail,int data)
	{
		Node newNode = new Node(data);
		if(head==null)
		{
			head=newNode;
			tail=newNode;
		}
		else
		{
			newNode.next=head;
			head=newNode;
		}
	}
	
	//If head is NOT given
	
	public void insertNodeAtHeadIfHeadIsNotGiven(int data)
	{
		Node newNode = new Node(data);
		if(this.head==null)
		{
			this.head=newNode;
			this.tail=newNode;
		}
		else
		{
			newNode.next=head;
			this.head=newNode;
		}
	}
	
	//Insert tail if  head is not given
	public void insertNodeAtTailIfHeadIsNotGiven(int data)
	{
		Node newNode = new Node(data);
		if(this.head==null)
		{
			this.head=newNode;
			this.tail=newNode;
		}
		else
		{
			this.tail.next=newNode;
			tail=newNode;
		}
	}
	
	//insert at position
	//10 --> 20 --> 30 --> 40 --> 50 --> 
	//assume index/pos start with zero and now suppose we have to insert element at index 2
	public void insertAtPosition(int data, Node head, int position)
	{
		Node newNode= new Node(data);
		Node temp=head;
		int i=0;
		while(i<position-1)  //2-1 =1
		{
			temp=temp.next;
		}
		newNode.next=temp.next;
		temp.next=newNode;
		
		
	}
	
}
