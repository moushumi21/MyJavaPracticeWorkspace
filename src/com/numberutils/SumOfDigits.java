package com.numberutils;

public class SumOfDigits {

	public static void main(String[] args) {
		System.out.println(sumOfDigits(12345));

	}

	public static int sumOfDigits(int number) {
		if (number < 0) {
			return -1;
		}
		if (number == 0) {
			return 0;
		}

		int sum = 0;

		while (number > 0) {
			sum = sum + number % 10;
			number = number / 10;
		}
		return sum;
	}

}
