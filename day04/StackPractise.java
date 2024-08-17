package day04;

public class StackPractise {
	int arr[];
	int top;
	int capacity;

	public StackPractise(int sz) {
		this.capacity = sz;
		arr = new int[capacity];
		this.top = -1;
	}

	public boolean IsEmplty() {
		boolean result = arr.length < 1;
		return result;
	}

	public boolean IsFull() {
		boolean result = arr.length > capacity;
		return result;
	}

	public void push(int data) {
		if (IsFull()) {
			System.out.println("Stack Overflow");
		} else {
			top++;
			arr[top] = data;
		}
	}

	public void pop() {
		if (IsEmplty()) {
			System.out.println("Stack Underflow");
		} else {
			--top;

		}

	}

	public void display() {
		for (int i = top; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		StackPractise st = new StackPractise(5);
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.pop();
		st.pop();
		st.display();

	}
}
