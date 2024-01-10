package linkedList;

public class LL {
	
	
	Node head;  //this.data this.next
	Node tail;  //this.data this.next
	
	
	LL(Node head, Node tail)
	{
	
		this.head=head;
		this.tail=tail;
	}
//	class Node{
//		int data;
//		Node next;
//		
//		Node(int data)
//		{
//			this.data=data;
//			this.next=null;
//		}
//	}
	
	
	//print LL
	
	public  void printLL(Node head)
	{
		Node temp=head;
		while(temp !=null)
		{
			System.out.print(temp.data+" --> ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	
	public int  lengthOfLL(Node head)
	{
		int length=0;
		Node temp= head;
		while(temp != null)
		{
			length=length+1;
			temp=temp.next;
		}
		return length;
	}
	//Insert at head
	public Node insertAtHead(Node head, Node tail,int data)
	{
		Node newNode= new Node(data);
		if(head==null)
		{
			head=newNode;
			tail=newNode;
		}
		
		newNode.next=head;
		head=newNode;
		return head;
	
	}
	
	//Insert at tail
	public Node insertAtTail(Node head, Node tail, int data)
	{
		Node newNode= new Node(data);
		if(head==null)
		{
			head=newNode;
			tail=newNode;
		}
		tail.next=newNode;
		tail=newNode;
		
		return tail;
	}
	
	//insert at middle
	public void insertAtPos(Node head, Node tail, int data,int position)
	{
		int length=lengthOfLL(head);
		if(position<=0)
		{
			
			 insertAtHead(head,tail,data);
			 return;
		}
		if (position>=length)
		{
			
			insertAtTail(head,tail,data);
			return;
		}
		Node newNode=new Node(data);
		int i=0;
		Node temp= head;
		
		while(i < position-1)
			{
				temp=temp.next;
				i=i+1;
			}
		newNode.next=temp.next;
		temp.next=newNode;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start");
		//Node head= null;
		//Node tail= null;
		
		Node head = new Node(70);
		Node tail=head;
		LL list1 = new LL(head,tail);
//		list1.printLL(head);
		System.out.println(list1.lengthOfLL(head));
		
		tail  = list1.insertAtTail(head, tail, 80);
		
		head  = list1.insertAtHead(head, tail, 0);
		
		
	
		list1.printLL(head);
		list1.insertAtPos(head, tail, 11111, 0);
		list1.printLL(head);
		
		list1.insertAtPos(head, tail, 1001,1 );
		list1.printLL(head);
		list1.insertAtPos(head, tail, 9009, 5);
		list1.printLL(head);
		System.out.println("end");

	}

}
