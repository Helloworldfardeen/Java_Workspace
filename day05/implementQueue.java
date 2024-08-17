package day05;

public class implementQueue {

	static int[] arr = new int[2];

	static int front = -1; // dequeue happens at the front
	static int rear = -1; // enqueue happens at the rear

	// to insert elements into the queue
	// check for overflow condition
	void enqueue(int data) {
		if (rear == arr.length - 1) {
			System.out.println("Queue is full, will result in overflow");
			return;
		} else {
			if (front == -1 && rear == -1) { // if true, implies queue is empty
				front = 0;
				rear = 0;
			} else {
				rear++; // increment rear so that new data can be added at the rear
			}
			arr[rear] = data;
			System.out.println("element " + data + " added to the queue");
		}
	}

	void dequeue() {
		if (front == -1 || front > rear) {
			System.out.println("Queue Empty. Dequeue can't be performed.");
			return;
		}
		if (front == rear) { // if true, implies only one element is present in the array
			front = -1;
			rear = -1;
		} else {
			front++;
		}
	}
	void dis()
	{
		if (front == -1) {
			System.err.println("Queue is empty.");
			return;
		}
		System.out.print("Queue elements: ");
		for (int i = front; i <= rear; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		implementQueue Q = new implementQueue();
		Q.enqueue(2);
		Q.enqueue(8);
		Q.dequeue();
		Q.dequeue();
		Q.dis();
		Q.enqueue(88);
		Q.enqueue(55);
        
//         Q.dequeue(55);
//         Q.dequeue(88);
//         Q.dequeue(2);
	}

}
