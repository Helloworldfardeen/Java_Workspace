package LabPractiseQuestion;
public class StackUsingLikedList {
	static Node Top;

	public void push(int data) {
		Node newnode = new Node(data);
		Node temp = Top;
		newnode.next = temp;
		Top = newnode;
	}

	public void pop() {
		Node temp = Top.next;
		Top = temp;

	}

	public void peek() {
		System.out.println(Top.data);
	}

	public boolean search(int data) {
		Node temp = Top;
		while (temp.next != null) {
			temp = temp.next;
			if (data == temp.data) {
				System.out.println(true);
				return true;
			}
		}
		System.out.println(false);
		return false;
	}
 

	public void display() {
		Node temp = Top;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		if (Top == null) {
			System.err.println("Stack Underflow Exception..Empty");
		}
		System.out.print("NULL\n");
	}

	public static void main(String[] args) {
		StackUsingLikedList Slist = new StackUsingLikedList();
		Slist.push(11);
		Slist.push(92);
		Slist.push(23);
		Slist.push(254);
		Slist.push(78);
		Slist.pop();
		Slist.peek();
		Slist.search(23);
		Slist.display();
	}
}

class Node {
	int data;
	Node next;

	public Node(int d) {
		this.data = d;
		this.next = null;
	}
}