package day04;

public class ParenthesisMatchingCustomStack {
	char arr[];
	int top;
	int capacity;

	public ParenthesisMatchingCustomStack(int size) {
//		size = arr.length;
		this.capacity = size;
		arr = new char[capacity];
		this.top = -1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean empty() {
		return top == -1;
	}

	public boolean isFull() {
		return capacity > arr.length;
	}

	public void push(char data) {
		if (isFull()) {
			System.out.println("Stack OverFlow...");
		} else {
			top++;
			arr[top] = data;
		}
	}

	public void pop() {
		if (isEmpty()) {
			System.out.println("Stack Underflow...");
		} else {
			top--;
		}
	}

	public char peek() {
		if (isEmpty()) {
			System.out.println("Stack OverFlow...");
			return '\0';
		}
		System.out.println(arr[top]);
		return arr[top];
	}

	public static void main(String[] args) {
		ParenthesisMatchingCustomStack stak = new ParenthesisMatchingCustomStack(4);
		stak.push('P');
		stak.push('U');
		stak.push('S');
		stak.push('H');
		stak.peek();
	}
}
