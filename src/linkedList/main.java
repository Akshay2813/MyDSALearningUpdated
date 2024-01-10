package linkedList;

public class main {

	public static void main(String[] args) {

		//creating node by calling child class that is LinkedList
//		LinkedList first = new LinkedList(10);
//		LinkedList second = new LinkedList(20);
//		LinkedList third = new LinkedList(30);
		
		//creating LinkedList manaually
//		first.next=second;
//		second.next=third;
//		
//		
//		//printLinkedLL passing node as first which is head
//		first.printLLIfHeadIsGiven(first);;
//		
//		
//		//creating node by calling parent class that is Node
//		Node one=new Node(300);
//		Node two=new Node(400);
//		Node three=new Node(500);
		
		//creating LinkedList mnaually
//		one.next=two;
//		two.next=three;
//		
//		LinkedList list= new LinkedList();
//		list.printLLIfHeadIsGiven(one);
//		
			
	//printLinkedLL passing node as first which is head
		LinkedList l= new LinkedList(25);
		
		
		l.insertNodeAtHeadIfHeadIsNotGiven(30);
		l.insertNodeAtHeadIfHeadIsNotGiven(20);
		l.insertNodeAtHeadIfHeadIsNotGiven(10);

		l.printLLIfHeadIsNotGiven();
		
		l.insertNodeAtTailIfHeadIsNotGiven(40);
		l.insertNodeAtTailIfHeadIsNotGiven(50);
		
		l.printLLIfHeadIsNotGiven();
		
		System.out.println(l.data);
		l.insertAtPosition(2, l, 500);
		
		l.printLLIfHeadIsNotGiven();
		
		
		
		
	
	

	
		
		
		
		
		

	}

}
