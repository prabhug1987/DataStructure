package com.learning.linkedblockingqueue;

import java.util.LinkedList;
import java.util.List;

interface BlockingQueue<E>{
	void put(E item) throws InterruptedException;
	E take() throws InterruptedException;
	int size();
}

public class LinkedBlockingQueue<E> implements BlockingQueue<E> {

	private List<E> queue;
	private int maxSize;
	 
	public LinkedBlockingQueue(int size) {
		// TODO Auto-generated constructor stub
		this.maxSize = size;
		queue = new LinkedList<E>();
	}
	
	@Override
	public void put(E item) throws InterruptedException {
		// TODO Auto-generated method stub
		if(queue.size() == maxSize) {
			this.wait();
		}
		
		queue.add(item);
		this.notifyAll();
	}

	@Override
	public E take() throws InterruptedException {
		// TODO Auto-generated method stub
		if(queue.size() == 0) {
			this.wait();
		}
		
		this.notifyAll();
		return this.queue.remove(0);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return queue.size();
	}

		

}
