package id311148720_id207324547;

import java.util.Vector;

public class ArrayFunction<T extends Object> {
	private final int ENLARGE_FACTOR = 2;
	private T[] arr;
	private int currentSize;

	public ArrayFunction() {
		arr = (T[]) new Object[ENLARGE_FACTOR];
		currentSize = 0;
	}

	public void add(T newValue) {
		if (currentSize == arr.length)
			enlargeArray();
		arr[currentSize] = newValue;
		currentSize++;
	}

	private void enlargeArray() {
		T[] temp = (T[]) new Object[arr.length * ENLARGE_FACTOR];
		for (int i = 0; i < arr.length; i++)
			temp[i] = arr[i];
		arr = temp;
	
	
		
		
}
	public int getCurrentSize() {return currentSize;}
	public T get(int index) {return arr[index];}
	public T[] getAll() {
		
		return arr;
		}
	
	
	public int capacity() {return arr.length;}
	
}