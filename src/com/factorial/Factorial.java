package com.factorial;

public class Factorial {

	int number;

	public Factorial(int number) {
		this.number = number;
	}

	public int factorial() {

		if (number < 0) {
			return -1;
		} else if (number == 0) {
			return 1;
		}

		int factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial = factorial * i;

		}
		System.out.println(factorial);
		return factorial;
	}
}
