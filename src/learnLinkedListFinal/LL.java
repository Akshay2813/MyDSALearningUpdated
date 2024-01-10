package learnLinkedListFinal;

public class LL {

	public static void printLL(Node head)
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.print(temp.data + "-->");
			temp=temp.next;
		}
		System.out.println("null");
	}
	
	public static int lengthofLL(Node head)
	{
		Node temp = head;
		int length=0;
		while(temp != null)
		{
			length=length+1;
			temp=temp.next;
		}
		return length;
	}
	
	public static Node insertAtBegin(Node head, int data)
	{
		Node newNode= new Node(data);
		if(head==null)
		{
			head=newNode;
			return head;
		}
		newNode.next=head;
		head=newNode;
		return head;
	}
	
	public static Node insertAtLast(Node head, int data)
	{
		Node newNode= new Node(data);
		if(head==null)
		{
			head=newNode;
			return head;
		}
		
		Node temp= head;
		while(temp.next != null)
		{
			temp=temp.next;
		}
		temp.next=newNode;
		return head;
	}
	
	public static Node insertAtIndexPosition(Node head, int data,int position) 
	{
		int length=lengthofLL(head);
		
		if(head==null) 
		{
			Node newNode= new Node(data);
			head=newNode;
			return newNode;
		}
		if(position<=0)
		{
			head=insertAtBegin(head,data);
			return head;
		}
		if(position>=length)
		{
			head=insertAtLast(head,data);
			return head;
		}
		Node temp=head;
		int i=0;  //example pos=3 start from 0
		while(i < position-1)  //0 1
		{
			temp=temp.next;
			i=i+1;
		}
		Node newNode= new Node(data);
		newNode.next=temp.next;
		temp.next=newNode;
		return head;
	}
	
	public static Node deleteHeadNode(Node head)
	{
		//10 >> 20 >>30>>null
		Node temp= head;
		head=head.next;
		temp.next=null;
		return head;
	}
	
	public static Node deleteLastNode(Node head)
	{
		
		//10 >> 20 >>30>>null
		Node temp = head;
		while(temp.next.next != null)
		{
			temp=temp.next;
		}
		temp.next=null;
		
		
		return head;
	}
	
	public static Node deleteNodeAtPosition(Node head, int position)
	{
		
		int length=lengthofLL(head);
		
		if(head==null)
		{
			System.out.println("We can not delete empty LL");
			return head;
		}
		if(position==0)
		{
			head=deleteHeadNode(head);
			return head;
		}
		
		if(position==length)
		{
			head=deleteLastNode(head);
			return head;
		}
		//10 >> 20 >>30>>40>>50>>null
		int i=0;
		Node prevNode=head;
		while(i<position-1)
		{
			prevNode=prevNode.next;
			i=i+1;
		}
		
		Node currNode=prevNode.next;
		prevNode.next=currNode.next;
		currNode.next=null;
		return head;
	}
	
	//Reverse LL
	//10 --> 20 --> 30 -- > null
	
	//null 10 20
	//30 --> 20 --> 10 --> null
	public static Node reverseLL(Node head)
	{
	//reversing LL means we have to make currnode pointing to prevnode
		System.out.println("ReverseLL");
		Node currNode=head;
		Node prev = null;
		
		
		while(currNode !=null)
		{
			//saving remaining list in nextNode
			Node nextNode=currNode.next;
			
			//make currNode.next to previous
			currNode.next=prev;
			
			prev=currNode;
			currNode=nextNode;
		}
		return prev;
	}
	
	public static Node reverseLLRecursively(Node head, Node prevNode)
	{
		Node currNode=head;
		if(currNode==null)
		{
			return prevNode;
		}
		Node nextNode=currNode.next;
		
		currNode.next=prevNode;
		
		//prev=currNode;
		return reverseLLRecursively(nextNode,currNode);
		
	}
	
	public static Node findMiddleNode(Node head)
	{
		//empty list
		if(head==null)
		{
			System.out.print("LL is empty");
			return head;
		}
		//if LL have only one node
		if(head.next==null)
		{
			return head;
		}
		
		int length=lengthofLL(head);
		int mid;
		if(length%2==0)
		{
			mid=length/2;
		}
		else
		{
			mid=(length/2)+1;
		}
		
		//we will start finding mid node
		Node temp=head;
		int i=1; //1 >> 2 >> 3 >> 4 >> 5  //length=5 mid=3
		while(i < mid)  //i=1,2
		{
			
			temp=temp.next;
			i=i+1;
		}
		
		return temp;
	}
	public static Node findMiddleNodeUsingTwoPointer(Node head)
	{
		//empty list
		if(head==null)
				{
					System.out.print("LL is empty");
					return head;
				}
		//if LL have only one node
		if(head.next==null)
				{
					return head;
				}
		Node slow=head;
		Node fast=head.next;
		while(slow !=null && fast !=null)
		{
			fast=fast.next;
			if(fast!=null)
			{
				fast=fast.next;
				slow=slow.next;
			}
		}
		return slow;
	}
	
	
	//10 20 30 40 50 60 70 80 90 
	//k=3
	//30 20 10 60 50 40 90 80 70
	public static Node reverseLLInKGroups(Node head, int kgroup)
	{
		
		if(head==null)
		{
			System.out.print("LL is empty");
			return head;
			
		}
		int length=lengthofLL(head);
		if(kgroup>length)
		{
			//System.out.print("Enter valid value of LL");
			return head;
		}
		//it means we have kgroup<length
		
		//step 1 reverse K node
		Node currNode = head;
		Node prevNode = null;
		Node nextNode=currNode.next;
		int i=0;
		while(i<kgroup)
		{
			//saving next node for referecne
			nextNode=currNode.next;
			
			//make currenode.next ppoiint to prevoiuos node
			
			currNode.next=prevNode;
			
			prevNode=currNode;
			
			currNode=nextNode;
			
			i=i+1;
		}
		
		// upto this K nodes are revsersed
		
		
		//step 2 check we have remaining node that is nextNode and reverse remaining node in K grouop
		
		
		if(nextNode !=null)
		{
			//means we have reamining node to lfet to revese node in froup
			head.next=reverseLLInKGroups(nextNode,kgroup);
		}
	
		return prevNode;
	}
	
	
	public static boolean isLLCircular(Node head)
	{  //1 2 3 4 5 6 1
		 
		Node temp = head;  //1 2 3 4 4 5 6
		while(temp.next != null)
		{
			if(temp.next==head)
			{
				return true;
			}
			temp=temp.next;
		}
		return false;
	}
	
	
}
