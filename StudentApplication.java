package com.te.collectionframework.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class StudentApplication {
    static	ArrayList<Student> arrayList;
    static 	HashSet<Student> hashset;
    static int choose;
    static boolean condition=true;
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args)throws Exception {
		arrayList = new ArrayList<Student>();
		arrayList.add(new Student(157, "Gayle",18,90));
		arrayList.add(new Student(111, "Kholi",16,97));
		arrayList.add(new Student(115, "Allen",19,95));
		arrayList.add(new Student(250, "Sachin",17,86));
		arrayList.add(new Student(166, "Dhawan",15,100));
		arrayList.add(new Student(166, "Dhawan",15,100));
		studentRecords();
		do {
			System.out.println("\nDO YOU WANT AGAIN\nPLEASE TYPE YES OR NO");
			String s=scanner.next();
			if (s.equalsIgnoreCase("YES")) {
				studentRecords();
			}else if (s.equalsIgnoreCase("NO")) {
				System.out.println("THANK YOU");
				condition=false;
			}else {
				throw new InvalidWordException("invalid word!!!");
				
			}
			
		} while (condition);
	}
	
	public static void studentRecords() {
		
	
	
	System.out.println("1.ID\n2.NAME\n3.AGE\n4.MARKS");
	System.out.println("ENTER THE NUMBER");
	 choose=scanner.nextInt();
	 
	 
	 switch (choose) {
	case 1:
		//System.out.println("STUDENT ID");
	      Collections.sort(arrayList, new StudentId());
	    	for (Student student1 : arrayList) {
	  		System.out.println(student1);

	  	}
		break;
	case 2:
		System.out.println("STUDENT NAME");
	    Collections.sort(arrayList, new StudentName());
		for (Student student1 : arrayList) {
			System.out.println(student1);

		}
		break;
	case 3:
		System.out.println("STUDENT AGE");
	    Collections.sort(arrayList, new StudentAge());
		for (Student student1 : arrayList) {
			System.out.println(student1);

		}
		break;
	case 4:
		System.out.println("STUDENT MARKS");
	    Collections.sort(arrayList, new StudentMarks());
		for (Student student1 : arrayList) {
			System.out.println(student1);

		}
		break;

	default:
		System.out.println("PLEASE ENTER VALID NUMBER");
		break;
	}
	
      
	}

}
