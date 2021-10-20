package com.learning.queue;

import java.util.NoSuchElementException;

public class Queue {
	
	
	int front;
	int rear;
	int size;
	int len;
	
	int[] queue;
	
	public Queue(int size) {
		// TODO Auto-generated constructor stub
		this.size = size;
		this.len = 0;
		this.front = -1;
		this.rear = -1;
		this.queue = new int[size];
	}
	
	public boolean isEmpty() {
		return front == -1;
	}
	
	public boolean isFull() {
		return  front == 0 && rear == size - 1;
	}
	
	public int getSize() {
		return len;
	}
	
	public void push(int data) {
		if(rear == -1) {
			front = 0;
			rear = 0;
			queue[rear] = data;
		}
		else if (rear+1 >= size) {
			throw new NoSuchElementException("Overflow Exception");
		}
		else if(rear+1 < size) 
			queue[++rear] = data;
		
		len++;
		
	}
	
	public int pop() {
		
		if(isEmpty()) {
			throw new NoSuchElementException("Underflow Exception");
		}else {
			len--;
			int element = queue[front];
			if(front == rear) {
				front = -1;
				rear = -1;
			}else {
				front++;
			}
			
			return element;
		}
	}
	
	public int peek() {
	
		if(isEmpty())
			throw new NoSuchElementException("Underflow Exception");
		
		return queue[front];
	}
	
	public void display() {
		System.out.println("\n Queue = ");
		if(len == 0) {
			System.out.println("Empty \n");
			return;
		}
		
		for (int i = front; i <= rear; i++) {
			System.out.println(queue[i]);
			
		}
	}

}
