package com.chardatatypeexercise;

public class MyChar {

	char ch;

	public MyChar(char ch) {
		this.ch = ch;
	}

	public boolean isVowel() {

		char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };

		for (char ch : vowels) {
			if (this.ch == ch) {
				return true;
			}
		}
		return false;
	}

	public boolean isAlphabet() {

		if ((ch >= 97 && ch <= 122) || (ch >= 65 && ch <= 90)) {
			return true;// using the values of the characters
		}
		return false;
		// char[] alphabets = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
		// 'l', 'm', 'n', 'o', 'p', 'q', 'r',
		// 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G',
		// 'H', 'I', 'J', 'K', 'L', 'M',
		// 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

		// for (char ch : alphabets) {
		// if (this.alphabet == ch) {
		// return yes;
		// }
		// }

	}

	public static void printLowerCaseAlphabets() {
		// char[] lowerCaseAlphabets = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
		// 'j', 'k', 'l', 'm', 'n', 'o', 'p',
		// 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		// System.out.println(lowerCaseAlphabets);
		// for (char ch : lowerCaseAlphabets) {
		// System.out.print(ch + " ");
		// }
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(ch + " ");
		}
		System.out.println();
	}

	public static void printUpperCaseAlphabets() {
		// char[] UpperCaseAlphabets = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
		// 'J', 'K', 'L', 'M', 'N', 'O', 'P',
		// 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		// for (char ch : UpperCaseAlphabets) {
		// System.out.print(ch + " ");
		// }
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch + " ");
		}
		System.out.println();
	}

	public boolean isDigit() {
		if ((ch >= 48 && ch <= 57)) {
			return true;// using the values of the characters
		}
		return false;
	}

	public boolean isConsonant() {
		if (isAlphabet() && !(isVowel())) {
			return true;
		}
		return false;
	}

}
