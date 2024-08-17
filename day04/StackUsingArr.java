package day04;

public class StackUsingArr {
	int arr[];
	int capacity = 0;
	int top = -1;

	public StackUsingArr(int size) {
		capacity = size;
		arr = new int[capacity];
		top = -1;
	}

	public static void main(String[] args) {
		StackUsingArr operation = new StackUsingArr(6);
		operation.push(10);
		operation.push(25);
		operation.push(6);
		operation.push(1);
		operation.push(12);
		operation.push(0);
		operation.peek();
	}

	public void push(int item) {
		if (isFull()) {
			System.err.println("Stack Overflow");
			return;
		}
		arr[++top] = item;
	}

	public void pop() {
		if (isEmpty()) {
			System.err.println("Stack UnderFlow");
			return;
		}
		top--;
	}

	public void peek() {
		if (isEmpty()) {
			System.err.println("Stack UnderFlow");
			return;
		}
		System.out.println("Top element of the Array " + arr[top]);
	}

	boolean isEmpty() {
		return top == -1;
	}

	boolean isFull() {
		return top == capacity - 1;
	}
}
