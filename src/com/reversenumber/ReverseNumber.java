package com.reversenumber;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseNumber(1000));
	}

	public static int reverseNumber(int number) {
		if (number < 0) {
			return -1;
		}
		if (number == 0) {
			return 0;
		}
		int reversedNumber = 0;
		while (number > 0) {
			reversedNumber = reversedNumber * 10 + number % 10;
			number = number / 10;
		}
		return reversedNumber;
	}
}
