package LabPractiseAsssignment;

public class CircularQueue {
	int head;
	int tail;
	int arr[];
	int size;

	public CircularQueue(int size) {
		this.head = this.tail = 0;
		this.size = size;
		arr = new int[size];
	}

	public boolean isEmpty() {
		
		return tail == head;
	}

	public boolean isFull() {
		return tail == arr.length;// check
	}

	public void Add(int item) {
		if (isFull()) {
			System.out.println("Q is Full");
		}
		tail= tail  % arr.length;
		arr[tail] = item;
		tail++;
		System.out.println(tail);
	    size++;	
	}

	public void Remove() {
		if (!isEmpty()) {
			System.out.println("Q is Empty");
		}
        int removed = arr[head];
        head = head%arr.length;
        size--;
        

	}

	public void print() {
		for (int i = head; i < tail; i++)// imp
		{
			System.out.print(arr[i] + "  ");
		}

	}
	public static void main(String[] args) {
     CircularQueue cq = new CircularQueue(3);
     cq.Add(2);
     cq.Add(23);
     cq.Add(223);
     cq.Add(0);
     cq.print();
	}
}
