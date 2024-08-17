package day05;

//under Construction.... 
//bro so kindly practise it... 
public class implementQueueNew {
	static class Queue {
		static int size;
		static int rear = -1;
		static int front = -1;
		static int arr[];

		public Queue(int size) {
			this.size = size;
			arr = new int[size];

		}

		public boolean isEmpty() {
			return rear == 0;
		}

		public boolean isfull() {
			return rear == arr.length;
		}

		// add
		public void enqueue(int data) {
			if (isfull()) {
				System.err.println("Queue Full");
			} else {
				rear++;
				arr[rear] = data;

			}
		}

		// remove
		public void dequeue() {
			if (isEmpty()) {
				System.err.println("Queue Empty");
			}
			int front = arr[0];
			for (int i = 0; i < rear; i++) {
				arr[i - 1] = arr[i];
			}
			rear--;
		}

		public void display() {
			for (int i = 0; i < size; i++) {
				System.out.println(arr[i] + " ");
			}
		}

		public static void main(String[] args) {
			Queue q = new Queue(3);
			q.enqueue(1);
			q.enqueue(2);
			q.enqueue(3);
			q.enqueue(4);
			q.display();
			q.dequeue();
			q.dequeue();
			q.display();
		}
	}
}