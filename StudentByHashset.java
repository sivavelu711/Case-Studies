package com.te.collectionframework.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class StudentByHashset {
	static Scanner scanner = new Scanner(System.in);
	static int studentId;
	static String studentName;
	static int studentAge;
	static int studentMarks;
	static HashSet<Student02> arrays;
	static ArrayList<Student02> arrays1;

	static boolean condition = true;

	public static void main(String[] args) {
		arrays1 = new ArrayList<Student02>();

		records();

		do {
			System.out.println("\nIf you continue to add ...type yes if not ...type no\n");
			String s = scanner.next();
			if (s.equalsIgnoreCase("YES")) {
				records();
			} else if (s.equalsIgnoreCase("NO")) {
				System.out.println("THANK YOU");
				condition = false;
			}

		} while (condition);
		System.out.println("......fetching the data one by one.........");
		Collections.sort(arrays1, new Student02Compare());
		arrays = new HashSet<Student02>(arrays1);

		for (Student02 hs : arrays) {// not allowed duplicate values
			System.out.println(hs);
		}

	}

	public static void records() {
		int id = againId();

		String name = againName();

		int age = againAge();

		int marks = againMarks();

		arrays1.add(new Student02(id, name, age, marks));
		System.out.println(arrays1);

	}

	public static int againId() {
		System.out.println("Enter Id ");

		studentId = scanner.nextInt();
		return studentId;
	}

	public static String againName() {
		System.out.println("Enter Name");

		studentName = scanner.next();
		return studentName;
	}

	public static int againAge() {
		System.out.println("Enter Age");

		studentAge = scanner.nextInt();
		return studentAge;
	}

	public static int againMarks() {
		System.out.println("Enter Marks");

		studentMarks = scanner.nextInt();
		return studentMarks;
	}

}
