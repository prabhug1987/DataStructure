package com.learning.lru;

import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class LRUCache {

	static Deque<Integer> dq;
	static HashSet<Integer> map;
	static int size;

	public LRUCache(int n) {
		this.dq = new LinkedList<>();
		this.map = new HashSet<>();
		this.size = n;
	}

	public void refer(int x) {
		if (!map.contains(x)) {
			if (dq.size() == size) {
				int last = dq.removeLast();
				map.remove(last);
			}
		} else {
			int index = 0, i = 0;

			Iterator<Integer> itr = dq.iterator();
			while (itr.hasNext()) {
				if (itr.next() == x) {
					index = i;
					break;
				}
				i++;
			}
			dq.remove(index);
		}

		dq.push(x);
		map.add(x);
	}

	public void display() {
		Iterator<Integer> itr = dq.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next() + " ");
		}
	}
	
	public static void main(String args[]) {
			LRUCache ca = new LRUCache(4);
			ca.refer(1);
			ca.refer(2);
			ca.refer(3);
			ca.refer(1);
			ca.refer(4);
			ca.refer(5);
			ca.display();
			
	}
}
