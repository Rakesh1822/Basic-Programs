package com.te.javahandson.basic;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 4, 22, 7 };
		int max = 0;
		int min;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		min = max;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
	
		System.out.println("The maximum number is :" + max + " minimun number is : " + min);

		m1();
	}
	public static void m1()
	{
		return ;
	}

}
