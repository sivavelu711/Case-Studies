package com.te.javabasics.abstraction;

public class Main {
	public static void main(String[] args) {
		Car audi=new Audi();
		audi.accelerator();
		audi.breaks();
		audi.gears();
		Bmw bmw=new Bmw();
		bmw.accelerator();
		bmw.breaks();
		bmw.gears();
		}

}
