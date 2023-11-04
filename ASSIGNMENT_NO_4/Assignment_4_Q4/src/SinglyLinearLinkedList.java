

public class SinglyLinearLinkedList {
	public class Node {
		private int data;
		private Node next;

		public Node(int value) {
			data = value;
			next = null;
		}
	}

	private Node head;
	private Node tail;

	public SinglyLinearLinkedList() {
		head = null;
		tail = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(int value) {
		Node newnode = new Node(value);
		if (isEmpty())
			head = tail = newnode;
		else {
			newnode.next = head;
			head = newnode;
		}
	}

	public void addLast(int value) {
		Node newnode = new Node(value);
		if (isEmpty())
			head = tail = newnode;
		else {
			tail.next = newnode;
			tail = newnode;
		}
	}

	public void deleteFirst() {
		if (isEmpty()) {
			System.out.println("List is Empty");
		} else {
			head = head.next;
		}
	}

	public void deleteLast() {
		if (isEmpty()) {
			System.out.println("List is Empty");
		} else if (head.next == null) {
			head = null;
			tail = null;
		} else {
			Node trav = head;
			while (trav.next.next != null) {
				trav = trav.next;
			}
			trav.next = null;
			tail = trav;
		}
	}

	public int middleNode() {
		Node fast, slow;
		fast = slow = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow.data;

	}
	
	public void reverseList()
	{
		Node t1=head;
		Node t2=head.next;
		head.next=null;
		while(head!=null)
		{
			head=t2.next;
			t2.next=t1;
			t1=t2;
			t2=head;
		}
		head=t1;

	}

	public void displayList() {
		Node trav = head;
		System.out.println("List : ");
		while (trav != null) {
			System.out.println("  " + trav.data);
			trav = trav.next;
		}
		System.out.println("");
	}
}