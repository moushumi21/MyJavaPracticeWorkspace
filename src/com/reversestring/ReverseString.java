package com.reversestring;

public class ReverseString {

	static String word = "HELLO";
	// static char[] abc = word.toCharArray();

	public static void main(String[] args) {
		reverseString();
		reverseStringChar();
	}

	// in this method even though it's printing as OLLEH(because we used print),
	// it's actually char not string
	public static void reverseStringChar() {
		char[] abc = word.toCharArray();
		for (int i = (abc.length - 1); i >= 0; i--) {
			System.out.print(abc[i]);
		}
	}

	// to print this as string we use this method
	public static void reverseString() {
		char[] abc = word.toCharArray();
		String var = "";
		for (int i = (abc.length - 1); i >= 0; i--) {
			var = var + abc[i];
		}
		System.out.print(var);
	}

}
