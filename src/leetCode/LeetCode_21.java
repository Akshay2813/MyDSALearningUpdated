package leetCode;


/*
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by
 splicing together the nodes of the first two lists.

Return the head of the merged linked list.

Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
 */
public class LeetCode_21 {

	
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ansHead = null;
        ListNode ansTail = ansHead;


        while (list1 !=null && list2 !=null)
        {
            if(list1.val <= list2.val )
            {
                  ListNode newNode= new ListNode(list1.val);
                  if(ansHead==null)
                  {
                      ansHead=newNode;
                      ansTail=newNode;
                  }
                  else
                  {
                     ansTail.next=newNode;
				     ansTail=newNode;
                  }
                  list1=list1.next;
            }
            else
            {
                ListNode newNode= new ListNode(list2.val);
                if(ansHead==null)
                  {
                    ansHead=newNode;
                    ansTail=newNode;
                  }
                else
                  {
                    ansTail.next=newNode;
                    ansTail=newNode;             
                  }
                list2=list2.next;
            }
        } 
         while (list1 !=null)
         {
            ListNode newNode= new ListNode(list1.val);
            if(ansHead==null)
                {
                    ansHead=newNode;
                    ansTail=newNode;
                    
                }
            else
                {
                   ansTail.next=newNode;
				   ansTail=newNode;
                }
            list1=list1.next;

         }

         while (list2 !=null)
         {
            ListNode newNode= new ListNode(list2.val);
            if(ansHead==null)
                {
                    ansHead=newNode;
                    ansTail=newNode;
                    
                }
            else
                {
                   ansTail.next=newNode;
				   ansTail=newNode;
                }
            list2=list2.next;
            
         }
        return ansHead;



        
        
    }
	public static void main(String[] args) {

	}

}
