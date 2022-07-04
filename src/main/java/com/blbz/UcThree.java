package com.blbz;

public class UcThree {

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

		UcThree linkedList = new UcThree();

		linkedList.addLast(56);
		linkedList.addLast(30);
		linkedList.addLast(70);

		linkedList.display();

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

}
