package Question;

public class Queue {

	int rear;
	int arr[];

	public Queue(int size) {
		this.rear = 0;
		arr = new int[size];
	}

	public boolean IsEmpty() {
		return rear == 0;
	}

	public boolean IsFull() {
		return rear == arr.length;
	}

	public void add(int item) throws Exception {
		if (IsFull()) {
			throw new Exception("Queue is Full");
		}

		arr[rear] = item;
		rear++;
	}

	public int remove() throws Exception {
		if (IsEmpty()) {
			throw new Exception("Queue is Empty...");
		}
		int front = arr[0];
		for (int i = 1; i < rear; i++) {
			arr[i - 1] = arr[i];
//				arr[i] = arr[i + 1];
		}
		rear--;
		return front;
	}

	public int peek() {
		System.out.println(arr[0]);
		return arr[0];
	}

	public void print() {
		for (int i = 0; i < rear; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("end");
	}

	public static void main(String[] args) throws Exception {
		Queue q = new Queue(5);
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.remove();
		q.print();

	}

}
/*
 * package assignment2;
 * 
 * //add() - Inserts the specified element into the queue. ... //offer() -
 * Inserts the specified element into the queue. ... //peek() - Returns the head
 * of the queue. ... //remove() - Returns and removes the head of the queue. ...
 * //poll() - Returns and removes the head of the queue public class QueuePrac {
 * int arr[]; int front; int rear; int size;
 * 
 * public QueuePrac(int size) { this.size = size; arr = new int[size];
 * this.front = -1; this.rear = -1; }
 * 
 * // enqueue public void add(int data) { front = 0; rear++; arr[rear] = data; }
 * 
 * public int peek() { front = remove(); System.out.println(arr[front]); return
 * arr[front]; }
 * 
 * public int remove() { return front++; }
 * 
 * public void display() { for (int i = front; i <= rear; i++) {
 * System.out.print(arr[i] + " "); } }
 * 
 * public static void main(String[] args) { QueuePrac Q = new QueuePrac(3);
 * Q.add(2); Q.add(12); Q.add(56); Q.remove(); Q.remove(); Q.display();
 * Q.peek(); }
 * 
 * }
 */
