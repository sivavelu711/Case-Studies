package com.te.javabasics.abstraction;

public class MainDriver {
	public static void main(String[] args) {
		Car car=CarFactory.getCar();
		CarTest car2=new CarTest();
		car2.carTest(car);
	
	}

}
