package com.te.javahandson.basic;

public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 20;
		int c = -10;
		int d = 3;
		int e = 49;
		int greatest = a > b && a > c && a > d && a > e ? a
				              : b > c && b > c && b > e ? b 
						               : c > d && c > e ? c
								                : d > e ? d 
									                 	: e;
		System.out.println(greatest);
		System.out.println(b);

	}
	
}
