package com.learning.linkedList;
public class LinkedListInsertion {
	
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
	
		linkedList.head = new Node(1);
		Node second  = new Node(2);
		Node third  = new Node(3);
		
		/*
		 * Now the next node of first node refers to second
		 * so they both  are linked
		 */
		linkedList.head.next = second;
		
		
		/*
		 * Now the next of second node refers to third
		 * so all three are linked
		 */
		second.next = third;

		//linkedList.printList(linkedList.head);
		
		
		
		linkedList.head = insertNodeAtFront(linkedList.head, 4);
		
		//linkedList.printList(linkedList.head);
		
		System.out.println("insert after "+ third.data);
		
		insertAfter(second, 5);
		
		linkedList.printList(linkedList.head);
		
		
		
	}
	
	public static Node insertNodeAtFront(Node head, int data){
		
		Node node = new Node(data);
		
		node.next = head;
		
		head = node;
		
		return head;
	}
	
	public static void insertAfter(Node prevNode,int data) {
		
		if(prevNode == null) {
			System.out.println("The given previous node cannot be null");
			return;
		}
		
		Node node = new Node(data);
		
		node.next = prevNode.next;
		prevNode.next = node;
	}

}
