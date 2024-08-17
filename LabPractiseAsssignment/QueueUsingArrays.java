package LabPractiseAsssignment;

public class QueueUsingArrays {
	private final int[] arr;
	private int rear;
	private int front;
	private final int size;

	public QueueUsingArrays(int sz) {
		this.size = sz;
		this.arr = new int[size];
		this.front = -1;
		this.rear = -1;
	}

	public static void main(String[] args) {
		QueueUsingArrays q = new QueueUsingArrays(3);
		q.add(2);
		q.add(56);
		q.add(63);
		q.add(22);
	    q.remove();
	    q.remove();
		q.remove();
		q.remove();
	    q.display();
	}

	public boolean isEmpty() {
		return front == -1 || rear == -1;
	}

	public boolean isFull() {
		return rear == size - 1;
	}

	public void add(int data) {
		if (isFull()) {
			System.out.println("Queue is FULL...");
			return;
		}
		if (isEmpty()) {
			front = 0;
		}
		rear++;
		arr[rear] = data;
	}

	public void remove() {
		if (isEmpty()) {
			System.out.println("Queue is EMPTY...");
			return;
		}
		if (front == rear) {
			front = -1;
			rear = -1;
		} else {
			front++;
		}
	}
	
	

	public void display() {
		if (isEmpty()) {
			System.out.println("Queue is empty.");
			return;
		}
		System.out.print("Queue elements: ");
		for (int i = front; i <= rear; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
