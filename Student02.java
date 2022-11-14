package com.te.collectionframework.arraylist;

import java.util.Objects;

public class Student02 {

	int studentId;
	String studentName;
	int studentAge;
	int studentMarks;
	
	public Student02(int studentId, String studentName, int studentAge, int studentMarks) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentMarks = studentMarks;
	}
	
	

	@Override
	public String toString() {
		return "Student02 studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ ", studentMarks=" + studentMarks + "";
	}


	@Override
	public int hashCode() {

		return studentId ;
	}


	@Override
	public boolean equals(Object obj) {
		
		Student02 other = (Student02) obj;
		if (studentId != other.studentId)
			return false;
		if (studentId==other.studentId) {
			try {
				throw new ExceptionStudent("Wrong!!Wrong!! Enter Properly.... Invalid enter ");   
			} catch (ExceptionStudent e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
			
		}
		return true;
	}
  



   
  

}
