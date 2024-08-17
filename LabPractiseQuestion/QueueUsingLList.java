package LabPractiseQuestion;

public class QueueUsingLList {
	static node front;
	static node rear;

	public void add(int data) {
		node newnode = new node(data);
		node temp = front;
		while (temp.next != null) {

			temp = temp.next;
		}
		temp.next = newnode;

	}
	public void remove()
	{
		node temp = front;
		node cur= null;
		while(temp.next!=null)
		{
			cur = temp;
			temp = temp.next;
		}
		temp = null;
	}

	public void print() {
		node temp = front;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		QueueUsingLList qul = new QueueUsingLList();
		front = new node(45);
		qul.add(54);
		qul.add(23);
		qul.add(7);
		qul.remove();
		qul.print();
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
