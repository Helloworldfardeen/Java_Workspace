package newAssignment;

import javax.xml.transform.Templates;

public class LinkedListAll {
	static node head;

	public void addBegin(int data) {
		node newnode = new node(data);
		node temp = head;
		newnode.next = temp;
		head = newnode;
	}

	public void addlast(int data) {
		node newnode = new node(data);
		node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newnode;
	}

	public void addAfterValue(int data, int value) {
		node newnode = new node(data);
		node temp = head;
		while (temp.data != value) {
			temp = temp.next;
		}
		newnode.next = temp.next;
		temp.next = newnode;
	}

	public void addBeforeValue(int data, int value) {
		node newnode = new node(data);
		node temp = head;
		node before = null;
		while (temp.data != value) {
			before = temp;
			temp = temp.next;
		}
//		78--->65--->8989--->1--->77--->44--->null
//		78--->65--->7474--->null
//		78--->65--->7474--->8989--->1--->77--->44--->null
		before.next = newnode;
		newnode.next = temp;

	}

	public void reverse() {
		node prevNode = head;
		node currentNode = head.next;
		while (currentNode != null) {
			node nextNode = currentNode.next;// mean head.next.next 3rd_element storing in nextNode...
			currentNode.next = prevNode; //
			// update
			prevNode = currentNode;
			currentNode = nextNode;

		}
		head.next = null;
		head = prevNode;
	}

	public void deletefirst() {
		node temp = head;
		head = null;
		head = temp.next;
	}

	public void deletelast() {
		node temp = head;
		node prev = null;
		while (temp.next != null) {
			prev = temp;
			temp = temp.next;
		}
		prev.next = null;
	}

	public void deletebetween(int value) {
		node temp = head;
		node prev = null;
		while (temp.data != value) {
			prev = temp;
			temp = temp.next;
		}
		prev.next = temp.next;
		temp = null;

	}

	public void palindrome() {
		int arr[] = new int[7];
		int count = 0;
		node temp = head;
		while (temp != null) {
			arr[count] = temp.data;
			temp = temp.next;
			count++;
		}
		System.out.println();

		if (arr[0] == arr[6] && arr[1] == arr[5] && arr[2] == arr[4]) {
			System.out.println("PALINDROME");
		}
		else {
			
			System.out.println("NOT_PALINDROME");
		}
	}

	public void print() {
		node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "--->");
			temp = temp.next;
		}
		System.out.print("null");
	}

	public static void main(String[] args) {
		LinkedListAll list = new LinkedListAll();
		head = new node(77);
		list.addBegin(1);
		list.addBegin(65);
		list.addBegin(78);
		list.addlast(44);
		list.addAfterValue(8989, 65);
		list.addBeforeValue(7474, 8989);
//		list.print();
//		78--->65--->7474--->8989--->1--->77--->44--->null
//		list.reverse();
//		list.deletefirst();
//		list.deletelast();
//		list.deletebetween(1);
		list.print();
		list.palindrome();
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