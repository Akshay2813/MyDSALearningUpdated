package learnLinkedListFinal;
import java.util.*;  
public class SimpleObj {
	
	public static Boolean isLoopePresent(Node head)
	{
		HashMap<Node,Boolean> m=new HashMap<>();
		//HashMap does not maintain order while iterating
		Node temp=head;
		while(temp !=null)
		{
			if(m.containsKey(temp))
			{
				return true;
			}
			m.put(temp, true);
			temp=temp.next;
		}
//		System.out.print(m);
		System.out.println();
		return false;
	}
	
	public static Boolean isLoopePresentUsingTwoPointer(Node head)
	{
		Node slow = head;
		Node fast = head;
		while(fast != null)
		{
			fast=fast.next;
			if(fast != null )
			{
				fast=fast.next;
				slow=slow.next;	
			}
			
			if(fast==slow)
			{
				return true;
			}
			
			
		}
		return false;
	}

	public static Node startingPointofLoope(Node head)
	{
		Node slow=head;
		Node fast=head;
		
		while(fast!=null)
		{
			fast=fast.next;
			if(fast != null)
			{
				fast=fast.next;
				slow=slow.next;
			}
			if(fast==slow)
			{
				slow=head;
				break;
			}
		}
		while(fast != slow)
		{
			fast=fast.next;
			slow=slow.next;
		}
		return slow;
	}
	
	public static Node removingStartingPointofNode(Node head)
	{
		Node slow=head;
		Node fast=head;
		
		while(fast!=null)
		{
			fast=fast.next;
			if(fast != null)
			{
				fast=fast.next;
				slow=slow.next;
			}
			if(fast==slow)
			{
				slow=head;
				break;
			}
		}
		Node prev = fast;
		while(fast != slow)
		{
			prev=fast;
			fast=fast.next;
			slow=slow.next;
		}
		prev.next=null;
		return slow;
	}
	
	public static Node reverseLL(Node head)
	{
		Node prev=null;
		Node curr=head;
		Node nextNode=curr.next;
		while(curr !=null)
		{
			nextNode=curr.next;
			curr.next=prev;
			
			prev=curr;
			curr=nextNode;
		}
		return prev;
	}
	public static Boolean isLLPalindrome(Node head)
	{
		//step 1 find mid
		Node slow=head;
		Node fast=head.next;
		while(fast != null)
		{
			fast=fast.next;
			if(fast != null)
			{
				fast=fast.next;
				slow=slow.next;
			}
		}
		Node midNode=slow;
		
		//step 2 reverse LL midNode+1 from next of midNode upto last
		
		Node reversedLLHead=reverseLL(midNode.next);
		
		midNode.next=reversedLLHead;
		
		Node temp1=head;
		Node temp2=reversedLLHead;
		
		while(temp2 !=null)
		{
			if(temp1.data != temp2.data)
			{
				return false;
			}
			temp1=temp1.next;
			temp2=temp2.next;
		}
		return true;
		
	}
	public static Node removeDuplicateFromSortedLL(Node head)
	{
		if(head==null)
		{
			System.out.println("LL is empty");
			return head;
		}
		if(head.next==null)
		{
			System.out.println("LL is contains empty");
			return head;
		}
		Node curr=head;
		while(curr != null && curr.next != null)
		{
			if(curr.data==curr.next.data)
			{
				Node temp=curr.next;
				curr.next=curr.next.next;
				temp.next=null;
			}
			else
			{
				curr=curr.next;
			}
			
			
		}
		return head;
	}
	
	public static Node sortZeroOneTwoInLL(Node head)
	{
		//this approach modify data
		
		int zeroCount=0;
		int oneCount=0;
		int twoCount=0;
		
		Node temp=head;
		
		while(temp != null)
		{
			
			if(temp.data==0)
			{
				zeroCount=zeroCount+1;
				
			}
			if(temp.data==1)
			{
				oneCount=oneCount+1;
			
			}
			if(temp.data==2)
			{
				twoCount=twoCount+1;
			}
			temp=temp.next;
		}
		
		temp=head;
		while(zeroCount>0)
		{
			temp.data=0;
			temp=temp.next;
			zeroCount=zeroCount-1;
		}
		while(oneCount>0)
		{
			temp.data=1;
			temp=temp.next;
			oneCount=oneCount-1;
		}
		while(twoCount>0)
		{
			temp.data=2;
			temp=temp.next;
			twoCount=twoCount-1;
		}
		return head;
	}
	
	public static Node sortZeroOneTwoInLLBetterWay(Node head)
	{
		
		//create dummy Nodes
		Node zeroHead = new Node(-1);
		Node oneHead = new Node(-1);
		Node twoHead = new Node(-1);
		
		Node zeroTail = zeroHead;
		Node oneTail = oneHead;
		Node twoTail = twoHead;
		
		
		Node curr= head;
		
		while(curr != null)
		{
			if(curr.data ==0)	
			{
				Node temp=curr;
				curr=curr.next;
				temp.next=null;
				zeroTail.next=temp;
				zeroTail=temp;
			}
			else if(curr.data ==1)	
			{
				Node temp=curr;
				curr=curr.next;
				temp.next=null;
				oneTail.next=temp;
				oneTail=temp;
			}
			else if(curr.data ==2)	
			{
				Node temp=curr;
				curr=curr.next;
				temp.next=null;
				twoTail.next=temp;
				twoTail=temp;
			}	
		}
		//now we get like for example  -1>>0>>0   -1>>1>>1  -1>>2>>2
		
		//now we have to remove dummynode head and join node
		
		Node temp=oneHead;
		oneHead=oneHead.next;
		temp.next=null;
		
		temp=twoHead;
		twoHead=twoHead.next;
		temp.next=null;
		
		if(oneHead != null)
		{
			//ones LL is not empty
			zeroTail.next=oneHead;
			if(twoHead != null)
			{
				//twos LL is not empty
				oneTail.next= twoHead;
			}
		}
		else
		{
			//ones LL is  empty

			if(twoHead != null)
			{
				//twos LL is not emptys
				zeroTail.next= twoHead;
			}
		}
		temp=zeroHead;
		zeroHead=zeroHead.next;
		temp.next=null;
		
		return zeroHead;
	}
	
	
	public static Node reverseLLpractice(Node head)
	{
		Node prev=null;
		
		Node curr=head;
		Node nextNode=curr.next;
		
		while(curr != null)
		{
			nextNode=curr.next;
			curr.next=prev;
			
			prev=curr;
			curr=nextNode;
			
		}
		
		return prev;
	}
	public static Node addTwoNumbersinLL(Node head1, Node head2)
	{
		Node ansHead=null;
		Node ansTail=ansHead;
		int carry=0;
		
		//Step 1 reverse both given LL
		
		head1= reverseLLpractice(head1);
		head2= reverseLLpractice(head2);
		
//		System.out.println("Head1==");
//		LL.printLL(head1);
//		
//		System.out.println("Head2==");
//		LL.printLL(head2);
		
		while(head1 != null && head2 != null)
		{
			int sum = carry+head1.data+head2.data;
			
			int digit = sum%10;  
			carry = sum/10;
			
			Node newNode=new Node(digit);
			if(ansHead == null)
			{
				ansHead=newNode;
				ansTail=newNode;
			}
			else
			{
				ansTail.next=newNode;
				ansTail=newNode;
			}	
			
			head1=head1.next;
			head2=head2.next;
		}
		
		//if head1 length > head2 length 
		//means head1 still have some element
		while(head1 != null)
		{
			int sum = carry+head1.data;
			
			int digit = sum%10;  
			carry = sum/10;
			
			Node newNode=new Node(digit);
			
			if(ansHead == null)
			{
				ansHead=newNode;
				ansTail=newNode;
			}
			else
			{
				ansTail.next=newNode;
				ansTail=newNode;
			}	
			head1=head1.next;
		}
//		
//		
//		//if head2 length > head1 length 
//		//means head2 still have some element
//
		while(head2 != null)
		{
			int sum = carry+head2.data;
			
			int digit = sum%10;  
			carry = sum/10;
			
			Node newNode=new Node(digit);
			
			if(ansHead == null)
			{
				ansHead=newNode;
				ansTail=newNode;
			}
			else
			{
				ansTail.next=newNode;
				ansTail=newNode;
			}	
			head2=head2.next;
		}
		
		while(carry != 0)
		{
			int sum = carry;
			
			int digit = sum%10;  
			carry = sum/10;
			
			Node newNode=new Node(digit);
			
			if(ansHead == null)
			{
				ansHead=newNode;
				ansTail=newNode;
			}
			else
			{
				ansTail.next=newNode;
				ansTail=newNode;
			}	
			
		}
		
		ansHead=reverseLLpractice(ansHead);
		
		return ansHead;
	}
	public static void main(String[] args) {
		
		
//		Node first=new Node(10);
//		Node second=new Node(20);
//		Node third=new Node(30);
//		Node fourth=new Node(40);
//		Node fifth=new Node(50);
//		Node six=new Node(60);
//		Node seven=new Node(70);
//		Node eight=new Node(80);
//		Node nine=new Node(90);
//		
//		first.next=second;
//		second.next=third;
//		third.next=fourth;
//		fourth.next=fifth;
//		fifth.next=six;
//		six.next=seven;
//		seven.next=eight;
//		eight.next=nine;
//		
//		LL.printLL(first);
		//creting loope
	//	nine.next=fourth;
		
		//LL.printLL(first);
		
		System.out.println();
//		if(isLoopePresent(first))
//		{
//			System.out.println("Loope is present");
//		}
//		else
//		{
//			System.out.println("Loope is Not present");
//		}
		
		//isLoopePresentUsingTwoPointer
//		if(isLoopePresentUsingTwoPointer(first))
//		{
//			System.out.println("Loope is present");
//		}
//		else
//		{
//			System.out.println("Loope is Not present");
//		}
//		
//		Node startingPoint = startingPointofLoope(first);
//		System.out.println(startingPoint.data);
//		
//		removingStartingPointofNode(first);
//		LL.printLL(first);
		
		
//		Node one=new Node(10);
//		Node two=new Node(20);
//		Node three=new Node(30);
//		Node four=new Node(30);
//		Node five=new Node(20);
//		Node six=new Node(10);
//
//		
//		
//		one.next=two;
//		two.next=three;
//		three.next=four;
//		four.next=five;
//		five.next=six;
//		LL.printLL(one);
//		System.out.println(isLLPalindrome(one));
		
		
//		Node one=new Node(0);
//		Node two=new Node(10);
//		Node three=new Node(10);
//		Node four=new Node(10);
//		Node five=new Node(20);
//		Node six=new Node(20);
//
//		
//		
//		one.next=two;
//		two.next=three;
//		three.next=four;
//		four.next=five;
//		five.next=six;
//		LL.printLL(one);
//		
//		Node head=removeDuplicateFromSortedLL(one);
//		
//		LL.printLL(head);
		
		
//		Node one=new Node(2);
//		Node two=new Node(2);
//		Node three=new Node(1);
//		Node four=new Node(1);
//		Node five=new Node(1);
//		Node six=new Node(0);
//
//		
//		
//		one.next=two;
//		two.next=three;
//		three.next=four;
//		four.next=five;
//		five.next=six;
//	
//		
//		//sortZeroOneTwoInLL
//		LL.printLL(one);
//		
//		Node head=sortZeroOneTwoInLLBetterWay(one);
//		LL.printLL(head);
		
		
		Node head1=new Node(9);
        Node second1=new Node(9);
        
        head1.next=second1;
        
        LL.printLL(head1);
        
		Node head2=new Node(9);
		Node second2=new Node(9);
		Node third2=new Node(9);
		
		head2.next=second2;
        second2.next=third2;
		
		LL.printLL(head2);
		
		Node ansHead = addTwoNumbersinLL(head1,head2);
		
		
	//	head2=reverseLLpractice(head2);
		
		
		LL.printLL(ansHead);  
		
		
		
		
		
		
	}

}
