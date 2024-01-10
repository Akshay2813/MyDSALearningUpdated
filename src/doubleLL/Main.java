package doubleLL;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node head=null;
		DoubleLL dObj=new DoubleLL();
		head = dObj.insertNodeAtFirstInDoubleLL(head,30);
		head = dObj.insertNodeAtFirstInDoubleLL(head,20);
		
		head=dObj.insertNodeAtLastInDoubleLL(head, 40);
		head=dObj.insertNodeAtLastInDoubleLL(head, 50);
		
		
		head = dObj.insertNodeAtFirstInDoubleLL(head,10);
		
		dObj.printDoubleLL(head);
		
		head=dObj.insertNodeAtLastInDoubleLL(head, 60);
		
		dObj.printDoubleLL(head);
		
//		int length = dObj.lengthOfDoubleLL(head);
//		System.out.print(length);
		
		head=dObj.insertNodeAtPositionInDoubleLL(head, 666, 2);
		
		head=dObj.insertNodeAtPositionInDoubleLL(head, 111, 0);
		
		int length = dObj.lengthOfDoubleLL(head);
		
		head=dObj.insertNodeAtPositionInDoubleLL(head, 999,length );
		
		
		dObj.printDoubleLL(head);
		
		head=dObj.deleteFirstNode(head);
		dObj.printDoubleLL(head);
		
		head=dObj.deleteNodeAtPostion(head, 2);
		dObj.printDoubleLL(head);

	}

}
