package com.learning.stack;

import java.util.NoSuchElementException;

public class Stack {
	int arr[];
	int top,size,len;
	
	public Stack(int n ) {
		// TODO Auto-generated constructor stub
		this.size = n;
		this.top = -1;
		this.len = 0;
		arr = new int[size];
	}
	
	public boolean isFull() {
		return top == size-1;
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public int peek() {
		if(isEmpty()) 
			throw new NoSuchElementException("Underflow exception");
		
		return arr[top];
		
	}
	
	public void push(int data) {
		if(top + 1 >= size)
		   throw new IndexOutOfBoundsException("Overflow exception");	
		if(top + 1 < size)
		arr[++top] = data;
		
		len++;
	}
	
	public int pop() {
		if(isEmpty()) {
			throw new NoSuchElementException("Underfow exception");
		}
		return arr[top--];
	}
	
	public void display() {
		System.out.println("\n Stack = ");
		if(len == 0) {
			System.out.println("Empty \n");
			return;
		}			
		
		for (int i = top; i >= 0; i--) {
			System.out.println(arr[i]+" ");
		}
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		Stack stack = new Stack(4);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		stack.display();
		
		System.out.println(stack.peek());
		
		System.out.println(stack.pop());
		stack.display();
		
		stack.pop();
		stack.pop();
		stack.pop();
		
	}

}
