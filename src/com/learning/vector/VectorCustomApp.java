package com.learning.vector;

public class VectorCustomApp {

	public static void main(String[] args) {
		VectorCustom<Integer> list = new VectorCustom<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		list.display();

		System.out.println("\n element at index 1 = " + list.get(1));
		System.out.println("\n element removed from index 1 = " + list.remove(1));
		System.out.println("\n let's display list again after removal at index 1");
		list.display();
	}

}
