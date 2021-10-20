package com.learning.hashmap;

public class HashMap<K, V> {

	private Entry<K, V>[] table;
	private int capacity = 4;

	public HashMap() {
		// TODO Auto-generated constructor stub
		table = new Entry[capacity];
	}

	public void put(K key, V data) {
		if (key == null)
			return;

		int hash = hash(key);

		Entry<K, V> newEntry = new Entry<K, V>(key, data, null);

		if (table[hash] == null) {
			table[hash] = newEntry;
		} else {
			Entry<K, V> previous = null;
			Entry<K, V> current = table[hash];
			while (current != null) {
				if (current.key.equals(key)) {
					if (previous == null) {
						newEntry.next = current.next;
						table[hash] = newEntry;
						return;
					} else {
						newEntry.next = current.next;
						previous.next = newEntry;
						return;
					}
				}
				previous = current;
				current = current.next;
			}

			previous.next = newEntry;
		}

	}

	public V get(K key) {
		int hash = hash(key);
		if (table[hash] == null) {
			return null;
		} else {
			Entry<K, V> temp = table[hash];
			while (temp != null) {
				if (temp.getKey().equals(key))
					return temp.getValue();
				temp = temp.next;
			}
		}
		return null;
	}

	/*
	 * Method removes key -value pair from hashmap
	 */
	public boolean remove(K deleteKey) {

		int hash = hash(deleteKey);

		if (table[hash] == null) {
			return false;
		} else {
			Entry<K, V> previous = null;
			Entry<K, V> current = table[hash];

			while (current != null) {
				if (current.getKey().equals(deleteKey)) {
					if (previous == null) {
						table[hash] = table[hash].next;
						return true;
					} else {
						previous.next = current.next;
						return true;
					}
				}
				previous = current;
				current = current.next;
			}
			return false;
		}
	}

	public K contains(K key) {
		int hash = hash(key);
		if (table[hash] == null) {
			return null;
		} else {
			Entry<K, V> temp = table[hash];
			while (temp != null) {
				if (temp.getKey().equals(key))
					return key;

				temp = temp.next;
			}
			return null;
		}
	}

	public void display() {

		for (int i = 0; i < capacity; i++) {
			if (table[i] != null) {
				Entry<K, V> entry = table[i];
				while (entry != null) {
					System.out.print("{" + entry.key + "=" + entry.value + "}" + " ");
					entry = entry.next;
				}
			}
		}

	}

	public void displaySet() {

		for (int i = 0; i < capacity; i++) {
			if (table[i] != null) {
				Entry<K, V> entry = table[i];
				while (entry != null) {
					System.out.print(entry.key + " ");
					entry = entry.next;
				}
			}
		}

	}

	private int hash(K newKey) {
		// TODO Auto-generated method stub
		return Math.abs(newKey.hashCode()) % this.capacity;
	}

}
