package com.te.collectionframework.arraylist;

public class Student{


	int studentId;
	String studentName;
	int studentAge;
	int studentMarks;
	
	public Student(int studentId, String studentName, int studentAge, int studentMarks) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentMarks = studentMarks;
	}
	

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ ", studentMarks=" + studentMarks + "]";
	}




}
