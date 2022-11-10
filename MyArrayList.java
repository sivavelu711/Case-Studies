package com.te.collectionframework.arraylist;

public class MyArrayList {

	public static void main(String[] args) {
		MyArrayListTest myArrayListTest = new MyArrayListTest(5);
		myArrayListTest.addElements(5);
		myArrayListTest.addElements(12);
		myArrayListTest.addElements(21);
		myArrayListTest.addElements(2);
		myArrayListTest.addElements(2);
		myArrayListTest.addElements(2);
		myArrayListTest.addElements(2);
		myArrayListTest.addElements(2);
		myArrayListTest.addElements(2);
		myArrayListTest.addElements(2);
		myArrayListTest.addElements(2);
		myArrayListTest.addElements(2);
		myArrayListTest.addElements(2);
		myArrayListTest.addElements(2);
		myArrayListTest.addElements(2);
		myArrayListTest.addElements(2);
		myArrayListTest.addElements(2);
		System.out.println("size is " + myArrayListTest.size());
		for (int i = 0; i < myArrayListTest.size(); i++) {
			System.out.println(myArrayListTest.get(i));
		}
	}

}
