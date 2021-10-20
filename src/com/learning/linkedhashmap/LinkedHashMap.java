package com.learning.linkedhashmap;

public class LinkedHashMap<K,V> {

	private Entry<K, V>[] table;
	private int capacity = 4;
	private Entry<K, V> header;
	private Entry<K, V> last;

	static class Entry<K, V> {
		K key;
		V value;
		Entry<K, V> next;
		Entry<K, V> before, after;

		public Entry(K key, V value, Entry<K, V> next) {
			this.key = key;
			this.value = value;
			this.next = next;
		}
	}
	
	public LinkedHashMap() {
		// TODO Auto-generated constructor stub
		table = new Entry[capacity];
	}
	
	public void put(K key, V value) {
		
		if(key == null) {
			return;
		}
		int hash = hash(key);
		Entry<K, V> newEntry = new Entry<K, V>(key, value, null);
		maintainOrderAfterInsert(newEntry);
				
	}
	
	private void maintainOrderAfterInsert(Entry<K, V> newEntry) {
		// TODO Auto-generated method stub
		
		
	}

	private int hash(K key) {
		// TODO Auto-generated method stub
		return Math.abs(key.hashCode()) % capacity;
	}

	public V get(K key) {
		
		
		return V;
	}
	
	public void remove(K key) {
		
	}
	

}
