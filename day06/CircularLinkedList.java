package day06;

public class CircularLinkedList {
	static Node head;
	Node tail;

	class Node {
		char data;
		Node next;
		Node prev;

		public Node(char data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}

	public void AddFirst(char data) {
		Node newnode = new Node(data);
		Node temp = head;
		newnode.next = temp;
		newnode.prev = temp;
		head = tail = newnode;
	}

	public void print() {
		Node temp = head;
		do {
			System.out.print(temp.data + "<-->");
			temp = temp.next;

		}
		while (temp != null);
		System.out.print("HEAD");
		System.out.println();
	}

	public static void main(String[] args) {
		CircularLinkedList list = new CircularLinkedList();
		list.AddFirst('F');
		list.AddFirst('A');
		list.print();

	}
}
