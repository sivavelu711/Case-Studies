package com.te.collectionframework.arraylist;

import java.util.Comparator;

public class Student02Compare implements Comparator<Student02> {

	@Override
	public int compare(Student02 o1, Student02 o2) {
		// TODO Auto-generated method stub
		return o1.studentId-o2.studentId;
	}

}
