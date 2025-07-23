package com.stringpractice;

public class PrintAllCharactersInSeparateLines {

	public static void main(String[] args) {
		printCharactersInSeparateLines("This is a lot of Text");

	}

	public static String printCharactersInSeparateLines(String bigString) {

		for (int i = 0; i < bigString.length(); i++) {
			System.out.println(bigString.charAt(i));
		}
		return bigString;
	}
}
