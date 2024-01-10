package doubleLL;

public class DoubleLL {
	
	public static void printDoubleLL(Node head)
	{
		System.out.print(" null<-- ");
		Node temp = head;
		while(temp != null)
		{
			System.out.print(temp.data + " <<-->> ");
			temp=temp.next;
		}
		System.out.println("null");
	}
	
	public static int lengthOfDoubleLL(Node head)
	{
		int length=0;
		Node temp = head;
		while(temp!=null)
		{
			length=length+1;
			temp=temp.next;
		}
		return length;
	}
	public static Node insertNodeAtFirstInDoubleLL(Node head, int data)
	{
		//null <-- 0 <-->10-->20  null<-- 555 --> null
		Node newNode = new Node(data);
		if(head == null)
		{
			head=newNode;
			return head;
		}
		newNode.next=head;
		head.prev=newNode;
		head=newNode;
		return head;
	}
	
	public static Node insertNodeAtLastInDoubleLL(Node head, int data)
	{
		//null <-- 0 <-->10-->20 -->null    null <-- 555 --> null
		
		Node newNode = new Node(data);
		if(head==null)
		{
			head=newNode;
			return head;
		}
		Node temp=head;
		while(temp.next != null)
		{
			temp=temp.next;
		}
		temp.next=newNode;
		newNode.prev=temp;
		return head;
	}
	public static Node insertNodeAtPositionInDoubleLL(Node head, int data,int position)
	{
		int length = lengthOfDoubleLL(head);
		
		if(position<=0)
		{
			head=insertNodeAtFirstInDoubleLL(head,data);
			return head;
		}
		if(position>=length)
		{
			head=insertNodeAtLastInDoubleLL(head,data);
			return head;
		}
		
		int i=0;
		Node temp=head;
		
		while(i<position-1)  
		{
			temp=temp.next;
			i=i+1;
		}
		//null <-- 0 <-->10-->20 -->null    null <-- 555 --> null
		Node newNode = new Node(data);
		newNode.next=temp.next;
		newNode.prev=temp;
		temp.next=newNode;	
		return head;
	}
	
	public static Node deleteFirstNode(Node head)
	{
		//null <-- 0 <-->10-->20 -->null  
		
		if (head==null)
		{
			System.out.println("We can not delete empty LL");
			return head;
		}
		//if LL have single elements
		if(head.next==null)
		{
			Node temp=head;
			head=null;
			//delete temp
			return head;
		}
		Node temp= head;
		head=head.next;
		head.prev=null;
		temp.next=null;
		return head;
	}
	
	public static Node deleteLastNode(Node head)
	{
		//null <-- 0 <-->10-->20 -->null  
		
		if (head==null)
		{
			System.out.println("We can not delete empty LL");
			return head;
		}
		//if LL have single elements
		if(head.next==null)
		{
			Node temp=head;
			head=null;
			//delete temp
			return head;
		}
		
		Node temp=head;
		while(temp.next.next != null)
		{
			temp=temp.next;
		}
		temp.next.prev=null;
		temp.next=null;
		
		return head;
	}
	
	public static Node deleteNodeAtPostion(Node head, int position)
	{
		int length=0;
		if(position==0)
		{
			head=deleteFirstNode(head);
			return head;
		}
		if(position==length)
		{
			head=deleteLastNode(head);
			return head;
		}
		
		int i=0;
		Node prevNode = head;
		while(i<position-1)
		{
			prevNode=prevNode.next;
			i=i+1;
		}
		
		Node currNode=prevNode.next;
		Node nextNode=currNode.next;
		
		prevNode.next=nextNode;
		nextNode.prev=prevNode;
		
		currNode.next=null;
		currNode.prev=null;
		
		return head;
	}

}
