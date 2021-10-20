package com.learning.vector;

import java.util.Arrays;

/*
 * 
 */
public class VectorCustom<E> {
	private static final int INITIAL_CAPACITY = 10;
	private Object elementData[] = {};
	private int size = 0;

	/**
	 * constructor
	 */
	public VectorCustom() {
		elementData = new Object[INITIAL_CAPACITY];
	}

	/*
	 * methods adds elements in VectorCustom
	 */
	public synchronized void add(E e) {
		if (size == elementData.length) {
			ensureCapacity(); // increase current capacity of list, make it double
		}

		elementData[size++] = e;
	}

	/*
	 * method displays all the elements in the list
	 */
	public void display() {
		System.out.println("Displaying list");
		for (int i = 0; i < size; i++) {
			System.out.println(elementData[i]);
		}
	}

	/*
	 * method increases capacity of list by making it double
	 */
	public synchronized void ensureCapacity() {
		int newIncreasedCapacity = elementData.length * 2;
		elementData = Arrays.copyOf(elementData, newIncreasedCapacity);
	}

	/*
	 * method returns element on specific index
	 */
	@SuppressWarnings("unchecked")
	public synchronized E get(int index) {
		if (index < 0 || index >= size) { // if the index is negative or greater than size of size, we throw exception
			throw new IndexOutOfBoundsException("Index : " + index + " size " + index);
		}

		return (E) elementData[index];
	}

	/*
	 * method returns removedElement on specific index
	 * else it throws IndexOutOfBoundException if index 
	 */
	public synchronized Object remove(int index) {
		if (index < 0 || index >= size) { // if the index is negative or greater than size of size, we throw exception
			throw new IndexOutOfBoundsException("Index : " + index + " size " + index);
		}

		Object removedElement = elementData[index];
		for (int i = index; i < size - 1; i++) {
			elementData[i] = elementData[i + 1];
		}

		size++; // reduce size of VectorCustom after removal of element
		return removedElement;

	}

}
