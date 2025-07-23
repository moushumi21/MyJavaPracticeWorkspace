package com.forloop;

public class MyNumber {

	int aNumber;

	public MyNumber(int aNumber) {
		this.aNumber = aNumber;
	}

	public boolean isPrime() {

		if (aNumber <= 1) {
			return false;

		}
		for (int i = 2; i < aNumber; i++) {
			if (aNumber % i == 0) {
				return false;
//				System.out.println("Not Prime");
//				break;
			}
//			System.out.println("Prime");
//			break;
		}
		return true;
	}

	public int sumUptoN() {

		int sum = 0;
		for (int i = 1; i <= aNumber; i++) {
			sum += i;
		}
		return sum;
	}

	public int sumOfTheDivisors() {
		int sum = 0;
		for (int i = 2; i < aNumber; i++) {
			if (aNumber % i == 0) {
				sum += i;
			}

		}
		return sum;

	}

	public void triangleOfNumbers() {

		for (int i = 1; i <= aNumber; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");

			}
			System.out.println();
		}
	}
}
