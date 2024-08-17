package LABQuestion;

import java.util.Scanner;

public class SchoolAssemble {
	static Node front;
	static Node rear;

	public void add(char gender) {
		Node newStudent = new Node(gender);
		if (front == null) {
			front = rear = newStudent;
			return;
		}
		Node temp = front;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newStudent;
	}

	public void Arrange() {
		if (front == null || front.next == null) {
			front = rear;
			return;
		}
		int count = 0;
		Node prev = front;// point toward head..
		Node current = prev.next;// point toward next to head..
		System.out.println();
		while (current != null) {
			if (prev.gender == current.gender) {// comparing
				count++;

			} else if (prev.gender != current.gender) {
				System.out.print(prev.gender + "-->");
				// updating...
				prev = current;// important line...
				rear = rear.next;
			}
			current = current.next;

		}

		System.out.print(rear.gender + "-->null\n");
		System.out.println("The Person on Assembly are... " + count);
	}

	public void reverse() {
		if (front == null) {
			front = rear;
			return;
		}
		Node prev = front;
		Node current = prev.next;
		System.out.println();
		while (current != null) {
			Node next = current.next;
			current.next = prev;
			// updating
			prev = current;
			current = next;
		}
		front.next = null;
		front = prev;

	}

	public void print() {
		Node temp = front;
		while (temp != null) {
			System.out.print(temp.gender + "--->");
			temp = temp.next;
		}
		System.out.print("null");
	}

	public static void main(String[] args) {
		SchoolAssemble list = new SchoolAssemble();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Gender");
		list.add('M');
		list.add('F');
		list.add('F');
		list.add('M');
		list.add('M');
		list.add('F');
		list.add('M');
		list.add('F');
		list.add('M');
		list.add('F');
		list.print();
//		list.reverse();
//		list.print();
		list.Arrange();
	}
}

class Node {
	char gender;
	Node next;

	public Node(char gender) {
		this.gender = gender;
		this.next = null;
	}
}
