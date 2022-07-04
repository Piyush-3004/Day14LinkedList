package com.blbz;

public class UcTwo {

	public static void main(String[] args) {

		UcTwo linkedList = new UcTwo();

		linkedList.addFirst(70);
		linkedList.addFirst(30);
		linkedList.addFirst(56);

		linkedList.display();

	}

	// To represent a Nodde we will ddeclaare the Nodde class having two fields,
	// data and next
	// creating its intance whichpoints to null
	Node head;

	class Node {
		Object data;
		Node next;

		public Node(Object data) {
			this.data = data;
		}
	}

	public void addFirst(Object data) {
		Node newNode = new Node(data);

		if (head == null)
			head = newNode;
		else {
			Node temp = head;
			head = newNode;
			head.next = temp;

		}
	}

//  to display traverse using t node	
	public void display() {

		if (head == null)
			System.out.println("No elements to display..");
		else if (head.next == null)
			System.out.println(head.data);
		else {
			Node temp = head;

			while (temp != null) {
				if (temp.next != null)
					System.out.print(temp.data + "==>");
				else
					System.out.print(temp.data + "\n");
				temp = temp.next;
			}
		}
	}
}
