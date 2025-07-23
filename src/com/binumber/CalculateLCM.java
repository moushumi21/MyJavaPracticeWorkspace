package com.binumber;

public class CalculateLCM {

	public static void main(String[] args) {
		System.out.println(calculateLCM(14, 20));
	}

	public static int calculateLCM(int number1, int number2) {
		if (number1 < 0 || number2 < 0) {
			return -1;
		}
		if (number1 == 0 || number2 == 0) {
			return 0;
		}

		int max = Math.max(number1, number2);

		if (max % number1 == 0 && max % number2 == 0) {
			return max;
		}

//		int multiple = 1;
//		while (true) {
//			int product = max * multiple;
//			if (product % number1 == 0 && product % number2 == 0) {
//				return product;
//			}
//			multiple++;
//		}
		int min = Math.min(number1, number2);
		for (int i = 1; i <= min; i++) {
			if ((max * i) % number1 == 0 && (max * i) % number2 == 0) {
				return (max * i);
			}
		}
		return 1;
	}
}