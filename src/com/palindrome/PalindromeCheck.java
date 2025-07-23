package com.palindrome;

public class PalindromeCheck {

	static String word = "121";

	public static void main(String[] args) {
		palindromeCheck();

	}

	public static void palindromeCheck() {
		char[] wordChar = word.toCharArray();
		String reversedWord = "";
		for (int i = (wordChar.length - 1); i >= 0; i--) {
			reversedWord = reversedWord + wordChar[i];
		}
		if (reversedWord.equalsIgnoreCase(word)) {
			System.out.println("The word " + word + " is a Palindrome");
		} else {
			System.out.println("The word " + word + " is not a palindrome");
		}
	}
}
