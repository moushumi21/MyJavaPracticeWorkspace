package com.binumber;

public class CalculateGCD {
	public static void main(String[] args) {
		System.out.println(calculateBCD(12, 30));
	}

	private static int calculateBCD(int num1, int num2) {
		if (num1 < 0 || num2 < 0) {
			return -1;
		}
		if (num1 == 0 || num2 == 0) {
			return 1;
		}

		int min = Math.min(num1, num2);
		if (num1 % min == 0 && num2 % min == 0) {
			return min;
		}

		for (int i = (min - 1); i >= 1; i--) {
			if (num1 % i == 0 && num2 % i == 0) {
				return i;
			}
		}
		return -1;
	}
}
// This is branch1 in github. for practicing github. branch1