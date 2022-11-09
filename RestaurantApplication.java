package com.te.restaurantapplication;

import java.util.Arrays;

import java.util.Scanner;

public class RestaurantApplication {
	Scanner scanner = new Scanner(System.in);
	
	String[] s = new String[] { "Dosa    ", "Noodles    ", "Idly   ", "Poori     ", "Pulav    ", "pizza     " };
	int[] rate = new int[] { 30, 110, 40, 30, 25, 400 };
	int[] qt = new int[6];
	int ch = 0;
	int sum = 0;
	boolean exit = true;
	boolean flow = true;
	void order() {
		try {
		while (exit) {
			System.out.println("!! Are you Ready to Taste!!\n Enter The Number ");
		ch = scanner.nextInt();
		if(ch<=rate.length-1) {
		switch (ch) {
		case 1:
			System.out.println("How Much Plates you Need " + s[ch - 1]);
			qt[ch - 1] += scanner.nextInt();
			sum += qt[ch - 1] * rate[ch - 1];
			System.out.println(
					s[ch - 1] + "*     " + qt[ch - 1] + "=" + "   " + qt[ch - 1] * rate[ch - 1] + "rs");

			break;
		case 2:
			System.out.println("How Much Plates you Need " + s[ch - 1]);
			qt[ch - 1] += scanner.nextInt();
			sum += qt[ch - 1] * rate[ch - 1];
			System.out.println(
					s[ch - 1] + "*     " + qt[ch - 1] + "=" + "   " + qt[ch - 1] * rate[ch - 1] + "rs");
			break;
		case 3:
			System.out.println("How Much Plates you Need " + s[ch - 1]);
			qt[ch - 1] += scanner.nextInt();
			sum += qt[ch - 1] * rate[ch - 1];
			System.out.println(
					s[ch - 1] + "*     " + qt[ch - 1] + "=" + "   " + qt[ch - 1] * rate[ch - 1] + "rs");
			break;
		case 4:
			System.out.println("How Much Plates you Need " + s[ch - 1]);
			qt[ch - 1] += scanner.nextInt();
			sum += qt[ch - 1] * rate[ch - 1];
			System.out.println(
					s[ch - 1] + "*     " + qt[ch - 1] + "=" + "   " + qt[ch - 1] * rate[ch - 1] + "rs");
			break;
		case 5:
			System.out.println("How Much Plates you Need " + s[ch - 1]);
			qt[ch - 1] += scanner.nextInt();
			sum += qt[ch - 1] * rate[ch - 1];
			System.out.println(
					s[ch - 1] + "*     " + qt[ch - 1] + "=" + "   " + qt[ch - 1] * rate[ch - 1] + "rs");
			break;
		case 6:
			System.out.println("How Much Plates you Need " + s[ch - 1]);
			qt[ch - 1] += scanner.nextInt();
			sum += qt[ch - 1] * rate[ch - 1];
			System.out.println(
					s[ch - 1] + "*     " + qt[ch - 1] + "=" + "   " + qt[ch - 1] * rate[ch - 1] + "rs");
			break;

		default:
			System.out.println("How Much Plates you Need " + s[ch - 1]);
			qt[ch - 1] += scanner.nextInt();

			break;
		}
		
		System.out.println("Current Billing Amount=" + sum);
		System.out.println("if you want to continue the order");
		System.out.println("if yes press YES (or) if no press NO");
		char valid = scanner.next().charAt(0);
		if(valid=='n' || valid =='N' ) {
			
			System.out.println("Final Billing Amount=" + sum);
			exit=false;
		}
			
		
	} else {
	throw new Rough("invalid entry");
	}
		}
		
	} catch (Rough e) {
		
	System.out.println(e.getMessage());
	}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		RestaurantApplication restaurantApplication = new RestaurantApplication();
		System.out.println("Welcome to Hyderabadi Restaurant");
		System.out.println("MENU" + "\t\t\tPrice");
		for (int i = 0; i < 6; i++) {
			System.out.println((i + 1) + "." + restaurantApplication.s[i] + "\t\t" + restaurantApplication.rate[i]);
		}
		restaurantApplication.order();

//			System.out.println("Current Billing Amount=" + sum);
//
//			if (ch<=6) {
//				System.out.println("Your Order Is Successfull!!");
//			}else {
//				System.out.println("Please check number");
//			}
//			
//		} while (flow);
//		
//	}
	}
}
