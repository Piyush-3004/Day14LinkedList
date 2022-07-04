package com.blbz;

public class UcSevenLL {

	Node head;

	class Node {
		Object data;
		Node next;

		public Node(Object data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {

		UcSevenLL linkedList = new UcSevenLL();

		linkedList.createLink();
		System.out.println(linkedList.Search30());
		linkedList.display();
	}

	public void createLink() {
		Node newNode = new Node(56);
		head = newNode;
		Node newNode1 = new Node(30);
		head.next = newNode1;
		Node newNode2 = new Node(70);
		newNode1.next = newNode2;
	}

	public Object Search30() {
		Object value = 30;
		Node temp = head;
		while (temp.data != value) {
			temp = temp.next;
		}
		return temp.data;
	}

	public void deleteLast() {

		if (head == null)
			System.out.println("No elements to delete..");
		else if (head.next == null)
			head = null;
		else {
			Node temp = head;

			while (temp.next.next != null) {
				temp = temp.next;
			}

			temp.next = null;
		}
	}

	public void deleteFirst() {
		if (head == null)
			System.out.println("No elements to delete...");
		else if (head.next == null)
			head = null;
		else {

			Node temp = head.next;
			head = temp;

		}
	}

	public void addBetween56and70() {
		Node newNode2 = new Node(30);
		Node temp = head;
		Node left = temp;
		Node right = temp.next;

		left.next = newNode2;
		newNode2.next = right;

		head = temp;
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

	public void addLast(Object data) {
		Node newNode = new Node(data);

		if (head == null)
			head = newNode;
		else {
			Node temp = head;

			while (temp.next != null) {
				temp = temp.next;
			}

			temp.next = newNode;
		}
	}

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
