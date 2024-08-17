package day06;

public class MySingleLinkedList {
	static node head;

	public void AddAtBegin(int data) {
		node newnode = new node(data);
//		newnode.next = head;// newnode.next suro mai null ko point krtahoga to us ko hum head ko point krwa dege
//		head = newnode;// newnode ke jo value hai usko hum head bnadege....
		node currentnode = head;
		while (currentnode != null) {
			System.out.print(currentnode.data + "-->");
			currentnode = currentnode.next;
		}
		System.out.print("Null");
		System.out.println();
	}

	public void AddAtEnd(int data) {
		node newnode = new node(data);
		node currentnode = head;
		if (head == null) {
			System.err.println("List Is Empty!!!");
			head = newnode;
			return;
		}
		while (currentnode.next != null) {
			currentnode = currentnode.next;

		}
		currentnode.next = newnode;

	}

	public void AddAfterGivenNode(int data, int element) {
		node newnode = new node(data);
		node currentnode = head;
		node prev;
		if (head == null) {
			System.err.println("List Is Empty!!");
			head = newnode;
			return;
		}
		while (currentnode.data != element) {
			currentnode = currentnode.next;
		}
		newnode.next = currentnode.next;// tread ko bandne ke lia hai bhai loogo ...
		currentnode.next = newnode; // newnode ko connect krne ke lia hai bhai loogo ...
	}

	public void AddBeforeGivenNode(int data, int element) {
		node addnode = new node(data);
		node temp = head;
		node prev = null;
		if (head == null) {
			System.err.println("List Is Empty!!");
			head = addnode;
			return;
		}
		while (temp.data != element) {
			prev = temp;
			temp = temp.next;
		}
		addnode.next = temp;
		prev.next = addnode;

	}

	public void removeFirst() {
		if (head == null) {
			System.err.println("List Is Empty!!");
			return;
		}
		node temp = head; // head ko temp ko assign kra dia
		head = head.next; // head ko agey bdha dia fr
		temp = null; // temp null kr dia...
	}

	public void removeLast() {
		if (head == null) {
			System.err.println("List Is Empty!!");
			return;
		} else if (head.next == null) {
			System.err.println("List has head Only !!");
			return;
		} else {
			node temp = head;
			node prev = null;
			while (temp.next != null) {
				prev = temp;
				temp = temp.next;
			}
			prev.next = null;
		}
	}

	public void removeGivenNode(int element) {
		if (head == null) {
			System.err.println("List Is Empty!!");
			return;
		} else if (head.next == null) {
			System.err.println("List has head Only !!");
			return;
		} else {
			node temp = head;
			node prev = null;
			node temp2 = null;
			while (temp.data != element) {
				prev = temp;//
				temp = temp.next;
			}
			if (temp.data == element) {
				prev.next = temp.next; // effectively the node got removed the list at this line
				temp.next = null;
			} else {
				System.out.println("the value not present in the list");
			}

		}
	}

	public void reverseList() {
		node temp = head;
		node prev = null;

	}

	public void printlist() {
		node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;

		}
		System.out.print("Null");
		System.out.println();
	}

	public static void main(String[] args) {
		MySingleLinkedList list = new MySingleLinkedList();
		head = new node(78);
		list.AddAtBegin(10);
		list.AddAtBegin(12);
//		list.AddAtEnd(45);
//		list.AddAtEnd(5);
//		list.AddAtBegin(1);
//		list.printlist();
//		list.AddAfterGivenNode(555, 78);
//		list.AddBeforeGivenNode(41, 12);
//		list.removeFirst();
//		list.removeLast();
//		list.printlist();
//		list.removeGivenNode(555);
//		list.printlist();
//		list.reverseList();
//		list.printlist();

	}
}

class node {
	int data;
	node next;

	public node(int data) {
		this.data = data;
		this.next = null;

	}
}