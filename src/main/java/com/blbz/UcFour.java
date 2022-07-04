package com.blbz;

public class UcFour {

	Node head;

	public class Node {
		Object data;
		Node next;

		public Node(Object data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UcFour linkedList = new UcFour();

		linkedList.createNode56();
		linkedList.createNode70();
		linkedList.addBetween56and70();
		linkedList.display();

	}

	public void createNode56() {
		Node newNode = new Node(56);
		head = newNode;
	}

	public void createNode70() {
		Node newNode1 = new Node(70);
		head.next = newNode1;
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
