

public class Main {

	public static void main(String[] args) {
		SinglyLinearLinkedList l1=new SinglyLinearLinkedList();
		l1.addFirst(40);
		l1.addFirst(30);
		l1.addFirst(20);
		l1.addFirst(10);
		l1.addLast(50);
//		l1.deleteFirst();
		l1.deleteLast();
		l1.displayList();
		int data =l1.middleNode();
		System.out.println("Middle element "+data);
	}

}