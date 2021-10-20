package com.learning.linkedList;

import java.util.HashSet;

public class DetectLoop {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		
		linkedList.head = new Node(1);
		Node second  = new Node(2);
		Node third  = new Node(3);
		Node fourth  = new Node(4);
		Node fifth  = new Node(5);
		
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
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = second;

		System.out.println(detectLoop(linkedList.head));
		System.out.println(detectLoop1(linkedList.head));
	}
	
	static boolean detectLoop(Node head){
		HashSet hash = new HashSet<Node>();
		Node temp = head;
		while(temp!= null) {
			if(hash.contains(head)) {
				return true;
			}
			
			hash.add(temp);
			temp = temp.next;
		}
		
		return false;
	}
	
	static int detectLoop1(Node head)
    {
        Node slow_p = head, fast_p = head;
        while (slow_p != null && fast_p != null && fast_p.next != null) {
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;
            if (slow_p == fast_p) {
                System.out.println("Found loop");
                return 1;
            }
        }
        return 0;
    }
}
