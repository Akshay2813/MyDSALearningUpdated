package leetCode;

class ListNode1 {

	ListNode1 next;
	int data;

	ListNode1() {

	}

	ListNode1(int data) {
		this.data = data;
	}

	ListNode1(int data, ListNode1 next) {
		this.data = data;
		this.next = next;
	}

}

public class L_21_MergeTwoSortedLists {

	public static ListNode1 mergeTwoLists(ListNode1 list1, ListNode1 list2) {
		ListNode1 ansHead = null;
		ListNode1 ansTail = ansHead;

		while (list1 != null && list2 != null) {
			if (list1.data <= list2.data) {
				ListNode1 newNode = new ListNode1(list1.data);
				if (ansHead == null) {
					ansHead = newNode;
					ansTail = newNode;

				} else {
					ansTail.next = newNode;
					ansTail = newNode;
				}

				list1 = list1.next;
			} else {
				ListNode1 newNode = new ListNode1(list2.data);
				if (ansHead == null) {
					ansHead = newNode;
					ansTail = newNode;

				} else {
					ansTail.next = newNode;
					ansTail = newNode;
				}
				list2 = list2.next;
			}
		}

		while (list1 != null) {
			ListNode1 newNode = new ListNode1(list1.data);
			if (ansHead == null) {
				ansHead = newNode;
				ansTail = newNode;

			} else {
				ansTail.next = newNode;
				ansTail = newNode;
			}

			list1 = list1.next;

		}
		
		while (list2 != null) {
			ListNode1 newNode = new ListNode1(list2.data);
			if (ansHead == null) {
				ansHead = newNode;
				ansTail = newNode;

			} else {
				ansTail.next = newNode;
				ansTail = newNode;
			}

			list2 = list2.next;

		}
		return ansHead;
	}

	public static void printLL(ListNode1 head) {
		ListNode1 temp = head;
		while (temp != null) {
			System.out.print(temp.data + " >>> ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode1 first = new ListNode1(1);
		ListNode1 second = new ListNode1(2);
		ListNode1 third = new ListNode1(4);

		first.next = second;
		second.next = third;

		ListNode1 fourth = new ListNode1(1);
		ListNode1 fifth = new ListNode1(3);
		ListNode1 sixth = new ListNode1(4);

		fourth.next = fifth;
		fifth.next = sixth;

		ListNode1 head = mergeTwoLists(first, fourth);

		printLL(first);
		printLL(fourth);
		printLL(head);

	}

}
