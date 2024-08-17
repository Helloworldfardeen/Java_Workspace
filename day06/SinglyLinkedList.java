package day06;

public class SinglyLinkedList {

	static SinglyLinkedListNode head;

	// INSERT Operation
	public void insertAtTheBeginning(int data) {
		SinglyLinkedListNode newnode = new SinglyLinkedListNode(data); // creation of a new node
		newnode.next = head;
		head = newnode;

		// Traversing the list
		SinglyLinkedListNode temp = head;
		while (temp != null) {
			System.out.print(temp.data + " , ");
			temp = temp.next;
		}
		System.out.println();
	}

	public void insertAttheEndoftheList(int data) {
		SinglyLinkedListNode newnode = new SinglyLinkedListNode(data); // creation of a new node
		if (head == null) {
			System.out.println("Empty list!!!. So the new node will be the first node in the list");
			head = newnode;
			return;
		}
		SinglyLinkedListNode temp = head;
		while (temp.next != null) { // this iterates till the last node in the list
			temp = temp.next;
		} // at the end of this loop we would have reached the last node of the list
		temp.next = newnode;
		return;
	}

	// the variable 'value' indicates the node data after which the new node is to
	// be inserted
	public void insertAfteraGivenNode(int data, int value) {
		SinglyLinkedListNode newnode = new SinglyLinkedListNode(data); // creation of a new node
		if (head == null) {
			head = newnode;
		}
		SinglyLinkedListNode temp = head;

		while (temp.next != null && temp.data != value) {
			temp = temp.next;
		}
		newnode.next = temp.next; // new node connects itself to the list
		temp.next = newnode; // the list includes the new node into it
		return;
	}

	public void insertBeforeaGivenNode(int data, int value) {
		SinglyLinkedListNode newnode = new SinglyLinkedListNode(data); // creation of a new node
		if (head == null) {
			head = newnode;
			return;
		}
		SinglyLinkedListNode temp = head;
		SinglyLinkedListNode prev = null;
		while (temp.next != null && temp.data != value) {
			prev = temp; // this previous keeps track of the node just before the temp node
			temp = temp.next;
		} // at the end of iteration (a) we may be at the end of the list or (b) we would
			// have located the element we are looking for
		newnode.next = temp;
		prev.next = newnode;

		/*
		 * To insert a node after the 7th node int count = 0; while(temp.next!=null) {
		 * count++; if(count==7) { break; } temp = temp.next; } newnode.next =
		 * temp.next; temp.next = newnode;
		 * 
		 */
		return;

	}

	// DELETE operation on a list
	public void deleteTheFirstNode() {
		if (head == null) {
			System.out.println("empty list. nothing to delete");
			return;
		}
		SinglyLinkedListNode temp = head;
		head = head.next;
		temp = null;
		return;
	}

	public void deleteTheLastNode() {
		if (head == null) { // scenario: where there is no node in the list
			System.out.println("nothing to delete because list is empty");
			return;
		}
		if (head.next == null) { // scenario: where only one node exists in the list
			head = null;
			return;
		}
		SinglyLinkedListNode temp = head;
		SinglyLinkedListNode prev = null;
		while (temp.next != null) {
			prev = temp;
			temp = temp.next;
		} // end of this iteration the 'prev' will be at the last-but-one node
		prev.next = null;
		return;
	}

	public void deleteaNodeinbetween(int value) {
		if (head == null) { // scenario: where there is no node in the list
			System.out.println("nothing to delete because list is empty");
			return;
		}
		if (head.next == null) { // scenario: where only one node exists in the list
			head = null;
			return;
		}
		SinglyLinkedListNode temp = head;
		SinglyLinkedListNode prev = null;
		while (temp.next != null && temp.data != value) {
			prev = temp;
			temp = temp.next;
		} // at the end of this loop, we either exhaust the list or locate the node to be
			// deleted
		if (temp.data == value) {
			prev.next = temp.next; // effectively the node got removed the list at this line
			temp.next = null;
		} else {
			System.out.println("the value not present in the list");
		}
		return;
	}

	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		head = new SinglyLinkedListNode(10);

		sll.insertAtTheBeginning(5);
		sll.insertAtTheBeginning(50);

	}

}

class SinglyLinkedListNode {
	int data;
	SinglyLinkedListNode next;

	SinglyLinkedListNode(int data) {
		this.data = data;
		this.next = null;
	}
}
