package com.te.collectionframework.arraylist;

import java.util.Comparator;

public class StudentMarks implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.studentMarks-o2.studentMarks;
	}

}
