package com.te.collectionframework.arraylist;

public class MyArrayListTest {

	private Object[] array;
	private int position;

	public MyArrayListTest(int arraySize) {
		// TODO Auto-generated constructor stub
		this.array = new Object[arraySize];
	}

	public void addElements(Object element) {
		if (this.position>=this.array.length) {
			growArray();
			
		}
		this.array[position++] = element;
	}

	public Object get(int index) {
		return this.array[index];
	}

	public int size() {
		return this.position;
	}
	private void growArray() {
		Object[] temp= new Object[this.array.length+5];
		System.arraycopy(this.array, 0 , temp, 0 , this.array.length);
		array=temp;
	}
}
