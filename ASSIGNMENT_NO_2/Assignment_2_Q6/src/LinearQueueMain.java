

import java.util.Scanner;

public class LinearQueueMain {

	public static void main(String[] args) {
		LinearQueue q = new LinearQueue(4);
		int choice;
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Press 1 to add data in Queue");
			System.out.println("Press 2 to Pop element");
			System.out.println("Press 3 to peek element");


			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				if(q.isFull())
					System.out.println("Queue is full");
				else {
					System.out.print("Enter data : ");
					int data = sc.nextInt();
					q.push(data);
					System.out.println("Element added Successfully");
				}
				break;
			case 2:
				if(q.isEmpty())
					System.out.println("Queue is Empty");
				else
					q.pop();
				System.out.println("Element deleted successfully");
				break;
			case 3:
				if(q.isEmpty())
					System.out.println("Queue is Empty");
				else
					System.out.println("Peeked Data : " + q.peek());
				System.out.println("Peeked data successfully");
				break;

			default:
				System.out.println("Invalid choice try again......");
			}
		}while(choice != 0);
		
	}

}