/*Write program to implement linear queue in which front and rear starts at 0.*/
public class LinearQueue {

	private int arr[];
	private int rear, front;
	private final int SIZE;
	public LinearQueue(int size) {
		SIZE = size;
		arr = new int[SIZE];
		front = -1;
		rear = -1;
	}
	public void push(int data) {
		rear++;
		arr[rear] = data;
	}
	
	public void pop() {
		front++;
	}
	
	public int peek() {
		return arr[front + 1];
	}
	
	public boolean isFull() {
		return rear == SIZE -1;
	}
	
	public boolean isEmpty() {
		return rear == front;
	}
}
