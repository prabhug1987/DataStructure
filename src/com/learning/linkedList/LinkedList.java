package com.learning.linkedList;

public class LinkedList {
	
	Node head;
	
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
			
			printList(linkedList.head);
					
					
	}
	
	static void printList(Node head) {
		Node n = head;
		while(n!=null) {
			System.out.println(n.data);
			n = n.next;
		}
	}

}
