package day06;

public class DoublyLinkedList {
	static Dnode head;

	public void Insertatbegin(int data) {
		Dnode newnode = new Dnode(data);
		newnode.next = head;
		newnode.prev = null;
		if (head != null) {
			head.prev = newnode;
		}
		head = newnode;

	}

	public void InsertAtLast(int data) {
		Dnode newnode = new Dnode(data);
		Dnode temp = head;
		if (head == null) {
			newnode.prev = head;
			head = newnode;
			return;
		}
		while (temp.next != null) {
			temp = temp.next;

		}
		newnode.next = null;
		temp.next = newnode;
		newnode.prev = temp;

	}

	public void InsertAfter(int data, int value) {
		Dnode newnode = new Dnode(data);
		Dnode temp = head;
		while (temp.data != value) {
			temp = temp.next;

		}
		newnode.next = temp.next;
		temp.next = newnode;
		newnode.prev = temp;
		if (newnode.next != null)
			newnode.next.prev = newnode;
	}

	public void InsertBefore(int data, int value) {
		Dnode newnode = new Dnode(data);
		Dnode temp = head;
		Dnode prev = null;
		while (temp.data != value) {
			prev = temp;
			temp = temp.next;
		}
		prev.next = newnode;//imp
		newnode.next = temp;//imp
//		newnode.prev =prev.next;
//		temp.prev = newnode.next;
//		temp.prev= newnode;
//		newnode.prev = prev;
//        prev.next = newnode;
//        newnode.prev = prev;
//        newnode.next = temp;
//        temp.prev = newnode;
	}

	public void printList() {
		Dnode temp = head;
		Dnode lastnode = null;
		while (temp != null) {
			System.out.print(temp.data + "<--->");
			lastnode = temp;
			temp = temp.next;
		}
		System.out.print("null");
		System.out.println();
	}

	public void ReverseList() {
		Dnode temp = head;
		Dnode lastnode = null;
		while (temp != null) {
			lastnode = temp;
			temp = temp.next;
		}
		if (head.prev == null)
			System.out.print("null<--->");
		while (lastnode != null) {
			System.out.print(lastnode.data + "<--->");
			lastnode = lastnode.prev;
		}

		System.out.print("null");
		System.out.println();
	}

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		head = new Dnode(12);
		list.Insertatbegin(99);
		list.Insertatbegin(45);
		list.printList();
		list.ReverseList();
		list.InsertAtLast(87);
		list.printList();
		list.InsertAfter(55, 87);
		list.printList();
		list.InsertBefore(77, 55);
		list.printList();
	}

}

class Dnode {
	int data;
	Dnode next;
	Dnode prev;

	public Dnode(int data) {
		this.data = data;
		this.next = null;
		this.prev = null;
	}
}
