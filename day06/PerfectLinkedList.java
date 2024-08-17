package day06;

class PerfectLinkedList {
	static CNode head;

	public void InsertBegin(int data) {
		CNode newnode = new CNode(data);
		newnode.next = head;
		head = newnode;

	}

	public void InsertEnd(int data) {
		CNode newnode = new CNode(data);
		CNode temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		newnode.next = temp.next;
		temp.next = newnode;

	}

	public void InsertAfter(int data, int value) {
		CNode newnode = new CNode(data);
		CNode temp = head;
		while (temp.data != value) {
			temp = temp.next;
		}
		newnode.next = temp.next;
		temp.next = newnode;

	}

	public void InsertBefore(int data, int value) {
		CNode newnode = new CNode(data);
		CNode temp = head;
		CNode prev = null;
		while (temp.data != value) {
			prev = temp;
			temp = temp.next;
		}
		newnode.next = prev.next;
		prev.next = newnode;
	}

	public void Removebegin() {
		CNode temp = head;
		temp = temp.next;
		head = temp;

	}

	public void RemoveLast() {
		CNode temp = head;
		CNode prev = null;
		while (temp.next != null) {
			prev = temp;
			temp = temp.next;
		}
		prev.next = null;
	}

	public void RemoveGiven(int data) {
		CNode temp = head;
		CNode prev = null;
		while (temp.data != data) {
			prev = temp;
			temp = temp.next;
		}
		CNode t = temp;
		prev.next = t.next;
		t.next = temp.next;

	}

	public void Print() {
		CNode temp = head;
		while (temp != null) {
			System.out.print(temp.data + "--->");
			temp = temp.next;
		}
		System.out.print("NULL");
		System.out.println();
	}

	public static void main(String[] args) {
		PerfectLinkedList list = new PerfectLinkedList();
		head = new CNode(123);
		list.InsertBegin(10);
		list.Print();
		list.InsertEnd(54);
		list.Print();
		list.InsertAfter(41, 123);
		list.Print();
		list.InsertBefore(99, 123);
		list.Print();
		list.Removebegin();
		list.Print();
		list.RemoveLast();
		list.Print();
		list.RemoveGiven(123);
		list.Print();
	}
}

class CNode {
	int data;
	CNode next;

	public CNode(int data) {
		this.data = data;
		this.next = null;
	}
}