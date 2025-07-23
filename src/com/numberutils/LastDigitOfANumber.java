package com.numberutils;

public class LastDigitOfANumber {

	public static void main(String[] args) {
		getLastDigit(7);

	}

//	public static int getLastDigit(int number) {
//
//		if (number < 0) {
//			return -1;
//		}
//		String numberToString = String.valueOf(number);
//		// System.out.println(numberToString);
//		char[] chararray = numberToString.toCharArray();
//
//		char lastDigit = (chararray[chararray.length - 1]);
//		System.out.println(lastDigit);
//		return 0;
//
//	}

	public static int getLastDigit(int number) {
		System.out.println(number % 10);
		return number % 10;
	}
}
