package com.learning.linkedList;
public class LinkedListDeletion {
	
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
		
		//System.out.println("insert after "+ third.data);
		
		insertAfter(second, 5);
		
		//linkedList.printList(linkedList.head);
		
		
		//deleteNode(linkedList.head, 5);
		deleteNodeAt(linkedList.head, 3);	
		
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
	
	
	public static void deleteNode(Node head, int key) {
		//store head
		Node temp = head, prev = null;
		
		//If head node itself holds the key to be deleted
		if(temp !=null && temp.data == key) {
			head = temp.next;
			return;
		}
		
		
		// Search for the key to be deleted, keep track of the
        // previous node as we need to change temp.next
		while(temp!=null && temp.data != key  ) {
			
			prev = temp;
			temp = temp.next;
		}
		
		
		//IF the key was not present in the linked list
		if(temp == null)
			return;
			
		prev.next = temp.next;	
	}
	
	public static void deleteNodeAt(Node head,int position) {
		
		if(head == null) {
			return;
		}
		
		Node temp = head;
		
		if(position == 0) {
			head = temp.next;
		}
		
		
		for (int i = 0; temp!=null && i < position - 1; i++) {
			temp = temp.next;
		}
		
		if(temp == null || temp.next == null)
			return;
		
		Node next = temp.next.next;
		
		temp.next = next;
	}

}
