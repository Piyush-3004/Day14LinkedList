package com.blbz;

public class Uc1 {

	Node head;

	class Node {
		Object data;
		Node next;

		public Node(Object data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {

		Uc1 linkedList = new Uc1();

		linkedList.createLink();
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
