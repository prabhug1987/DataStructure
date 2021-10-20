package com.learning.linkedList;

public class LinkedListSearch {
	
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
				
				
				linkedList.printList(linkedList.head);
				
				//System.out.println(search(linkedList.head, 5));
				System.out.println(searchRecursive(linkedList.head, 2));
		}
		
		public static boolean search(Node head, int data) {
			Node node = head;
			
			while(node !=null) {
				if(node.data == data)
					return true;
					
					node = node.next;
			}
			
			return false;
		}
		
		public static boolean searchRecursive(Node head,int data) {
			
			if(head == null)
				return false;
			
			if(head.data == data)
				return true;
			
			return searchRecursive(head.next,data);
		}

}
