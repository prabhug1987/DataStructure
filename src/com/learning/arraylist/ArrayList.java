package com.learning.arraylist;

import java.util.Arrays;

public class ArrayList<E> {
	private static final int INITIAL_CAPACITY = 10;
	private int size = 0;
	private Object elementData[] = {};
		
	public ArrayList() {
		// TODO Auto-generated constructor stub
		elementData = new Object[INITIAL_CAPACITY];
	}
	
	public void add(E e) {
		
		if(size == elementData.length) {
			ensureCapacity();
		}
		
		elementData[size++] = e;
	}
	
	private void ensureCapacity() {
		int newIncreasedCapacity = elementData.length * 2;
		elementData = Arrays.copyOf(elementData, newIncreasedCapacity);
	}
	
	public E get(int index) {
		if(index < 0 || index >=size ) {
			throw new IndexOutOfBoundsException("Index :"+ index +" Size : "+ index);
		}
		
		return (E) elementData[index];
	}
	
	public Object remove(int index) {
		if(index < 0 || index >= size ) {
			 throw new IndexOutOfBoundsException("Index: " + index + ", Size "
                     + index);
		}
		
		Object removedElement = elementData[index];
		for (int i = index; i < size - 1; i++) {
			elementData[i] = elementData[i+1];
		}
		
		size--;
		
		return removedElement;
	}
	
	public void display() {
		System.out.println("Display list : ");
		for (int i = 0; i < size; i++) {
			System.out.println(elementData[i] + " ");
		}
	}
	
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(3);
		list.add(2);
		
		System.out.println("The removed element is ");
		list.remove(5);
		
		list.display();
	}
}
