package com.looppractice;

public class LoopPractice {

	public static void main(String[] args) {
		// printStarCertainTimes(10);
		// printMultipleOfSeven();
		feloop();
	}

	public static void printStarCertainTimes(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println("*");
		}
	}

	public static void printMultipleOfSeven() {
		for (int i = 7; i <= 700; i = i + 7) {
			System.out.println(i);
		}
	}

	// for each loop
	public static void feloop() {
		String[] students = { "a", "b", "c", "d" };
		for (String x : students) {
			System.out.println(x);
		}
	}

}
