package learnLinkedListFinal;

public class Main {
	public static void main(String[] args) {
		
		Node head=null;
		LL obj= new LL();
		head=obj.insertAtBegin(head, 30);
		head=obj.insertAtBegin(head, 20);
		
		head=obj.insertAtLast(head,40);
		head=obj.insertAtLast(head,50);
		
		head=obj.insertAtLast(head,60);
		head=obj.insertAtBegin(head, 10);
		head=obj.insertAtBegin(head, 0);
	
		head=obj.insertAtLast(head,70);
		
		head=obj.insertAtIndexPosition(head, 333, 3);
		
		head=obj.insertAtIndexPosition(head, 999, obj.lengthofLL(head));
		
		head=obj.insertAtIndexPosition(head, 111, 0);
		obj.printLL(head);
		
		head=obj.deleteHeadNode(head);
		obj.printLL(head);
		
		head=obj.deleteLastNode(head);
		obj.printLL(head);
		
		head=obj.deleteNodeAtPosition(head, 3);
		obj.printLL(head);
		
//		head=obj.reverseLL(head);
//		obj.printLL(head);
//		head=obj.reverseLLRecursively(head,null);
//		obj.printLL(head);
		
		Node middleNode=obj.findMiddleNode(head);
//		obj.printLL(middleNode);
		System.out.println("MiddleNode"+middleNode.data);
		
		Node middleNod=obj.findMiddleNodeUsingTwoPointer(head);
		System.out.println("MiddleNode using two pointer method "+middleNod.data);
		
		
		head = obj.reverseLLInKGroups(head,8);
		obj.printLL(head);
		
		
		
		
		
		
		
		
	}
}
