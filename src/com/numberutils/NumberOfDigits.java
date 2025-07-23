package com.numberutils;

public class NumberOfDigits {

	public static void main(String[] args) {
		System.out.println(numberOfDigits(8594));

	}

//	public static int numberOfDigits(int number) {
//		if (number < 0) {
//			return -1;
//		}
//
//		String numberString = String.valueOf(number);
//		char[] chararray = numberString.toCharArray();
//		int numberOfDigits = chararray.length;
//		System.out.println(numberOfDigits);
//		return numberOfDigits;
//	}

	public static int numberOfDigits(int number) {
		if (number < 0) {
			return -1;
		}
		if (number == 0) {
			return 1;
		}

		int numberOfDigits = 0;

		while (number > 0) {
			number = number / 10;
			numberOfDigits++;
		}
		return numberOfDigits;
	}
}
