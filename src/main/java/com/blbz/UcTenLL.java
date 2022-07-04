package com.blbz;
public class UcTenLL {
	
	Node head;
	public class Node{
		Object data;
		Node next; 
		public Node(Object data) {
			this.data=data;
	}
		
		public void createLinkedList(){
			Node newNode = new Node(56);
			head=newNode;
			
			Node newNode1 = new Node(30);			
			head.next= newNode1;
			
			Node newNode2 = new Node(40);
			newNode1.next= newNode2;
			
			Node newNode3 = new Node(70);
			newNode2.next= newNode3;
			
		}

	
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
