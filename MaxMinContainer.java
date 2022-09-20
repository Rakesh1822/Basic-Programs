package com.te.javahandson.basic;

class MaxMinHolder {
	int max;
	int min;

	public String toString() {
		return "max = " + max + " Min = " + min;
	}
}
public class MaxMinContainer {
	public static MaxMinHolder findMaxMin(int[] arr) {
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
		MaxMinHolder hold = new MaxMinHolder();
		hold.max = max;
		hold.min = min;
		return hold;

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 22, 7 };
		System.out.println(findMaxMin(arr));

	}

}
