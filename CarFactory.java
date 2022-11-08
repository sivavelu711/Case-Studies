package com.te.javabasics.abstraction;

import java.util.Scanner;

public class CarFactory {
	    static Scanner scanner=new Scanner(System.in);
	
		public static Car getCar() {
			System.out.println(" Enter the Car name ");
			String carName=scanner.next();
			if(carName.equalsIgnoreCase("audi")) {
				return new Audi();
			}else if (carName.equalsIgnoreCase("bmw")) {
				return new Bmw();
			}else {
			    return	null;
			}
			
		}
		
	}
	


	


