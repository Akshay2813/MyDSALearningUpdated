package leetCode;

public class L_139_LinkedListCycle {
	
	 public boolean hasCycle(ListNode head) {

	        ListNode slow = head;
	        ListNode fast = head;

	        while(fast != null)
	        {
	            fast=fast.next;
	            if(fast != null)
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
