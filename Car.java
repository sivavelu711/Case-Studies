package com.te.javabasics.abstraction;

public interface Car {
	
	void accelerator();
	void breaks();
	void gears();
	default void airbag() {
		System.out.println("airbag is there dont worry");
		
	}
	default void gps() {
		System.out.println("alert alert gps is there... run away");
	}

}
