package com.learning.hashmap;

public class HashSet<E> {
	private HashMap<E, Object> hashMap;
	
	public HashSet() {
		// TODO Auto-generated constructor stub
		hashMap = new HashMap<>();
	}
	
    public void  add(E value) {
    	hashMap.put(value, null);
    }
    
    public boolean contains(E obj) {
    	return hashMap.contains(obj)!=null? true : false;
    }
    
    public void display() {
    	hashMap.displaySet();
    }
    
    public boolean remove(E obj) {
    	return hashMap.remove(obj);
    }

}
