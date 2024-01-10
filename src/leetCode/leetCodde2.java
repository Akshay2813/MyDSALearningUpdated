package leetCode;

class ListNode {
	     int val;
	 ListNode next;
	 ListNode() 
	 {}
	 ListNode(int val) 
	 { 
		 this.val = val; 
	 }
	 ListNode(int val, ListNode next) 
	 { 
		 this.val = val; 
		 this.next = next; }
	 }

class Solution {

   
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode ansHead=null;
        ListNode ansTail=ansHead;
        int carry=0;
        while(l1 != null && l2 !=null)
        {
            int sum=l1.val + l2.val+carry;
            carry=sum/10 ;
            int digit=sum%10;
            ListNode newNode= new ListNode(digit);
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
            l1=l1.next;
			l2=l2.next;
        }
        while(l1 != null)
        {
            int sum=l1.val+carry;
            carry=sum/10;
            int digit=sum%10;
            ListNode newNode= new ListNode(digit);
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
            l1=l1.next;
        }
        while(l2 != null)
        {
            int sum = l2.val+carry;
            carry=sum/10;
            int digit=sum%10;
            ListNode newNode= new ListNode(digit);
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
			l2=l2.next;
        }
        
        while(carry != 0)
        {
            int sum=carry;
            carry=sum/10;
            int digit=sum%10;
            ListNode newNode= new ListNode(digit);
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
        return ansHead;  
    }
}




public class leetCodde2 {

	public static void main(String[] args) {
		ListNode l1 = new  ListNode(2);
		ListNode l2 = new  ListNode(4);
		ListNode l3 = new  ListNode(3);
		
		l1.next=l2;
		l2.next=l3;
		
		
		ListNode m1 = new  ListNode(5);
		ListNode m2 = new  ListNode(6);
		ListNode m3 = new  ListNode(4);
		
		m1.next=m2;
		m2.next=m3;
		
		ListNode answer = Solution.addTwoNumbers(l1,m1);
		
		ListNode temp=answer;
		while(temp !=null)
		{
			System.out.print(temp.val +" ");
			temp=temp.next;
		}
			 

	}

}
